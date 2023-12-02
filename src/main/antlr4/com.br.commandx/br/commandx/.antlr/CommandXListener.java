// Generated from c:/Users/breno/OneDrive/Documentos/GitHub/commandx/src/main/antlr4/com.br.commandx/br/commandx/CommandX.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandXParser}.
 */
public interface CommandXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CommandXParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CommandXParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(CommandXParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(CommandXParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(CommandXParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(CommandXParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(CommandXParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(CommandXParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(CommandXParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(CommandXParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(CommandXParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(CommandXParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(CommandXParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(CommandXParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(CommandXParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(CommandXParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CommandXParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CommandXParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CommandXParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CommandXParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CommandXParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CommandXParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CommandXParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CommandXParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CommandXParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CommandXParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CommandXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CommandXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CommandXParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CommandXParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CommandXParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CommandXParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNotExpression(CommandXParser.LogicalNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNotExpression(CommandXParser.LogicalNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CommandXParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CommandXParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(CommandXParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(CommandXParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(CommandXParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(CommandXParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_declaration(CommandXParser.Procedure_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_declaration(CommandXParser.Procedure_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(CommandXParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(CommandXParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(CommandXParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(CommandXParser.Procedure_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CommandXParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CommandXParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CommandXParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CommandXParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CommandXParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CommandXParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(CommandXParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(CommandXParser.TypeDeclarationContext ctx);
}