package com.granatapfel;

import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main extends CSVBaseListener {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Get CSV lexer
        CSVLexer lexer = new CSVLexer(new ANTLRInputStream(new FileReader("csv_files/test.csv")));
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        CSVParser parser = new CSVParser(tokens);
        // Specify our entry point
        CSVParser.FileContext fileContext = parser.file();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        CSVBaseListener listener = new Main();
        walker.walk(listener, fileContext);
    }

    public void exitFile(CSVParser.FileContext ctx) {

        System.out.println("If no error outputs occurred, then file has valid format!");
        System.out.println(ctx.getText());
    }
}