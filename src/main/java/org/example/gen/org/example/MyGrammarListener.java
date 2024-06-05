// Generated from C:/Users/woute/Documents/GitHub/Technischleerdoel2/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example.gen.org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#agent}.
	 * @param ctx the parse tree
	 */
	void enterAgent(MyGrammarParser.AgentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#agent}.
	 * @param ctx the parse tree
	 */
	void exitAgent(MyGrammarParser.AgentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#regel}.
	 * @param ctx the parse tree
	 */
	void enterRegel(MyGrammarParser.RegelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#regel}.
	 * @param ctx the parse tree
	 */
	void exitRegel(MyGrammarParser.RegelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#spelsituatie}.
	 * @param ctx the parse tree
	 */
	void enterSpelsituatie(MyGrammarParser.SpelsituatieContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#spelsituatie}.
	 * @param ctx the parse tree
	 */
	void exitSpelsituatie(MyGrammarParser.SpelsituatieContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#actie}.
	 * @param ctx the parse tree
	 */
	void enterActie(MyGrammarParser.ActieContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#actie}.
	 * @param ctx the parse tree
	 */
	void exitActie(MyGrammarParser.ActieContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#beweeg}.
	 * @param ctx the parse tree
	 */
	void enterBeweeg(MyGrammarParser.BeweegContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#beweeg}.
	 * @param ctx the parse tree
	 */
	void exitBeweeg(MyGrammarParser.BeweegContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#valAan}.
	 * @param ctx the parse tree
	 */
	void enterValAan(MyGrammarParser.ValAanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#valAan}.
	 * @param ctx the parse tree
	 */
	void exitValAan(MyGrammarParser.ValAanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#richting}.
	 * @param ctx the parse tree
	 */
	void enterRichting(MyGrammarParser.RichtingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#richting}.
	 * @param ctx the parse tree
	 */
	void exitRichting(MyGrammarParser.RichtingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#doelwit}.
	 * @param ctx the parse tree
	 */
	void enterDoelwit(MyGrammarParser.DoelwitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#doelwit}.
	 * @param ctx the parse tree
	 */
	void exitDoelwit(MyGrammarParser.DoelwitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#vergelijkingsOperator}.
	 * @param ctx the parse tree
	 */
	void enterVergelijkingsOperator(MyGrammarParser.VergelijkingsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#vergelijkingsOperator}.
	 * @param ctx the parse tree
	 */
	void exitVergelijkingsOperator(MyGrammarParser.VergelijkingsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#attribuut}.
	 * @param ctx the parse tree
	 */
	void enterAttribuut(MyGrammarParser.AttribuutContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#attribuut}.
	 * @param ctx the parse tree
	 */
	void exitAttribuut(MyGrammarParser.AttribuutContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#actieWerkwoord}.
	 * @param ctx the parse tree
	 */
	void enterActieWerkwoord(MyGrammarParser.ActieWerkwoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#actieWerkwoord}.
	 * @param ctx the parse tree
	 */
	void exitActieWerkwoord(MyGrammarParser.ActieWerkwoordContext ctx);
}