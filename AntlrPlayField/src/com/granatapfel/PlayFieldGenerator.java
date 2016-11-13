package com.granatapfel;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

// Main = CodeGenerator with antlr classes
public class PlayFieldGenerator extends PlayFieldBaseListener {

    private int rowSize    =  7;
    private int columnSize =  7;
    private int row        = -1;
    private int column     = -1;
    private String code    = "";
    private String generatedFileName = "PlayFieldCreator";

    public static void main(String[] args) throws FileNotFoundException, IOException { // Get CSV lexer

        // Get a list of matched tokens
        PlayFieldLexer lexer = new PlayFieldLexer(new ANTLRInputStream(new FileReader("csv_files/playfield.csv")));
        // Pass the tokens to the parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayFieldParser parser = new PlayFieldParser(tokens);
        // Specify our entry point
        PlayFieldParser.FileContext fileContext = parser.file();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        PlayFieldBaseListener listener = new PlayFieldGenerator();
        walker.walk(listener, fileContext);
    }

    private void throwError(String what) throws Error {
        // dont befuddle the main code with string deserts
        switch (what) {
            case "ROWS"   : throw new Error("Playfield doesnt contains exactly " + rowSize + ", but " + row + " rows");
            case "COLUMNS": throw new Error("Playfield has a role with not exactly" + columnSize + ", but " + column + " columns");
            default:
                throw new Error(what);
        }
    }

    @Override public void enterFile(PlayFieldParser.FileContext ctx) {
        // begin class code
        code += "public class PlayFieldCreator {\n" +
                "\tpublic static int [][] createPlayField() {\n" +
                "\t\tint[][] field = new int["+ rowSize +"]["+ columnSize +"];\n";
    }

    @Override public void enterValue(PlayFieldParser.ValueContext ctx) {
        column++;

        // value is either 's' or 'w' through grammar
        String fieldValue = ctx.children.get(0).getText();
        // add dynamic code part
        code += "\t\tfield["+ row +"]["+ column +"] = " + (fieldValue.equals("s") ? 1 : 0) + ";\n";
    }

    @Override public void enterRow(PlayFieldParser.RowContext ctx) {
        row++;
    }

    @Override public void exitRow(PlayFieldParser.RowContext ctx) {
        if (column != columnSize - 1)
            throwError("COLUMNS");

        column = -1; // reset for next row
    }

    @Override public void exitFile(PlayFieldParser.FileContext ctx) {
        if (row != rowSize - 1)
            throwError("ROWS");

        System.out.println("If no error outputs occurred, then the following file has valid format:");
        System.out.println(ctx.getText());

        // finish class code
        code += "\t\treturn field;\n\t}\n}\n";

        // write code to a .java file
        System.out.println("Generating code ...");
        try {
            FileWriter out = new FileWriter(generatedFileName +".java", false);
            out.write(code);
            out.close();
            System.out.println(generatedFileName +".java created.");
        }
        catch (IOException ex) {
            System.out.println("Code generation failed, reason:");
            ex.printStackTrace();
        }
    }
}