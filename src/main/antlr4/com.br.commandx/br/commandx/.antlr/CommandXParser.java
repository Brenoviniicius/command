// Generated from c:/Users/breno/OneDrive/Documentos/GitHub/commandx/src/main/antlr4/com.br.commandx/br/commandx/CommandX.g4 by ANTLR 4.13.1
 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.br.commandx.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CommandXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PROGRAM=6, VAR=7, PRINTLN=8, READ=9, 
		FUNC=10, PROC=11, IF=12, ELSE=13, WHILE=14, ADDITIVE_OPERATOR=15, MULTIPLICATIVE_OPERATOR=16, 
		AND=17, OR=18, NOT=19, RELATIONAL_OPERATOR=20, EQUALITY_OPERATOR=21, ASSIGN=22, 
		PAR_OPEN=23, PAR_CLOSE=24, BRACKET_OPEN=25, BRACKET_CLOSE=26, SEMICOL=27, 
		COMMA=28, INTEGER_LITERAL=29, BOOLEAN_LITERAL=30, CHAR_LITERAL=31, STRING_LITERAL=32, 
		FLOAT_LITERAL=33, ID=34, LINE_COMMENT=35, BLOCK_COMMENT=36, WS=37;
	public static final int
		RULE_start = 0, RULE_sentence = 1, RULE_comment = 2, RULE_println = 3, 
		RULE_read_statement = 4, RULE_conditional = 5, RULE_while_loop = 6, RULE_logicalExpression = 7, 
		RULE_logicalOrExpression = 8, RULE_logicalAndExpression = 9, RULE_equalityExpression = 10, 
		RULE_relationalExpression = 11, RULE_additiveExpression = 12, RULE_multiplicativeExpression = 13, 
		RULE_unaryExpression = 14, RULE_primaryExpression = 15, RULE_logicalNotExpression = 16, 
		RULE_var_decl = 17, RULE_var_assign = 18, RULE_function_declaration = 19, 
		RULE_procedure_declaration = 20, RULE_function_call = 21, RULE_procedure_call = 22, 
		RULE_argumentList = 23, RULE_parameterList = 24, RULE_parameter = 25, 
		RULE_typeDeclaration = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sentence", "comment", "println", "read_statement", "conditional", 
			"while_loop", "logicalExpression", "logicalOrExpression", "logicalAndExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primaryExpression", "logicalNotExpression", "var_decl", 
			"var_assign", "function_declaration", "procedure_declaration", "function_call", 
			"procedure_call", "argumentList", "parameterList", "parameter", "typeDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'str'", "'char'", "'float'", "'boolean'", "'program'", 
			"'var'", "'println'", "'read'", "'func'", "'proc'", "'if'", "'else'", 
			"'while'", null, null, "'&&'", "'||'", "'!'", null, null, "'='", "'('", 
			"')'", "'{'", "'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "PROGRAM", "VAR", "PRINTLN", "READ", 
			"FUNC", "PROC", "IF", "ELSE", "WHILE", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", 
			"AND", "OR", "NOT", "RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "ASSIGN", 
			"PAR_OPEN", "PAR_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "SEMICOL", 
			"COMMA", "INTEGER_LITERAL", "BOOLEAN_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"FLOAT_LITERAL", "ID", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CommandX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public CommandXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode PROGRAM() { return getToken(CommandXParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CommandXParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CommandXParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PROGRAM);
			setState(55);
			match(ID);
			setState(56);
			match(BRACKET_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> symbolTable = new HashMap<String, Object>();
					
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259108736L) != 0)) {
				{
				{
				setState(58);
				((StartContext)_localctx).sentence = sentence();
				body.add(((StartContext)_localctx).sentence.node);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(BRACKET_CLOSE);

						for(ASTNode n : body) {
							n.execute(symbolTable);
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintlnContext println;
		public ConditionalContext conditional;
		public While_loopContext while_loop;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public Read_statementContext read_statement;
		public Function_declarationContext function_declaration;
		public Procedure_declarationContext procedure_declaration;
		public Function_callContext function_call;
		public Procedure_callContext procedure_call;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Procedure_declarationContext procedure_declaration() {
			return getRuleContext(Procedure_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				((SentenceContext)_localctx).while_loop = while_loop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).while_loop.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				((SentenceContext)_localctx).read_statement = read_statement();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).read_statement.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				((SentenceContext)_localctx).function_declaration = function_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_declaration.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				((SentenceContext)_localctx).procedure_declaration = procedure_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).procedure_declaration.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				((SentenceContext)_localctx).function_call = function_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_call.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(96);
				((SentenceContext)_localctx).procedure_call = procedure_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).procedure_call.node;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(99);
				comment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(CommandXParser.LINE_COMMENT, 0); }
		public TerminalNode BLOCK_COMMENT() { return getToken(CommandXParser.BLOCK_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==LINE_COMMENT || _la==BLOCK_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode PRINTLN() { return getToken(CommandXParser.PRINTLN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(PRINTLN);
			setState(105);
			((PrintlnContext)_localctx).logicalExpression = logicalExpression();
			setState(106);
			match(SEMICOL);
			((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).logicalExpression.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Read_statementContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode READ() { return getToken(CommandXParser.READ, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(READ);
			setState(110);
			((Read_statementContext)_localctx).ID = match(ID);
			setState(111);
			match(SEMICOL);
			((Read_statementContext)_localctx).node =  new Read((((Read_statementContext)_localctx).ID!=null?((Read_statementContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExpressionContext logicalExpression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(CommandXParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(CommandXParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(CommandXParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(CommandXParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(CommandXParser.BRACKET_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(CommandXParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			match(PAR_OPEN);
			setState(116);
			((ConditionalContext)_localctx).logicalExpression = logicalExpression();
			setState(117);
			match(PAR_CLOSE);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(119);
			match(BRACKET_OPEN);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259108736L) != 0)) {
				{
				{
				setState(120);
				((ConditionalContext)_localctx).s1 = sentence();
				body.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(BRACKET_CLOSE);
			setState(129);
			match(ELSE);

					List<ASTNode> elseBody = new ArrayList<ASTNode>();
				
			setState(131);
			match(BRACKET_OPEN);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259108736L) != 0)) {
				{
				{
				setState(132);
				((ConditionalContext)_localctx).s2 = sentence();
				elseBody.add(((ConditionalContext)_localctx).s2.node);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(BRACKET_CLOSE);

					((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).logicalExpression.node, body, elseBody);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExpressionContext logicalExpression;
		public SentenceContext s1;
		public TerminalNode WHILE() { return getToken(CommandXParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CommandXParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CommandXParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(WHILE);
			setState(144);
			match(PAR_OPEN);
			setState(145);
			((While_loopContext)_localctx).logicalExpression = logicalExpression();
			setState(146);
			match(PAR_CLOSE);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(148);
			match(BRACKET_OPEN);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259108736L) != 0)) {
				{
				{
				setState(149);
				((While_loopContext)_localctx).s1 = sentence();
				body.add(((While_loopContext)_localctx).s1.node);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(BRACKET_CLOSE);

					((While_loopContext)_localctx).node =  new While_loop(((While_loopContext)_localctx).logicalExpression.node, body);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalOrExpressionContext logicalOrExpression;
		public LogicalAndExpressionContext logicalAndExpression;
		public LogicalExpressionContext logicalExpression;
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CommandXParser.NOT, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalExpression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((LogicalExpressionContext)_localctx).logicalOrExpression = logicalOrExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalOrExpression.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				((LogicalExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalAndExpression.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(NOT);
				setState(167);
				((LogicalExpressionContext)_localctx).logicalExpression = logicalExpression();
				((LogicalExpressionContext)_localctx).node =  new LogicalNot(((LogicalExpressionContext)_localctx).logicalExpression.node);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalAndExpressionContext logicalAndExpression;
		public LogicalAndExpressionContext right;
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CommandXParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CommandXParser.OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
			((LogicalOrExpressionContext)_localctx).node =  ((LogicalOrExpressionContext)_localctx).logicalAndExpression.node;
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(174);
				match(OR);
				setState(175);
				((LogicalOrExpressionContext)_localctx).right = ((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalOrExpressionContext)_localctx).node =  new LogicalOr(_localctx.node, ((LogicalOrExpressionContext)_localctx).right.node);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public EqualityExpressionContext equalityExpression;
		public EqualityExpressionContext right;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CommandXParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CommandXParser.AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
			((LogicalAndExpressionContext)_localctx).node =  ((LogicalAndExpressionContext)_localctx).equalityExpression.node;
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(185);
				match(AND);
				setState(186);
				((LogicalAndExpressionContext)_localctx).right = ((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
				((LogicalAndExpressionContext)_localctx).node =  new LogicalAnd(_localctx.node, ((LogicalAndExpressionContext)_localctx).right.node);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public RelationalExpressionContext relationalExpression;
		public Token EQUALITY_OPERATOR;
		public RelationalExpressionContext right;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALITY_OPERATOR() { return getTokens(CommandXParser.EQUALITY_OPERATOR); }
		public TerminalNode EQUALITY_OPERATOR(int i) {
			return getToken(CommandXParser.EQUALITY_OPERATOR, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
			((EqualityExpressionContext)_localctx).node =  ((EqualityExpressionContext)_localctx).relationalExpression.node;
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALITY_OPERATOR) {
				{
				{
				setState(196);
				((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR = match(EQUALITY_OPERATOR);
				setState(197);
				((EqualityExpressionContext)_localctx).right = ((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
				((EqualityExpressionContext)_localctx).node =  new EqualityExpression(_localctx.node, ((EqualityExpressionContext)_localctx).right.node, (((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR!=null?((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR.getText():null));
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public AdditiveExpressionContext additiveExpression;
		public Token RELATIONAL_OPERATOR;
		public AdditiveExpressionContext right;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> RELATIONAL_OPERATOR() { return getTokens(CommandXParser.RELATIONAL_OPERATOR); }
		public TerminalNode RELATIONAL_OPERATOR(int i) {
			return getToken(CommandXParser.RELATIONAL_OPERATOR, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
			((RelationalExpressionContext)_localctx).node =  ((RelationalExpressionContext)_localctx).additiveExpression.node;
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OPERATOR) {
				{
				{
				setState(207);
				((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR = match(RELATIONAL_OPERATOR);
				setState(208);
				((RelationalExpressionContext)_localctx).right = ((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
				((RelationalExpressionContext)_localctx).node =  new RelationalExpression(_localctx.node, ((RelationalExpressionContext)_localctx).right.node, (((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR!=null?((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR.getText():null));
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public MultiplicativeExpressionContext multiplicativeExpression;
		public Token ADDITIVE_OPERATOR;
		public MultiplicativeExpressionContext right;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADDITIVE_OPERATOR() { return getTokens(CommandXParser.ADDITIVE_OPERATOR); }
		public TerminalNode ADDITIVE_OPERATOR(int i) {
			return getToken(CommandXParser.ADDITIVE_OPERATOR, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).node =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.node;
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIVE_OPERATOR) {
				{
				{
				setState(218);
				((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR = match(ADDITIVE_OPERATOR);
				setState(219);
				((AdditiveExpressionContext)_localctx).right = ((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).node =  new AdditiveExpression(_localctx.node, ((AdditiveExpressionContext)_localctx).right.node, (((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR!=null?((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR.getText():null));
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public UnaryExpressionContext unaryExpression;
		public Token MULTIPLICATIVE_OPERATOR;
		public UnaryExpressionContext right;
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLICATIVE_OPERATOR() { return getTokens(CommandXParser.MULTIPLICATIVE_OPERATOR); }
		public TerminalNode MULTIPLICATIVE_OPERATOR(int i) {
			return getToken(CommandXParser.MULTIPLICATIVE_OPERATOR, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).node =  ((MultiplicativeExpressionContext)_localctx).unaryExpression.node;
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATIVE_OPERATOR) {
				{
				{
				setState(229);
				((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR = match(MULTIPLICATIVE_OPERATOR);
				setState(230);
				((MultiplicativeExpressionContext)_localctx).right = ((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
				((MultiplicativeExpressionContext)_localctx).node =  new MultiplicativeExpression(_localctx.node, ((MultiplicativeExpressionContext)_localctx).right.node, (((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR!=null?((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR.getText():null));
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public Token ADDITIVE_OPERATOR;
		public UnaryExpressionContext operand;
		public PrimaryExpressionContext primaryExpression;
		public TerminalNode ADDITIVE_OPERATOR() { return getToken(CommandXParser.ADDITIVE_OPERATOR, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryExpression);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDITIVE_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((UnaryExpressionContext)_localctx).ADDITIVE_OPERATOR = match(ADDITIVE_OPERATOR);
				setState(239);
				((UnaryExpressionContext)_localctx).operand = unaryExpression();
				((UnaryExpressionContext)_localctx).node =  new UnaryExpression((((UnaryExpressionContext)_localctx).ADDITIVE_OPERATOR!=null?((UnaryExpressionContext)_localctx).ADDITIVE_OPERATOR.getText():null), ((UnaryExpressionContext)_localctx).operand.node);
				}
				break;
			case NOT:
			case PAR_OPEN:
			case INTEGER_LITERAL:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case FLOAT_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				((UnaryExpressionContext)_localctx).primaryExpression = primaryExpression();
				((UnaryExpressionContext)_localctx).node =  ((UnaryExpressionContext)_localctx).primaryExpression.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalNotExpressionContext logicalNotExpression;
		public Token INTEGER_LITERAL;
		public Token BOOLEAN_LITERAL;
		public Token CHAR_LITERAL;
		public Token STRING_LITERAL;
		public Token FLOAT_LITERAL;
		public Token ID;
		public LogicalExpressionContext expr;
		public LogicalNotExpressionContext logicalNotExpression() {
			return getRuleContext(LogicalNotExpressionContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(CommandXParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CommandXParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CommandXParser.STRING_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CommandXParser.FLOAT_LITERAL, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primaryExpression);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				((PrimaryExpressionContext)_localctx).logicalNotExpression = logicalNotExpression();
				((PrimaryExpressionContext)_localctx).node =  ((PrimaryExpressionContext)_localctx).logicalNotExpression.node;
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				((PrimaryExpressionContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Integer.parseInt((((PrimaryExpressionContext)_localctx).INTEGER_LITERAL!=null?((PrimaryExpressionContext)_localctx).INTEGER_LITERAL.getText():null)));
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Boolean.parseBoolean((((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				((PrimaryExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).CHAR_LITERAL!=null?((PrimaryExpressionContext)_localctx).CHAR_LITERAL.getText():null).charAt(1));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				((PrimaryExpressionContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Float.parseFloat((((PrimaryExpressionContext)_localctx).FLOAT_LITERAL!=null?((PrimaryExpressionContext)_localctx).FLOAT_LITERAL.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				((PrimaryExpressionContext)_localctx).ID = match(ID);
				((PrimaryExpressionContext)_localctx).node =  new VarRef((((PrimaryExpressionContext)_localctx).ID!=null?((PrimaryExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(262);
				match(PAR_OPEN);
				setState(263);
				((PrimaryExpressionContext)_localctx).expr = logicalExpression();
				setState(264);
				match(PAR_CLOSE);
				((PrimaryExpressionContext)_localctx).node =  ((PrimaryExpressionContext)_localctx).expr.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public PrimaryExpressionContext operand;
		public TerminalNode NOT() { return getToken(CommandXParser.NOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public LogicalNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNotExpression; }
	}

	public final LogicalNotExpressionContext logicalNotExpression() throws RecognitionException {
		LogicalNotExpressionContext _localctx = new LogicalNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalNotExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(NOT);
			setState(270);
			((LogicalNotExpressionContext)_localctx).operand = primaryExpression();
			((LogicalNotExpressionContext)_localctx).node =  new LogicalNot(((LogicalNotExpressionContext)_localctx).operand.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TypeDeclarationContext typeDeclaration;
		public TerminalNode VAR() { return getToken(CommandXParser.VAR, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(VAR);
			setState(274);
			((Var_declContext)_localctx).ID = match(ID);
			setState(275);
			((Var_declContext)_localctx).typeDeclaration = typeDeclaration();
			setState(276);
			match(SEMICOL);
			((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), (((Var_declContext)_localctx).typeDeclaration!=null?_input.getText(((Var_declContext)_localctx).typeDeclaration.start,((Var_declContext)_localctx).typeDeclaration.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CommandXParser.ASSIGN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(280);
			match(ASSIGN);
			setState(281);
			((Var_assignContext)_localctx).logicalExpression = logicalExpression();
			setState(282);
			match(SEMICOL);
			((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).logicalExpression.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public SentenceContext s;
		public TerminalNode FUNC() { return getToken(CommandXParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CommandXParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CommandXParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(FUNC);
			setState(286);
			((Function_declarationContext)_localctx).ID = match(ID);
			setState(287);
			match(PAR_OPEN);
			setState(288);
			parameterList();
			setState(289);
			match(PAR_CLOSE);
			setState(290);
			match(BRACKET_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> localSymbolTable = new HashMap<String, Object>();
					
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259108736L) != 0)) {
				{
				{
				setState(292);
				((Function_declarationContext)_localctx).s = sentence();
				body.add(((Function_declarationContext)_localctx).s.node);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			match(BRACKET_CLOSE);
			((Function_declarationContext)_localctx).node =  new FunctionDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), body, localSymbolTable);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public SentenceContext s;
		public TerminalNode PROC() { return getToken(CommandXParser.PROC, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CommandXParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CommandXParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Procedure_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_declaration; }
	}

	public final Procedure_declarationContext procedure_declaration() throws RecognitionException {
		Procedure_declarationContext _localctx = new Procedure_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_procedure_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(PROC);
			setState(304);
			((Procedure_declarationContext)_localctx).ID = match(ID);
			setState(305);
			match(PAR_OPEN);
			setState(306);
			parameterList();
			setState(307);
			match(PAR_CLOSE);
			setState(308);
			match(BRACKET_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> localSymbolTable = new HashMap<String, Object>();
					
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259108736L) != 0)) {
				{
				{
				setState(310);
				((Procedure_declarationContext)_localctx).s = sentence();
				body.add(((Procedure_declarationContext)_localctx).s.node);
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(BRACKET_CLOSE);
			((Procedure_declarationContext)_localctx).node =  new ProcedureDeclaration((((Procedure_declarationContext)_localctx).ID!=null?((Procedure_declarationContext)_localctx).ID.getText():null), body, localSymbolTable);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ArgumentListContext argumentList;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			((Function_callContext)_localctx).ID = match(ID);
			setState(322);
			match(PAR_OPEN);
			setState(323);
			((Function_callContext)_localctx).argumentList = argumentList();
			setState(324);
			match(PAR_CLOSE);
			setState(325);
			match(SEMICOL);
			((Function_callContext)_localctx).node =  new FunctionCall((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null), ((Function_callContext)_localctx).argumentList.list);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_callContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ArgumentListContext argumentList;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Procedure_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call; }
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_procedure_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((Procedure_callContext)_localctx).ID = match(ID);
			setState(329);
			match(PAR_OPEN);
			setState(330);
			((Procedure_callContext)_localctx).argumentList = argumentList();
			setState(331);
			match(PAR_CLOSE);
			setState(332);
			match(SEMICOL);
			((Procedure_callContext)_localctx).node =  new ProcedureCall((((Procedure_callContext)_localctx).ID!=null?((Procedure_callContext)_localctx).ID.getText():null), ((Procedure_callContext)_localctx).argumentList.list);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ASTNode> list;
		public LogicalExpressionContext e;
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CommandXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CommandXParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<ASTNode> args = new ArrayList<ASTNode>();
			{
			setState(336);
			((ArgumentListContext)_localctx).e = logicalExpression();
			args.add(((ArgumentListContext)_localctx).e.node);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(338);
				match(COMMA);
				setState(339);
				((ArgumentListContext)_localctx).e = logicalExpression();
				args.add(((ArgumentListContext)_localctx).e.node);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			((ArgumentListContext)_localctx).list =  args;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<Parameter> list;
		public ParameterContext p;
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CommandXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CommandXParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Parameter> params = new ArrayList<Parameter>();
			{
			setState(350);
			((ParameterListContext)_localctx).p = parameter();
			params.add(((ParameterListContext)_localctx).p.param);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(352);
				match(COMMA);
				setState(353);
				((ParameterListContext)_localctx).p = parameter();
				params.add(((ParameterListContext)_localctx).p.param);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			((ParameterListContext)_localctx).list =  params;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public Parameter param;
		public TypeDeclarationContext typeDeclaration;
		public Token ID;
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((ParameterContext)_localctx).typeDeclaration = typeDeclaration();
			setState(364);
			((ParameterContext)_localctx).ID = match(ID);
			((ParameterContext)_localctx).param =  new Parameter((((ParameterContext)_localctx).typeDeclaration!=null?_input.getText(((ParameterContext)_localctx).typeDeclaration.start,((ParameterContext)_localctx).typeDeclaration.stop):null), (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0172\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		">\b\u0000\n\u0000\f\u0000A\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005|\b\u0005\n\u0005\f\u0005\u007f\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u0088\b\u0005\n\u0005\f\u0005\u008b\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0099\b\u0006"+
		"\n\u0006\f\u0006\u009c\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ab\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00b3\b\b\n\b\f\b\u00b6"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00be\b\t"+
		"\n\t\f\t\u00c1\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00c9\b\n\n\n\f\n\u00cc\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d4\b\u000b\n\u000b\f\u000b"+
		"\u00d7\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u00df\b\f\n\f\f\f\u00e2\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00ea\b\r\n\r\f\r\u00ed\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f6\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u010c\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0128\b\u0013\n\u0013\f\u0013\u012b\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u013a\b\u0014\n\u0014\f\u0014\u013d\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0157\b\u0017"+
		"\n\u0017\f\u0017\u015a\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0165\b\u0018\n\u0018\f\u0018\u0168\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0002\u0001"+
		"\u0000#$\u0001\u0000\u0001\u0005\u0178\u00006\u0001\u0000\u0000\u0000"+
		"\u0002d\u0001\u0000\u0000\u0000\u0004f\u0001\u0000\u0000\u0000\u0006h"+
		"\u0001\u0000\u0000\u0000\bm\u0001\u0000\u0000\u0000\nr\u0001\u0000\u0000"+
		"\u0000\f\u008f\u0001\u0000\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000"+
		"\u0010\u00ac\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000"+
		"\u0014\u00c2\u0001\u0000\u0000\u0000\u0016\u00cd\u0001\u0000\u0000\u0000"+
		"\u0018\u00d8\u0001\u0000\u0000\u0000\u001a\u00e3\u0001\u0000\u0000\u0000"+
		"\u001c\u00f5\u0001\u0000\u0000\u0000\u001e\u010b\u0001\u0000\u0000\u0000"+
		" \u010d\u0001\u0000\u0000\u0000\"\u0111\u0001\u0000\u0000\u0000$\u0117"+
		"\u0001\u0000\u0000\u0000&\u011d\u0001\u0000\u0000\u0000(\u012f\u0001\u0000"+
		"\u0000\u0000*\u0141\u0001\u0000\u0000\u0000,\u0148\u0001\u0000\u0000\u0000"+
		".\u014f\u0001\u0000\u0000\u00000\u015d\u0001\u0000\u0000\u00002\u016b"+
		"\u0001\u0000\u0000\u00004\u016f\u0001\u0000\u0000\u000067\u0005\u0006"+
		"\u0000\u000078\u0005\"\u0000\u000089\u0005\u0019\u0000\u00009?\u0006\u0000"+
		"\uffff\uffff\u0000:;\u0003\u0002\u0001\u0000;<\u0006\u0000\uffff\uffff"+
		"\u0000<>\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000>A\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\u001a\u0000\u0000"+
		"CD\u0006\u0000\uffff\uffff\u0000D\u0001\u0001\u0000\u0000\u0000EF\u0003"+
		"\u0006\u0003\u0000FG\u0006\u0001\uffff\uffff\u0000Ge\u0001\u0000\u0000"+
		"\u0000HI\u0003\n\u0005\u0000IJ\u0006\u0001\uffff\uffff\u0000Je\u0001\u0000"+
		"\u0000\u0000KL\u0003\f\u0006\u0000LM\u0006\u0001\uffff\uffff\u0000Me\u0001"+
		"\u0000\u0000\u0000NO\u0003\"\u0011\u0000OP\u0006\u0001\uffff\uffff\u0000"+
		"Pe\u0001\u0000\u0000\u0000QR\u0003$\u0012\u0000RS\u0006\u0001\uffff\uffff"+
		"\u0000Se\u0001\u0000\u0000\u0000TU\u0003\b\u0004\u0000UV\u0006\u0001\uffff"+
		"\uffff\u0000Ve\u0001\u0000\u0000\u0000WX\u0003&\u0013\u0000XY\u0006\u0001"+
		"\uffff\uffff\u0000Ye\u0001\u0000\u0000\u0000Z[\u0003(\u0014\u0000[\\\u0006"+
		"\u0001\uffff\uffff\u0000\\e\u0001\u0000\u0000\u0000]^\u0003*\u0015\u0000"+
		"^_\u0006\u0001\uffff\uffff\u0000_e\u0001\u0000\u0000\u0000`a\u0003,\u0016"+
		"\u0000ab\u0006\u0001\uffff\uffff\u0000be\u0001\u0000\u0000\u0000ce\u0003"+
		"\u0004\u0002\u0000dE\u0001\u0000\u0000\u0000dH\u0001\u0000\u0000\u0000"+
		"dK\u0001\u0000\u0000\u0000dN\u0001\u0000\u0000\u0000dQ\u0001\u0000\u0000"+
		"\u0000dT\u0001\u0000\u0000\u0000dW\u0001\u0000\u0000\u0000dZ\u0001\u0000"+
		"\u0000\u0000d]\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000e\u0003\u0001\u0000\u0000\u0000fg\u0007\u0000\u0000"+
		"\u0000g\u0005\u0001\u0000\u0000\u0000hi\u0005\b\u0000\u0000ij\u0003\u000e"+
		"\u0007\u0000jk\u0005\u001b\u0000\u0000kl\u0006\u0003\uffff\uffff\u0000"+
		"l\u0007\u0001\u0000\u0000\u0000mn\u0005\t\u0000\u0000no\u0005\"\u0000"+
		"\u0000op\u0005\u001b\u0000\u0000pq\u0006\u0004\uffff\uffff\u0000q\t\u0001"+
		"\u0000\u0000\u0000rs\u0005\f\u0000\u0000st\u0005\u0017\u0000\u0000tu\u0003"+
		"\u000e\u0007\u0000uv\u0005\u0018\u0000\u0000vw\u0006\u0005\uffff\uffff"+
		"\u0000w}\u0005\u0019\u0000\u0000xy\u0003\u0002\u0001\u0000yz\u0006\u0005"+
		"\uffff\uffff\u0000z|\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u001a\u0000\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082"+
		"\u0083\u0006\u0005\uffff\uffff\u0000\u0083\u0089\u0005\u0019\u0000\u0000"+
		"\u0084\u0085\u0003\u0002\u0001\u0000\u0085\u0086\u0006\u0005\uffff\uffff"+
		"\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000"+
		"\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u001a\u0000"+
		"\u0000\u008d\u008e\u0006\u0005\uffff\uffff\u0000\u008e\u000b\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0091\u0005\u0017"+
		"\u0000\u0000\u0091\u0092\u0003\u000e\u0007\u0000\u0092\u0093\u0005\u0018"+
		"\u0000\u0000\u0093\u0094\u0006\u0006\uffff\uffff\u0000\u0094\u009a\u0005"+
		"\u0019\u0000\u0000\u0095\u0096\u0003\u0002\u0001\u0000\u0096\u0097\u0006"+
		"\u0006\uffff\uffff\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0095"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\u001a\u0000\u0000\u009e\u009f\u0006\u0006\uffff\uffff\u0000\u009f"+
		"\r\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u0010\b\u0000\u00a1\u00a2"+
		"\u0006\u0007\uffff\uffff\u0000\u00a2\u00ab\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0003\u0012\t\u0000\u00a4\u00a5\u0006\u0007\uffff\uffff\u0000\u00a5"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0013\u0000\u0000\u00a7"+
		"\u00a8\u0003\u000e\u0007\u0000\u00a8\u00a9\u0006\u0007\uffff\uffff\u0000"+
		"\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a0\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a3\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000"+
		"\u00ab\u000f\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u0012\t\u0000\u00ad"+
		"\u00b4\u0006\b\uffff\uffff\u0000\u00ae\u00af\u0005\u0012\u0000\u0000\u00af"+
		"\u00b0\u0003\u0012\t\u0000\u00b0\u00b1\u0006\b\uffff\uffff\u0000\u00b1"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u0011\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0014\n\u0000\u00b8\u00bf"+
		"\u0006\t\uffff\uffff\u0000\u00b9\u00ba\u0005\u0011\u0000\u0000\u00ba\u00bb"+
		"\u0003\u0014\n\u0000\u00bb\u00bc\u0006\t\uffff\uffff\u0000\u00bc\u00be"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u0013\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u0016\u000b\u0000\u00c3\u00ca"+
		"\u0006\n\uffff\uffff\u0000\u00c4\u00c5\u0005\u0015\u0000\u0000\u00c5\u00c6"+
		"\u0003\u0016\u000b\u0000\u00c6\u00c7\u0006\n\uffff\uffff\u0000\u00c7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c9\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u0015\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003\u0018\f\u0000\u00ce\u00d5\u0006"+
		"\u000b\uffff\uffff\u0000\u00cf\u00d0\u0005\u0014\u0000\u0000\u00d0\u00d1"+
		"\u0003\u0018\f\u0000\u00d1\u00d2\u0006\u000b\uffff\uffff\u0000\u00d2\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u0017\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\u001a\r\u0000\u00d9\u00e0\u0006"+
		"\f\uffff\uffff\u0000\u00da\u00db\u0005\u000f\u0000\u0000\u00db\u00dc\u0003"+
		"\u001a\r\u0000\u00dc\u00dd\u0006\f\uffff\uffff\u0000\u00dd\u00df\u0001"+
		"\u0000\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00df\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u0019\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0003\u001c\u000e\u0000\u00e4\u00eb\u0006"+
		"\r\uffff\uffff\u0000\u00e5\u00e6\u0005\u0010\u0000\u0000\u00e6\u00e7\u0003"+
		"\u001c\u000e\u0000\u00e7\u00e8\u0006\r\uffff\uffff\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u001b\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0005\u000f\u0000\u0000\u00ef\u00f0\u0003"+
		"\u001c\u000e\u0000\u00f0\u00f1\u0006\u000e\uffff\uffff\u0000\u00f1\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003\u001e\u000f\u0000\u00f3\u00f4"+
		"\u0006\u000e\uffff\uffff\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6"+
		"\u001d\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003 \u0010\u0000\u00f8\u00f9"+
		"\u0006\u000f\uffff\uffff\u0000\u00f9\u010c\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005\u001d\u0000\u0000\u00fb\u010c\u0006\u000f\uffff\uffff\u0000"+
		"\u00fc\u00fd\u0005\u001e\u0000\u0000\u00fd\u010c\u0006\u000f\uffff\uffff"+
		"\u0000\u00fe\u00ff\u0005\u001f\u0000\u0000\u00ff\u010c\u0006\u000f\uffff"+
		"\uffff\u0000\u0100\u0101\u0005 \u0000\u0000\u0101\u010c\u0006\u000f\uffff"+
		"\uffff\u0000\u0102\u0103\u0005!\u0000\u0000\u0103\u010c\u0006\u000f\uffff"+
		"\uffff\u0000\u0104\u0105\u0005\"\u0000\u0000\u0105\u010c\u0006\u000f\uffff"+
		"\uffff\u0000\u0106\u0107\u0005\u0017\u0000\u0000\u0107\u0108\u0003\u000e"+
		"\u0007\u0000\u0108\u0109\u0005\u0018\u0000\u0000\u0109\u010a\u0006\u000f"+
		"\uffff\uffff\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u00f7\u0001"+
		"\u0000\u0000\u0000\u010b\u00fa\u0001\u0000\u0000\u0000\u010b\u00fc\u0001"+
		"\u0000\u0000\u0000\u010b\u00fe\u0001\u0000\u0000\u0000\u010b\u0100\u0001"+
		"\u0000\u0000\u0000\u010b\u0102\u0001\u0000\u0000\u0000\u010b\u0104\u0001"+
		"\u0000\u0000\u0000\u010b\u0106\u0001\u0000\u0000\u0000\u010c\u001f\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\u0013\u0000\u0000\u010e\u010f\u0003"+
		"\u001e\u000f\u0000\u010f\u0110\u0006\u0010\uffff\uffff\u0000\u0110!\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0005\u0007\u0000\u0000\u0112\u0113\u0005"+
		"\"\u0000\u0000\u0113\u0114\u00034\u001a\u0000\u0114\u0115\u0005\u001b"+
		"\u0000\u0000\u0115\u0116\u0006\u0011\uffff\uffff\u0000\u0116#\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005\"\u0000\u0000\u0118\u0119\u0005\u0016\u0000"+
		"\u0000\u0119\u011a\u0003\u000e\u0007\u0000\u011a\u011b\u0005\u001b\u0000"+
		"\u0000\u011b\u011c\u0006\u0012\uffff\uffff\u0000\u011c%\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005\n\u0000\u0000\u011e\u011f\u0005\"\u0000\u0000"+
		"\u011f\u0120\u0005\u0017\u0000\u0000\u0120\u0121\u00030\u0018\u0000\u0121"+
		"\u0122\u0005\u0018\u0000\u0000\u0122\u0123\u0005\u0019\u0000\u0000\u0123"+
		"\u0129\u0006\u0013\uffff\uffff\u0000\u0124\u0125\u0003\u0002\u0001\u0000"+
		"\u0125\u0126\u0006\u0013\uffff\uffff\u0000\u0126\u0128\u0001\u0000\u0000"+
		"\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005\u001a\u0000\u0000\u012d\u012e\u0006\u0013\uffff"+
		"\uffff\u0000\u012e\'\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u000b\u0000"+
		"\u0000\u0130\u0131\u0005\"\u0000\u0000\u0131\u0132\u0005\u0017\u0000\u0000"+
		"\u0132\u0133\u00030\u0018\u0000\u0133\u0134\u0005\u0018\u0000\u0000\u0134"+
		"\u0135\u0005\u0019\u0000\u0000\u0135\u013b\u0006\u0014\uffff\uffff\u0000"+
		"\u0136\u0137\u0003\u0002\u0001\u0000\u0137\u0138\u0006\u0014\uffff\uffff"+
		"\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000\u0000"+
		"\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000"+
		"\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u001a\u0000"+
		"\u0000\u013f\u0140\u0006\u0014\uffff\uffff\u0000\u0140)\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0005\"\u0000\u0000\u0142\u0143\u0005\u0017\u0000\u0000"+
		"\u0143\u0144\u0003.\u0017\u0000\u0144\u0145\u0005\u0018\u0000\u0000\u0145"+
		"\u0146\u0005\u001b\u0000\u0000\u0146\u0147\u0006\u0015\uffff\uffff\u0000"+
		"\u0147+\u0001\u0000\u0000\u0000\u0148\u0149\u0005\"\u0000\u0000\u0149"+
		"\u014a\u0005\u0017\u0000\u0000\u014a\u014b\u0003.\u0017\u0000\u014b\u014c"+
		"\u0005\u0018\u0000\u0000\u014c\u014d\u0005\u001b\u0000\u0000\u014d\u014e"+
		"\u0006\u0016\uffff\uffff\u0000\u014e-\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0006\u0017\uffff\uffff\u0000\u0150\u0151\u0003\u000e\u0007\u0000\u0151"+
		"\u0158\u0006\u0017\uffff\uffff\u0000\u0152\u0153\u0005\u001c\u0000\u0000"+
		"\u0153\u0154\u0003\u000e\u0007\u0000\u0154\u0155\u0006\u0017\uffff\uffff"+
		"\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0152\u0001\u0000\u0000"+
		"\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c\u0006\u0017\uffff"+
		"\uffff\u0000\u015c/\u0001\u0000\u0000\u0000\u015d\u015e\u0006\u0018\uffff"+
		"\uffff\u0000\u015e\u015f\u00032\u0019\u0000\u015f\u0166\u0006\u0018\uffff"+
		"\uffff\u0000\u0160\u0161\u0005\u001c\u0000\u0000\u0161\u0162\u00032\u0019"+
		"\u0000\u0162\u0163\u0006\u0018\uffff\uffff\u0000\u0163\u0165\u0001\u0000"+
		"\u0000\u0000\u0164\u0160\u0001\u0000\u0000\u0000\u0165\u0168\u0001\u0000"+
		"\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0006\u0018\uffff\uffff\u0000\u016a1\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u00034\u001a\u0000\u016c\u016d\u0005\"\u0000"+
		"\u0000\u016d\u016e\u0006\u0019\uffff\uffff\u0000\u016e3\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0007\u0001\u0000\u0000\u01705\u0001\u0000\u0000\u0000"+
		"\u0012?d}\u0089\u009a\u00aa\u00b4\u00bf\u00ca\u00d5\u00e0\u00eb\u00f5"+
		"\u010b\u0129\u013b\u0158\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}