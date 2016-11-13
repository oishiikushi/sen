package com.granatapfel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class KIGenerator extends KIBaseListener {

    private int rowSize = 7;
    private int columnSize = 7;
    private int instructionSize = rowSize * columnSize;    // depends on playfield size
    private List<String> cells = new ArrayList<String>();
    private int numInstructions = 0;
    private String code = "";
    private String generatedFilePath = "../Battleship/src/KICreator.java";

    KIGenerator() {
        String rowCoords = "ABCDEFG";

        // create all free cell strings
        for (int i=0; i<rowSize; i++)
            for (int j=0; j<columnSize; j++)
                cells.add(rowCoords.charAt(i) + Integer.toString(j+1));
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Get a list of matched tokens
        KILexer lexer = new KILexer(new ANTLRInputStream(new FileReader("csv_files/KI.csv")));
        // Pass the tokens to the parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        KIParser parser = new KIParser(tokens);
        // Specify our entry point
        KIParser.FileContext fileContext = parser.file();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        KIBaseListener listener = new KIGenerator();
        walker.walk(listener, fileContext);
    }

    // helper organizing errors
    private void throwError(String what) throws Error {
        // dont befuddle the main code with string deserts
        switch (what) {
            case "NUM_INSTRUCTIONS" : throw new Error("KI doesnt contains exactly " + instructionSize + ", but " + numInstructions + " instructions.");
            case "TWICE_INSTRUCTION": throw new Error("KI contains a doubled instruction.");
            default:
                throw new Error(what);
        }
    }

    @Override public void enterFile(KIParser.FileContext ctx) {
        // begin class code
        code += "public class KICreator {\n" +
                "\tpublic static String[] createKIMoves() {\n" +
                "\t\tString[] instructions = new String["+ instructionSize +"];\n";
    }

    @Override public void enterValue(KIParser.ValueContext ctx) {
        String simpleValue = ctx.SimpleValue().getSymbol().getText();
        // concrete cell case
        String cell;
        if (!simpleValue.contains("per")) {
            cell = simpleValue.substring(4,6);

            if (!cells.contains(cell))
                throwError("TWICE_INSTRUCTION");
        }
        //random cell case
        else {
            cell = cells.get((int)(Math.random() * cells.size()));
        }

        code += "\t\tinstructions["+ (numInstructions - 1) +"] = \"" + cell +"\";\n";
        cells.remove(cell);
    }

    @Override public void enterRow(KIParser.RowContext ctx) {
        numInstructions++;
    }

    @Override public void exitFile(KIParser.FileContext ctx) {
        if (numInstructions != instructionSize)
            throwError("NUM_INSTRUCTIONS");

        System.out.println("If no error outputs occurred, then the following file has valid format:");
        System.out.println(ctx.getText());

        // finish class code
        code += "\t\treturn instructions;\n\t}\n}\n";

        // write code to a .java file
        System.out.println("Generating code ...");
        try {
            FileWriter out = new FileWriter(generatedFilePath, false);
            out.write(code);
            out.close();
            System.out.println(generatedFilePath +" created.");
        }
        catch (IOException ex) {
            System.out.println("Code generation failed, reason:");
            ex.printStackTrace();
        }
    }
}