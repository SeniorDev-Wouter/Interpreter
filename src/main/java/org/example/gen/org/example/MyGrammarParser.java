// Generated from C:/Users/woute/Documents/GitHub/Technischleerdoel2/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example.gen.org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		INT=18, WS=19, KLEINERDAN=20, GROTERDAN=21, WANNEER=22, MIJN=23, DAN=24, 
		IK=25, PUNT=26;
	public static final int
		RULE_agent = 0, RULE_regel = 1, RULE_spelsituatie = 2, RULE_actie = 3, 
		RULE_beweeg = 4, RULE_valAan = 5, RULE_richting = 6, RULE_doelwit = 7, 
		RULE_vergelijkingsOperator = 8, RULE_attribuut = 9, RULE_actieWerkwoord = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"agent", "regel", "spelsituatie", "actie", "beweeg", "valAan", "richting", 
			"doelwit", "vergelijkingsOperator", "attribuut", "actieWerkwoord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' aan'", "'naar '", "'de val'", "'het goud'", "'de deur'", "'de trap'", 
			"'de kist'", "'de kobold'", "'de draak'", "'de grote boze pinda'", "'gezondheid'", 
			"'verdediging'", "'aanval'", "'snelheid'", "'kracht'", "'beweeg'", "'val'", 
			null, null, "'kleiner dan'", "'groter dan'", null, "'mijn'", "'dan'", 
			"' ik '", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "INT", "WS", "KLEINERDAN", "GROTERDAN", 
			"WANNEER", "MIJN", "DAN", "IK", "PUNT"
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
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgentContext extends ParserRuleContext {
		public List<RegelContext> regel() {
			return getRuleContexts(RegelContext.class);
		}
		public RegelContext regel(int i) {
			return getRuleContext(RegelContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public AgentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAgent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAgent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAgent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgentContext agent() throws RecognitionException {
		AgentContext _localctx = new AgentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_agent);
		int _la;
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WANNEER:
				enterOuterAlt(_localctx, 1);
				{
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(22);
					regel();
					}
					}
					setState(25); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WANNEER );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(EOF);
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
	public static class RegelContext extends ParserRuleContext {
		public SpelsituatieContext spelsituatie() {
			return getRuleContext(SpelsituatieContext.class,0);
		}
		public RegelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRegel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRegel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitRegel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegelContext regel() throws RecognitionException {
		RegelContext _localctx = new RegelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			spelsituatie();
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
	public static class SpelsituatieContext extends ParserRuleContext {
		public TerminalNode WANNEER() { return getToken(MyGrammarParser.WANNEER, 0); }
		public TerminalNode MIJN() { return getToken(MyGrammarParser.MIJN, 0); }
		public AttribuutContext attribuut() {
			return getRuleContext(AttribuutContext.class,0);
		}
		public VergelijkingsOperatorContext vergelijkingsOperator() {
			return getRuleContext(VergelijkingsOperatorContext.class,0);
		}
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode DAN() { return getToken(MyGrammarParser.DAN, 0); }
		public ActieContext actie() {
			return getRuleContext(ActieContext.class,0);
		}
		public TerminalNode PUNT() { return getToken(MyGrammarParser.PUNT, 0); }
		public SpelsituatieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spelsituatie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSpelsituatie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSpelsituatie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSpelsituatie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpelsituatieContext spelsituatie() throws RecognitionException {
		SpelsituatieContext _localctx = new SpelsituatieContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_spelsituatie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(WANNEER);
			setState(33);
			match(MIJN);
			setState(34);
			attribuut();
			setState(35);
			vergelijkingsOperator();
			setState(36);
			match(INT);
			setState(37);
			match(DAN);
			setState(38);
			actie();
			setState(39);
			match(PUNT);
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
	public static class ActieContext extends ParserRuleContext {
		public BeweegContext beweeg() {
			return getRuleContext(BeweegContext.class,0);
		}
		public ValAanContext valAan() {
			return getRuleContext(ValAanContext.class,0);
		}
		public ActieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterActie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitActie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitActie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActieContext actie() throws RecognitionException {
		ActieContext _localctx = new ActieContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actie);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				beweeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				valAan();
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
	public static class BeweegContext extends ParserRuleContext {
		public ActieWerkwoordContext actieWerkwoord() {
			return getRuleContext(ActieWerkwoordContext.class,0);
		}
		public TerminalNode IK() { return getToken(MyGrammarParser.IK, 0); }
		public RichtingContext richting() {
			return getRuleContext(RichtingContext.class,0);
		}
		public BeweegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beweeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBeweeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBeweeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitBeweeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeweegContext beweeg() throws RecognitionException {
		BeweegContext _localctx = new BeweegContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_beweeg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			actieWerkwoord();
			setState(46);
			match(IK);
			setState(47);
			richting();
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
	public static class ValAanContext extends ParserRuleContext {
		public ActieWerkwoordContext actieWerkwoord() {
			return getRuleContext(ActieWerkwoordContext.class,0);
		}
		public TerminalNode IK() { return getToken(MyGrammarParser.IK, 0); }
		public DoelwitContext doelwit() {
			return getRuleContext(DoelwitContext.class,0);
		}
		public ValAanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valAan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValAan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValAan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitValAan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValAanContext valAan() throws RecognitionException {
		ValAanContext _localctx = new ValAanContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valAan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			actieWerkwoord();
			setState(50);
			match(IK);
			setState(51);
			doelwit();
			setState(52);
			match(T__0);
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
	public static class RichtingContext extends ParserRuleContext {
		public RichtingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_richting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRichting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRichting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitRichting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RichtingContext richting() throws RecognitionException {
		RichtingContext _localctx = new RichtingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_richting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__1);
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0)) ) {
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
	public static class DoelwitContext extends ParserRuleContext {
		public DoelwitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doelwit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDoelwit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDoelwit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDoelwit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoelwitContext doelwit() throws RecognitionException {
		DoelwitContext _localctx = new DoelwitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doelwit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
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
	public static class VergelijkingsOperatorContext extends ParserRuleContext {
		public TerminalNode KLEINERDAN() { return getToken(MyGrammarParser.KLEINERDAN, 0); }
		public TerminalNode GROTERDAN() { return getToken(MyGrammarParser.GROTERDAN, 0); }
		public VergelijkingsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergelijkingsOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVergelijkingsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVergelijkingsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitVergelijkingsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VergelijkingsOperatorContext vergelijkingsOperator() throws RecognitionException {
		VergelijkingsOperatorContext _localctx = new VergelijkingsOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vergelijkingsOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==KLEINERDAN || _la==GROTERDAN) ) {
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
	public static class AttribuutContext extends ParserRuleContext {
		public AttribuutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribuut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAttribuut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAttribuut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAttribuut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribuutContext attribuut() throws RecognitionException {
		AttribuutContext _localctx = new AttribuutContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribuut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63488L) != 0)) ) {
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
	public static class ActieWerkwoordContext extends ParserRuleContext {
		public ActieWerkwoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actieWerkwoord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterActieWerkwoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitActieWerkwoord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitActieWerkwoord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActieWerkwoordContext actieWerkwoord() throws RecognitionException {
		ActieWerkwoordContext _localctx = new ActieWerkwoordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_actieWerkwoord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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
		"\u0004\u0001\u001aB\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0003\u0000\u001d\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003,\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005\u0001\u0000\u0003"+
		"\u0007\u0001\u0000\b\n\u0001\u0000\u0014\u0015\u0001\u0000\u000b\u000f"+
		"\u0001\u0000\u0010\u00119\u0000\u001c\u0001\u0000\u0000\u0000\u0002\u001e"+
		"\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006+\u0001\u0000"+
		"\u0000\u0000\b-\u0001\u0000\u0000\u0000\n1\u0001\u0000\u0000\u0000\f6"+
		"\u0001\u0000\u0000\u0000\u000e9\u0001\u0000\u0000\u0000\u0010;\u0001\u0000"+
		"\u0000\u0000\u0012=\u0001\u0000\u0000\u0000\u0014?\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u001d\u0005\u0000\u0000\u0001\u001c\u0017\u0001\u0000\u0000\u0000"+
		"\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0001\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0003\u0004\u0002\u0000\u001f\u0003\u0001\u0000\u0000\u0000"+
		" !\u0005\u0016\u0000\u0000!\"\u0005\u0017\u0000\u0000\"#\u0003\u0012\t"+
		"\u0000#$\u0003\u0010\b\u0000$%\u0005\u0012\u0000\u0000%&\u0005\u0018\u0000"+
		"\u0000&\'\u0003\u0006\u0003\u0000\'(\u0005\u001a\u0000\u0000(\u0005\u0001"+
		"\u0000\u0000\u0000),\u0003\b\u0004\u0000*,\u0003\n\u0005\u0000+)\u0001"+
		"\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0007\u0001\u0000\u0000"+
		"\u0000-.\u0003\u0014\n\u0000./\u0005\u0019\u0000\u0000/0\u0003\f\u0006"+
		"\u00000\t\u0001\u0000\u0000\u000012\u0003\u0014\n\u000023\u0005\u0019"+
		"\u0000\u000034\u0003\u000e\u0007\u000045\u0005\u0001\u0000\u00005\u000b"+
		"\u0001\u0000\u0000\u000067\u0005\u0002\u0000\u000078\u0007\u0000\u0000"+
		"\u00008\r\u0001\u0000\u0000\u00009:\u0007\u0001\u0000\u0000:\u000f\u0001"+
		"\u0000\u0000\u0000;<\u0007\u0002\u0000\u0000<\u0011\u0001\u0000\u0000"+
		"\u0000=>\u0007\u0003\u0000\u0000>\u0013\u0001\u0000\u0000\u0000?@\u0007"+
		"\u0004\u0000\u0000@\u0015\u0001\u0000\u0000\u0000\u0003\u0019\u001c+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}