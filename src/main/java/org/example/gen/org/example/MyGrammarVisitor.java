// Generated from C:/Users/woute/Documents/GitHub/Technischleerdoel2/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example.gen.org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#agent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgent(MyGrammarParser.AgentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#regel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegel(MyGrammarParser.RegelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#spelsituatie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpelsituatie(MyGrammarParser.SpelsituatieContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#actie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActie(MyGrammarParser.ActieContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#beweeg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeweeg(MyGrammarParser.BeweegContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#valAan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValAan(MyGrammarParser.ValAanContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#richting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRichting(MyGrammarParser.RichtingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#doelwit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoelwit(MyGrammarParser.DoelwitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#vergelijkingsOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVergelijkingsOperator(MyGrammarParser.VergelijkingsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#attribuut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribuut(MyGrammarParser.AttribuutContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#actieWerkwoord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActieWerkwoord(MyGrammarParser.ActieWerkwoordContext ctx);
}