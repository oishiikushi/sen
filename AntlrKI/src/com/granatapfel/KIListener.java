package com.granatapfel;
// Generated from src/com/granatapfel/KI.g by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KIParser}.
 */
public interface KIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KIParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(KIParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KIParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(KIParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link KIParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(KIParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link KIParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(KIParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link KIParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(KIParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KIParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(KIParser.ValueContext ctx);
}