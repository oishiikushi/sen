/**
 * Created by esko on 22.01.17.
 */
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

// Main = CodeGenerator with antlr classes
public class Main extends PlayFieldBaseListener {

    private int rowSize    = 11;
    private int columnSize = 11;
    private int row        = -1;
    private int column     = -1;
    private String code    = "";
    private String generatedFileName = "gen/GEN_PlayfieldCreator";

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
        PlayFieldBaseListener listener = new Main();
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
        code += "package com.company.model;\n\n" +
                "import com.company.model.Playfield;\n" +
                "import com.company.model.TileType;\n" +
                "import com.company.model.Tile;\n" +
                "public class GEN_PlayfieldCreator {\n" +
                "\tpublic static void createPlayfield(Playfield playfield) {\n" +
                "int sizex = 11;" + // TODO:
                "int sizey = 11;" + // TODO:
                "playfield.setupTiles(sizex, sizey);";
    }

    @Override public void enterValue(PlayFieldParser.ValueContext ctx) {
        column++;

        // value is either 's' or 'w' through grammar
        String fieldValue = ctx.children.get(0).getText();
        // add dynamic code part

        switch (fieldValue) {
            case "0":
                code += "playfield.setTile(" + row + ", " + column + ", new Tile());";
                code += "playfield.getTile(" + row + ", " + column + ")";
                code += ".setType(TileType.NONE)";
                code += ";\n";
                break;
            case "1":
                code += "playfield.setTile(" + row + ", " + column + ", new Tile());";
                code += "playfield.getTile(" + row + ", " + column + ")";
                code += ".setType(TileType.WAY)";
                code += ".setNext(playfield.getTile(0, 2))"; // TODO: read the correct next
                code += ";\n";
                break;
            case "2":
            case "3":
            case "4":
            case "5":
                code += "playfield.setTile(" + row + ", " + column + ", new Tile());";
                code += "playfield.getTile(" + row + ", " + column + ")";
                code += ".setType(TileType.HOME)";
                code += ".setNext(playfield.getTile(0, 2))"; // TODO: read the correct next
                code += ".setPlayerID(" + fieldValue + ")";
                code += ";\n";
                break;
        }
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
        code += "\t\t\n\t}\n}\n";

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
