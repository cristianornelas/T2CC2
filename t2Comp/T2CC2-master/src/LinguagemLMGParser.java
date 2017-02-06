// Generated from .\LinguagemLMG.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemLMGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, IDENT=64, CADEIA=65, NUM=66, CaracteresIgnorados=67, 
		Comentarios=68;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_declaracoes = 2, RULE_criar_grafo = 3, 
		RULE_criar_dgrafo = 4, RULE_grafo = 5, RULE_dgrafo = 6, RULE_criar_vertices = 7, 
		RULE_vertices = 8, RULE_criar_dados = 9, RULE_comandos = 10, RULE_adicionar = 11, 
		RULE_aresta = 12, RULE_daresta = 13, RULE_desenhar = 14, RULE_limpar = 15, 
		RULE_plotar = 16, RULE_salvar = 17, RULE_para = 18, RULE_value = 19, RULE_se = 20, 
		RULE_senao = 21, RULE_comparacao_key = 22, RULE_key = 23, RULE_exibir = 24, 
		RULE_remover = 25, RULE_expressao = 26;
	public static final String[] ruleNames = {
		"programa", "corpo", "declaracoes", "criar_grafo", "criar_dgrafo", "grafo", 
		"dgrafo", "criar_vertices", "vertices", "criar_dados", "comandos", "adicionar", 
		"aresta", "daresta", "desenhar", "limpar", "plotar", "salvar", "para", 
		"value", "se", "senao", "comparacao_key", "key", "exibir", "remover", 
		"expressao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'inicio-lmg'", "'fim-lmg'", "'criar grafo'", "'criar grafo direcional'", 
		"','", "'criar vertices'", "':'", "'['", "']'", "'criar dados'", "'='", 
		"'adicionar vertices'", "'ao grafo'", "'adicionar vertice'", "'adicionar aresta'", 
		"'ao dgrafo'", "'adicionar dados'", "'ao vertice'", "'do grafo'", "'adicionar dado'", 
		"'a aresta'", "'--'", "'->'", "'desenhar grafo'", "'na tela'", "'limpar tela'", 
		"'plotar tela'", "'salvar tela em'", "'para cada vertice'", "'no grafo'", 
		"'fim-para'", "'para cada aresta'", "'para cada vizinho'", "'do vertice'", 
		"'se aresta'", "'possui'", "'fim-se'", "'se'", "'senao:'", "'=='", "'!='", 
		"'>='", "'<='", "'<'", "'>'", "'valor de'", "'no vertice'", "'na aresta'", 
		"'exibir grafo'", "'exibir grafo direcional'", "'exibir vertices do grafo'", 
		"'exibir vertice'", "'onde ('", "')'", "'exibir arestas do grafo'", "'exibir aresta'", 
		"'exibir vizinhos do vertice'", "'remover vertice'", "'remover arestas do grafo'", 
		"'remover aresta'", "'remover arestas'", "'remover dados da aresta'", 
		"'remover dados'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "IDENT", "CADEIA", "NUM", "CaracteresIgnorados", 
		"Comentarios"
	};
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
	public String getGrammarFileName() { return "LinguagemLMG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguagemLMGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			corpo();
			setState(56);
			match(T__1);
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

	public static class CorpoContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			declaracoes();
			setState(59);
			comandos();
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public Criar_grafoContext criar_grafo() {
			return getRuleContext(Criar_grafoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public Criar_dgrafoContext criar_dgrafo() {
			return getRuleContext(Criar_dgrafoContext.class,0);
		}
		public Criar_verticesContext criar_vertices() {
			return getRuleContext(Criar_verticesContext.class,0);
		}
		public Criar_dadosContext criar_dados() {
			return getRuleContext(Criar_dadosContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				criar_grafo();
				setState(62);
				declaracoes();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				criar_dgrafo();
				setState(65);
				declaracoes();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				criar_vertices();
				setState(68);
				declaracoes();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				criar_dados();
				setState(71);
				declaracoes();
				}
				break;
			case T__1:
			case T__11:
			case T__13:
			case T__14:
			case T__16:
			case T__19:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__31:
			case T__32:
			case T__34:
			case T__37:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class Criar_grafoContext extends ParserRuleContext {
		public GrafoContext grafo() {
			return getRuleContext(GrafoContext.class,0);
		}
		public Criar_grafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criar_grafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterCriar_grafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitCriar_grafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitCriar_grafo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Criar_grafoContext criar_grafo() throws RecognitionException {
		Criar_grafoContext _localctx = new Criar_grafoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_criar_grafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__2);
			setState(77);
			grafo();
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

	public static class Criar_dgrafoContext extends ParserRuleContext {
		public DgrafoContext dgrafo() {
			return getRuleContext(DgrafoContext.class,0);
		}
		public Criar_dgrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criar_dgrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterCriar_dgrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitCriar_dgrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitCriar_dgrafo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Criar_dgrafoContext criar_dgrafo() throws RecognitionException {
		Criar_dgrafoContext _localctx = new Criar_dgrafoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_criar_dgrafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__3);
			setState(80);
			dgrafo();
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

	public static class GrafoContext extends ParserRuleContext {
		public Token grafo1;
		public Token IDENT;
		public List<Token> outrosGrafos = new ArrayList<Token>();
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public GrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterGrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitGrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitGrafo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrafoContext grafo() throws RecognitionException {
		GrafoContext _localctx = new GrafoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_grafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((GrafoContext)_localctx).grafo1 = match(IDENT);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(83);
				match(T__4);
				setState(84);
				((GrafoContext)_localctx).IDENT = match(IDENT);
				((GrafoContext)_localctx).outrosGrafos.add(((GrafoContext)_localctx).IDENT);
				}
				}
				setState(89);
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

	public static class DgrafoContext extends ParserRuleContext {
		public Token dgrafo1;
		public Token IDENT;
		public List<Token> outrosDGrafos = new ArrayList<Token>();
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public DgrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dgrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterDgrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitDgrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitDgrafo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DgrafoContext dgrafo() throws RecognitionException {
		DgrafoContext _localctx = new DgrafoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dgrafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((DgrafoContext)_localctx).dgrafo1 = match(IDENT);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(91);
				match(T__4);
				setState(92);
				((DgrafoContext)_localctx).IDENT = match(IDENT);
				((DgrafoContext)_localctx).outrosDGrafos.add(((DgrafoContext)_localctx).IDENT);
				}
				}
				setState(97);
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

	public static class Criar_verticesContext extends ParserRuleContext {
		public VerticesContext vertices() {
			return getRuleContext(VerticesContext.class,0);
		}
		public Criar_verticesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criar_vertices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterCriar_vertices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitCriar_vertices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitCriar_vertices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Criar_verticesContext criar_vertices() throws RecognitionException {
		Criar_verticesContext _localctx = new Criar_verticesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_criar_vertices);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__5);
			setState(99);
			vertices();
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

	public static class VerticesContext extends ParserRuleContext {
		public Token nome;
		public Token vertice1;
		public Token IDENT;
		public List<Token> outrosVertices = new ArrayList<Token>();
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public VerticesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterVertices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitVertices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitVertices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerticesContext vertices() throws RecognitionException {
		VerticesContext _localctx = new VerticesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vertices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((VerticesContext)_localctx).nome = match(IDENT);
			setState(102);
			match(T__6);
			setState(103);
			match(T__7);
			setState(104);
			((VerticesContext)_localctx).vertice1 = match(IDENT);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(105);
				match(T__4);
				setState(106);
				((VerticesContext)_localctx).IDENT = match(IDENT);
				((VerticesContext)_localctx).outrosVertices.add(((VerticesContext)_localctx).IDENT);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__8);
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

	public static class Criar_dadosContext extends ParserRuleContext {
		public Token nome;
		public Token dado1;
		public ValueContext valor1;
		public Token IDENT;
		public List<Token> outrosDados = new ArrayList<Token>();
		public ValueContext value;
		public List<ValueContext> outrosValores = new ArrayList<ValueContext>();
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Criar_dadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criar_dados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterCriar_dados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitCriar_dados(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitCriar_dados(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Criar_dadosContext criar_dados() throws RecognitionException {
		Criar_dadosContext _localctx = new Criar_dadosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_criar_dados);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__9);
			setState(115);
			((Criar_dadosContext)_localctx).nome = match(IDENT);
			setState(116);
			match(T__6);
			setState(117);
			((Criar_dadosContext)_localctx).dado1 = match(IDENT);
			setState(118);
			match(T__10);
			setState(119);
			((Criar_dadosContext)_localctx).valor1 = value();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(120);
				match(T__4);
				setState(121);
				((Criar_dadosContext)_localctx).IDENT = match(IDENT);
				((Criar_dadosContext)_localctx).outrosDados.add(((Criar_dadosContext)_localctx).IDENT);
				setState(122);
				match(T__10);
				setState(123);
				((Criar_dadosContext)_localctx).value = value();
				((Criar_dadosContext)_localctx).outrosValores.add(((Criar_dadosContext)_localctx).value);
				}
				}
				setState(128);
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

	public static class ComandosContext extends ParserRuleContext {
		public AdicionarContext adicionar() {
			return getRuleContext(AdicionarContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public DesenharContext desenhar() {
			return getRuleContext(DesenharContext.class,0);
		}
		public LimparContext limpar() {
			return getRuleContext(LimparContext.class,0);
		}
		public PlotarContext plotar() {
			return getRuleContext(PlotarContext.class,0);
		}
		public SalvarContext salvar() {
			return getRuleContext(SalvarContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public ExibirContext exibir() {
			return getRuleContext(ExibirContext.class,0);
		}
		public RemoverContext remover() {
			return getRuleContext(RemoverContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandos);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
			case T__14:
			case T__16:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				adicionar();
				setState(130);
				comandos();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				desenhar();
				setState(133);
				comandos();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				limpar();
				setState(136);
				comandos();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				plotar();
				setState(139);
				comandos();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				salvar();
				setState(142);
				comandos();
				}
				break;
			case T__28:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				para();
				setState(145);
				comandos();
				}
				break;
			case T__34:
			case T__37:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				se();
				setState(148);
				comandos();
				}
				break;
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__54:
			case T__55:
			case T__56:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				exibir();
				setState(151);
				comandos();
				}
				break;
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				remover();
				setState(154);
				comandos();
				}
				break;
			case T__1:
			case T__30:
			case T__36:
			case T__38:
				enterOuterAlt(_localctx, 10);
				{
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

	public static class AdicionarContext extends ParserRuleContext {
		public Token vs;
		public Token g1;
		public Token v1;
		public Token g2;
		public Token g3;
		public Token g4;
		public Token ds;
		public Token v2;
		public Token g5;
		public Token d1;
		public Token a1;
		public Token g6;
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public ArestaContext aresta() {
			return getRuleContext(ArestaContext.class,0);
		}
		public DarestaContext daresta() {
			return getRuleContext(DarestaContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AdicionarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicionar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterAdicionar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitAdicionar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitAdicionar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdicionarContext adicionar() throws RecognitionException {
		AdicionarContext _localctx = new AdicionarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_adicionar);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T__11);
				setState(160);
				((AdicionarContext)_localctx).vs = match(IDENT);
				setState(161);
				match(T__12);
				setState(162);
				((AdicionarContext)_localctx).g1 = match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__13);
				setState(164);
				((AdicionarContext)_localctx).v1 = match(IDENT);
				setState(165);
				match(T__12);
				setState(166);
				((AdicionarContext)_localctx).g2 = match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__14);
				setState(168);
				aresta();
				setState(169);
				match(T__12);
				setState(170);
				((AdicionarContext)_localctx).g3 = match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__14);
				setState(173);
				daresta();
				setState(174);
				match(T__15);
				setState(175);
				((AdicionarContext)_localctx).g4 = match(IDENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(T__16);
				setState(178);
				((AdicionarContext)_localctx).ds = match(IDENT);
				setState(179);
				match(T__17);
				setState(180);
				((AdicionarContext)_localctx).v2 = match(IDENT);
				setState(181);
				match(T__18);
				setState(182);
				((AdicionarContext)_localctx).g5 = match(IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(T__19);
				setState(184);
				((AdicionarContext)_localctx).d1 = match(IDENT);
				setState(185);
				match(T__10);
				setState(186);
				value();
				setState(187);
				match(T__20);
				setState(188);
				((AdicionarContext)_localctx).a1 = match(IDENT);
				setState(189);
				match(T__18);
				setState(190);
				((AdicionarContext)_localctx).g6 = match(IDENT);
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

	public static class ArestaContext extends ParserRuleContext {
		public Token nome;
		public Token v1;
		public Token v2;
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public ArestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aresta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterAresta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitAresta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitAresta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArestaContext aresta() throws RecognitionException {
		ArestaContext _localctx = new ArestaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aresta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((ArestaContext)_localctx).nome = match(IDENT);
			setState(195);
			match(T__6);
			setState(196);
			((ArestaContext)_localctx).v1 = match(IDENT);
			setState(197);
			match(T__21);
			setState(198);
			((ArestaContext)_localctx).v2 = match(IDENT);
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

	public static class DarestaContext extends ParserRuleContext {
		public Token nome;
		public Token v1;
		public Token v2;
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public DarestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daresta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterDaresta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitDaresta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitDaresta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DarestaContext daresta() throws RecognitionException {
		DarestaContext _localctx = new DarestaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_daresta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((DarestaContext)_localctx).nome = match(IDENT);
			setState(201);
			match(T__6);
			setState(202);
			((DarestaContext)_localctx).v1 = match(IDENT);
			setState(203);
			match(T__22);
			setState(204);
			((DarestaContext)_localctx).v2 = match(IDENT);
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

	public static class DesenharContext extends ParserRuleContext {
		public Token grafo1;
		public TerminalNode IDENT() { return getToken(LinguagemLMGParser.IDENT, 0); }
		public DesenharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desenhar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterDesenhar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitDesenhar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitDesenhar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesenharContext desenhar() throws RecognitionException {
		DesenharContext _localctx = new DesenharContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_desenhar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__23);
			setState(207);
			((DesenharContext)_localctx).grafo1 = match(IDENT);
			setState(208);
			match(T__24);
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

	public static class LimparContext extends ParserRuleContext {
		public LimparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterLimpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitLimpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitLimpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimparContext limpar() throws RecognitionException {
		LimparContext _localctx = new LimparContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_limpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__25);
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

	public static class PlotarContext extends ParserRuleContext {
		public PlotarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plotar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterPlotar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitPlotar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitPlotar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlotarContext plotar() throws RecognitionException {
		PlotarContext _localctx = new PlotarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_plotar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__26);
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

	public static class SalvarContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LinguagemLMGParser.CADEIA, 0); }
		public SalvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterSalvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitSalvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitSalvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SalvarContext salvar() throws RecognitionException {
		SalvarContext _localctx = new SalvarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_salvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__27);
			setState(215);
			match(CADEIA);
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

	public static class ParaContext extends ParserRuleContext {
		public Token v1;
		public Token g1;
		public Token a1;
		public Token g2;
		public Token vz1;
		public Token v2;
		public Token g3;
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_para);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__28);
				setState(218);
				((ParaContext)_localctx).v1 = match(IDENT);
				setState(219);
				match(T__29);
				setState(220);
				((ParaContext)_localctx).g1 = match(IDENT);
				setState(221);
				match(T__6);
				setState(222);
				comandos();
				setState(223);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__31);
				setState(226);
				((ParaContext)_localctx).a1 = match(IDENT);
				setState(227);
				match(T__29);
				setState(228);
				((ParaContext)_localctx).g2 = match(IDENT);
				setState(229);
				match(T__6);
				setState(230);
				comandos();
				setState(231);
				match(T__30);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(T__32);
				setState(234);
				((ParaContext)_localctx).vz1 = match(IDENT);
				setState(235);
				match(T__33);
				setState(236);
				((ParaContext)_localctx).v2 = match(IDENT);
				setState(237);
				match(T__29);
				setState(238);
				((ParaContext)_localctx).g3 = match(IDENT);
				setState(239);
				match(T__6);
				setState(240);
				comandos();
				setState(241);
				match(T__30);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(LinguagemLMGParser.NUM, 0); }
		public TerminalNode CADEIA() { return getToken(LinguagemLMGParser.CADEIA, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==CADEIA || _la==NUM) ) {
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

	public static class SeContext extends ParserRuleContext {
		public Token a1;
		public Token g1;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public Comparacao_keyContext comparacao_key() {
			return getRuleContext(Comparacao_keyContext.class,0);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_se);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__34);
				setState(248);
				((SeContext)_localctx).a1 = match(IDENT);
				setState(249);
				match(T__18);
				setState(250);
				((SeContext)_localctx).g1 = match(IDENT);
				setState(251);
				match(T__35);
				setState(252);
				expressao();
				setState(253);
				match(T__6);
				setState(254);
				comandos();
				setState(255);
				senao();
				setState(256);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(T__37);
				setState(259);
				comparacao_key();
				setState(260);
				match(T__6);
				setState(261);
				comandos();
				setState(262);
				senao();
				setState(263);
				match(T__36);
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

	public static class SenaoContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitSenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_senao);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__38);
				setState(268);
				comandos();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Comparacao_keyContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Comparacao_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterComparacao_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitComparacao_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitComparacao_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparacao_keyContext comparacao_key() throws RecognitionException {
		Comparacao_keyContext _localctx = new Comparacao_keyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comparacao_key);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				key();
				setState(273);
				match(T__39);
				setState(274);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				key();
				setState(277);
				match(T__40);
				setState(278);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				key();
				setState(281);
				match(T__41);
				setState(282);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				key();
				setState(285);
				match(T__42);
				setState(286);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				key();
				setState(289);
				match(T__43);
				setState(290);
				value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				key();
				setState(293);
				match(T__44);
				setState(294);
				value();
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

	public static class KeyContext extends ParserRuleContext {
		public Token val1;
		public Token v1;
		public Token g1;
		public Token val2;
		public Token a1;
		public Token g2;
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_key);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(T__45);
				setState(299);
				((KeyContext)_localctx).val1 = match(IDENT);
				setState(300);
				match(T__46);
				setState(301);
				((KeyContext)_localctx).v1 = match(IDENT);
				setState(302);
				match(T__18);
				setState(303);
				((KeyContext)_localctx).g1 = match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__45);
				setState(305);
				((KeyContext)_localctx).val2 = match(IDENT);
				setState(306);
				match(T__47);
				setState(307);
				((KeyContext)_localctx).a1 = match(IDENT);
				setState(308);
				match(T__18);
				setState(309);
				((KeyContext)_localctx).g2 = match(IDENT);
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

	public static class ExibirContext extends ParserRuleContext {
		public Token g1;
		public Token dg1;
		public Token g2;
		public Token v1;
		public Token g3;
		public Token g4;
		public Token g5;
		public Token a1;
		public Token g6;
		public Token g7;
		public Token v2;
		public Token g8;
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExibirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exibir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterExibir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitExibir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitExibir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExibirContext exibir() throws RecognitionException {
		ExibirContext _localctx = new ExibirContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exibir);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__48);
				setState(313);
				((ExibirContext)_localctx).g1 = match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__49);
				setState(315);
				((ExibirContext)_localctx).dg1 = match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(T__50);
				setState(317);
				((ExibirContext)_localctx).g2 = match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(T__51);
				setState(319);
				((ExibirContext)_localctx).v1 = match(IDENT);
				setState(320);
				match(T__18);
				setState(321);
				((ExibirContext)_localctx).g3 = match(IDENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				match(T__50);
				setState(323);
				((ExibirContext)_localctx).g4 = match(IDENT);
				setState(324);
				match(T__52);
				setState(325);
				expressao();
				setState(326);
				match(T__53);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				match(T__54);
				setState(329);
				((ExibirContext)_localctx).g5 = match(IDENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(330);
				match(T__55);
				setState(331);
				((ExibirContext)_localctx).a1 = match(IDENT);
				setState(332);
				match(T__18);
				setState(333);
				((ExibirContext)_localctx).g6 = match(IDENT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				match(T__54);
				setState(335);
				((ExibirContext)_localctx).g7 = match(IDENT);
				setState(336);
				match(T__52);
				setState(337);
				expressao();
				setState(338);
				match(T__53);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(340);
				match(T__56);
				setState(341);
				((ExibirContext)_localctx).v2 = match(IDENT);
				setState(342);
				match(T__18);
				setState(343);
				((ExibirContext)_localctx).g8 = match(IDENT);
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

	public static class RemoverContext extends ParserRuleContext {
		public Token v1;
		public Token g1;
		public Token g2;
		public Token a1;
		public Token g3;
		public Token a2;
		public Token g4;
		public Token a3;
		public Token g5;
		public Token d1;
		public Token v2;
		public Token g6;
		public List<TerminalNode> IDENT() { return getTokens(LinguagemLMGParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LinguagemLMGParser.IDENT, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RemoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterRemover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitRemover(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitRemover(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoverContext remover() throws RecognitionException {
		RemoverContext _localctx = new RemoverContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_remover);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(T__57);
				setState(347);
				((RemoverContext)_localctx).v1 = match(IDENT);
				setState(348);
				match(T__18);
				setState(349);
				((RemoverContext)_localctx).g1 = match(IDENT);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(T__58);
				setState(351);
				((RemoverContext)_localctx).g2 = match(IDENT);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(T__59);
				setState(353);
				((RemoverContext)_localctx).a1 = match(IDENT);
				setState(354);
				match(T__18);
				setState(355);
				((RemoverContext)_localctx).g3 = match(IDENT);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(T__60);
				setState(357);
				((RemoverContext)_localctx).a2 = match(IDENT);
				setState(358);
				match(T__18);
				setState(359);
				((RemoverContext)_localctx).g4 = match(IDENT);
				setState(360);
				match(T__52);
				setState(361);
				expressao();
				setState(362);
				match(T__53);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				match(T__61);
				setState(365);
				((RemoverContext)_localctx).a3 = match(IDENT);
				setState(366);
				match(T__18);
				setState(367);
				((RemoverContext)_localctx).g5 = match(IDENT);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				match(T__62);
				setState(369);
				((RemoverContext)_localctx).d1 = match(IDENT);
				setState(370);
				match(T__33);
				setState(371);
				((RemoverContext)_localctx).v2 = match(IDENT);
				setState(372);
				match(T__18);
				setState(373);
				((RemoverContext)_localctx).g6 = match(IDENT);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Token i1;
		public Token v1;
		public Token i2;
		public Token v2;
		public Token i3;
		public Token v3;
		public Token i4;
		public Token v4;
		public Token i5;
		public Token v5;
		public Token i6;
		public Token v6;
		public Token i7;
		public Token v7;
		public Token i8;
		public Token v8;
		public TerminalNode IDENT() { return getToken(LinguagemLMGParser.IDENT, 0); }
		public TerminalNode NUM() { return getToken(LinguagemLMGParser.NUM, 0); }
		public TerminalNode CADEIA() { return getToken(LinguagemLMGParser.CADEIA, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemLMGListener ) ((LinguagemLMGListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemLMGVisitor ) return ((LinguagemLMGVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressao);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				((ExpressaoContext)_localctx).i1 = match(IDENT);
				setState(377);
				match(T__39);
				setState(378);
				((ExpressaoContext)_localctx).v1 = match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				((ExpressaoContext)_localctx).i2 = match(IDENT);
				setState(380);
				match(T__39);
				setState(381);
				((ExpressaoContext)_localctx).v2 = match(CADEIA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				((ExpressaoContext)_localctx).i3 = match(IDENT);
				setState(383);
				match(T__41);
				setState(384);
				((ExpressaoContext)_localctx).v3 = match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				((ExpressaoContext)_localctx).i4 = match(IDENT);
				setState(386);
				match(T__44);
				setState(387);
				((ExpressaoContext)_localctx).v4 = match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				((ExpressaoContext)_localctx).i5 = match(IDENT);
				setState(389);
				match(T__43);
				setState(390);
				((ExpressaoContext)_localctx).v5 = match(NUM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				((ExpressaoContext)_localctx).i6 = match(IDENT);
				setState(392);
				match(T__42);
				setState(393);
				((ExpressaoContext)_localctx).v6 = match(NUM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(394);
				((ExpressaoContext)_localctx).i7 = match(IDENT);
				setState(395);
				match(T__40);
				setState(396);
				((ExpressaoContext)_localctx).v7 = match(NUM);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(397);
				((ExpressaoContext)_localctx).i8 = match(IDENT);
				setState(398);
				match(T__40);
				setState(399);
				((ExpressaoContext)_localctx).v8 = match(CADEIA);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u0195\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\b\3\b\3\b\7\b`\n\b\f\b\16\b"+
		"c\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\177\n\13\f"+
		"\13\16\13\u0082\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a0"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00c3\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f6\n\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u010c\n\26\3\27\3\27\3\27\5\27\u0111\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u012b\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0139\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u015b\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0179\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0193\n\34\3\34\2\2\35\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\3\3\2CD\u01ad\28\3"+
		"\2\2\2\4<\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nQ\3\2\2\2\fT\3\2\2\2\16\\\3\2"+
		"\2\2\20d\3\2\2\2\22g\3\2\2\2\24t\3\2\2\2\26\u009f\3\2\2\2\30\u00c2\3\2"+
		"\2\2\32\u00c4\3\2\2\2\34\u00ca\3\2\2\2\36\u00d0\3\2\2\2 \u00d4\3\2\2\2"+
		"\"\u00d6\3\2\2\2$\u00d8\3\2\2\2&\u00f5\3\2\2\2(\u00f7\3\2\2\2*\u010b\3"+
		"\2\2\2,\u0110\3\2\2\2.\u012a\3\2\2\2\60\u0138\3\2\2\2\62\u015a\3\2\2\2"+
		"\64\u0178\3\2\2\2\66\u0192\3\2\2\289\7\3\2\29:\5\4\3\2:;\7\4\2\2;\3\3"+
		"\2\2\2<=\5\6\4\2=>\5\26\f\2>\5\3\2\2\2?@\5\b\5\2@A\5\6\4\2AM\3\2\2\2B"+
		"C\5\n\6\2CD\5\6\4\2DM\3\2\2\2EF\5\20\t\2FG\5\6\4\2GM\3\2\2\2HI\5\24\13"+
		"\2IJ\5\6\4\2JM\3\2\2\2KM\3\2\2\2L?\3\2\2\2LB\3\2\2\2LE\3\2\2\2LH\3\2\2"+
		"\2LK\3\2\2\2M\7\3\2\2\2NO\7\5\2\2OP\5\f\7\2P\t\3\2\2\2QR\7\6\2\2RS\5\16"+
		"\b\2S\13\3\2\2\2TY\7B\2\2UV\7\7\2\2VX\7B\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\r\3\2\2\2[Y\3\2\2\2\\a\7B\2\2]^\7\7\2\2^`\7B\2\2_]\3\2"+
		"\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\17\3\2\2\2ca\3\2\2\2de\7\b\2\2ef\5"+
		"\22\n\2f\21\3\2\2\2gh\7B\2\2hi\7\t\2\2ij\7\n\2\2jo\7B\2\2kl\7\7\2\2ln"+
		"\7B\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs"+
		"\7\13\2\2s\23\3\2\2\2tu\7\f\2\2uv\7B\2\2vw\7\t\2\2wx\7B\2\2xy\7\r\2\2"+
		"y\u0080\5(\25\2z{\7\7\2\2{|\7B\2\2|}\7\r\2\2}\177\5(\25\2~z\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\25\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0084\5\30\r\2\u0084\u0085\5\26\f\2\u0085\u00a0\3"+
		"\2\2\2\u0086\u0087\5\36\20\2\u0087\u0088\5\26\f\2\u0088\u00a0\3\2\2\2"+
		"\u0089\u008a\5 \21\2\u008a\u008b\5\26\f\2\u008b\u00a0\3\2\2\2\u008c\u008d"+
		"\5\"\22\2\u008d\u008e\5\26\f\2\u008e\u00a0\3\2\2\2\u008f\u0090\5$\23\2"+
		"\u0090\u0091\5\26\f\2\u0091\u00a0\3\2\2\2\u0092\u0093\5&\24\2\u0093\u0094"+
		"\5\26\f\2\u0094\u00a0\3\2\2\2\u0095\u0096\5*\26\2\u0096\u0097\5\26\f\2"+
		"\u0097\u00a0\3\2\2\2\u0098\u0099\5\62\32\2\u0099\u009a\5\26\f\2\u009a"+
		"\u00a0\3\2\2\2\u009b\u009c\5\64\33\2\u009c\u009d\5\26\f\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0083\3\2\2\2\u009f\u0086\3\2\2\2\u009f"+
		"\u0089\3\2\2\2\u009f\u008c\3\2\2\2\u009f\u008f\3\2\2\2\u009f\u0092\3\2"+
		"\2\2\u009f\u0095\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u009b\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\7B\2"+
		"\2\u00a3\u00a4\7\17\2\2\u00a4\u00c3\7B\2\2\u00a5\u00a6\7\20\2\2\u00a6"+
		"\u00a7\7B\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00c3\7B\2\2\u00a9\u00aa\7\21"+
		"\2\2\u00aa\u00ab\5\32\16\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\7B\2\2\u00ad"+
		"\u00c3\3\2\2\2\u00ae\u00af\7\21\2\2\u00af\u00b0\5\34\17\2\u00b0\u00b1"+
		"\7\22\2\2\u00b1\u00b2\7B\2\2\u00b2\u00c3\3\2\2\2\u00b3\u00b4\7\23\2\2"+
		"\u00b4\u00b5\7B\2\2\u00b5\u00b6\7\24\2\2\u00b6\u00b7\7B\2\2\u00b7\u00b8"+
		"\7\25\2\2\u00b8\u00c3\7B\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\7B\2\2\u00bb"+
		"\u00bc\7\r\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be\7\27\2\2\u00be\u00bf\7"+
		"B\2\2\u00bf\u00c0\7\25\2\2\u00c0\u00c1\7B\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00a1\3\2\2\2\u00c2\u00a5\3\2\2\2\u00c2\u00a9\3\2\2\2\u00c2\u00ae\3\2"+
		"\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c5"+
		"\7B\2\2\u00c5\u00c6\7\t\2\2\u00c6\u00c7\7B\2\2\u00c7\u00c8\7\30\2\2\u00c8"+
		"\u00c9\7B\2\2\u00c9\33\3\2\2\2\u00ca\u00cb\7B\2\2\u00cb\u00cc\7\t\2\2"+
		"\u00cc\u00cd\7B\2\2\u00cd\u00ce\7\31\2\2\u00ce\u00cf\7B\2\2\u00cf\35\3"+
		"\2\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d2\7B\2\2\u00d2\u00d3\7\33\2\2\u00d3"+
		"\37\3\2\2\2\u00d4\u00d5\7\34\2\2\u00d5!\3\2\2\2\u00d6\u00d7\7\35\2\2\u00d7"+
		"#\3\2\2\2\u00d8\u00d9\7\36\2\2\u00d9\u00da\7C\2\2\u00da%\3\2\2\2\u00db"+
		"\u00dc\7\37\2\2\u00dc\u00dd\7B\2\2\u00dd\u00de\7 \2\2\u00de\u00df\7B\2"+
		"\2\u00df\u00e0\7\t\2\2\u00e0\u00e1\5\26\f\2\u00e1\u00e2\7!\2\2\u00e2\u00f6"+
		"\3\2\2\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5\7B\2\2\u00e5\u00e6\7 \2\2\u00e6"+
		"\u00e7\7B\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00e9\5\26\f\2\u00e9\u00ea\7!"+
		"\2\2\u00ea\u00f6\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\7B\2\2\u00ed\u00ee"+
		"\7$\2\2\u00ee\u00ef\7B\2\2\u00ef\u00f0\7 \2\2\u00f0\u00f1\7B\2\2\u00f1"+
		"\u00f2\7\t\2\2\u00f2\u00f3\5\26\f\2\u00f3\u00f4\7!\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00db\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f6"+
		"\'\3\2\2\2\u00f7\u00f8\t\2\2\2\u00f8)\3\2\2\2\u00f9\u00fa\7%\2\2\u00fa"+
		"\u00fb\7B\2\2\u00fb\u00fc\7\25\2\2\u00fc\u00fd\7B\2\2\u00fd\u00fe\7&\2"+
		"\2\u00fe\u00ff\5\66\34\2\u00ff\u0100\7\t\2\2\u0100\u0101\5\26\f\2\u0101"+
		"\u0102\5,\27\2\u0102\u0103\7\'\2\2\u0103\u010c\3\2\2\2\u0104\u0105\7("+
		"\2\2\u0105\u0106\5.\30\2\u0106\u0107\7\t\2\2\u0107\u0108\5\26\f\2\u0108"+
		"\u0109\5,\27\2\u0109\u010a\7\'\2\2\u010a\u010c\3\2\2\2\u010b\u00f9\3\2"+
		"\2\2\u010b\u0104\3\2\2\2\u010c+\3\2\2\2\u010d\u010e\7)\2\2\u010e\u0111"+
		"\5\26\f\2\u010f\u0111\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u010f\3\2\2\2"+
		"\u0111-\3\2\2\2\u0112\u0113\5\60\31\2\u0113\u0114\7*\2\2\u0114\u0115\5"+
		"(\25\2\u0115\u012b\3\2\2\2\u0116\u0117\5\60\31\2\u0117\u0118\7+\2\2\u0118"+
		"\u0119\5(\25\2\u0119\u012b\3\2\2\2\u011a\u011b\5\60\31\2\u011b\u011c\7"+
		",\2\2\u011c\u011d\5(\25\2\u011d\u012b\3\2\2\2\u011e\u011f\5\60\31\2\u011f"+
		"\u0120\7-\2\2\u0120\u0121\5(\25\2\u0121\u012b\3\2\2\2\u0122\u0123\5\60"+
		"\31\2\u0123\u0124\7.\2\2\u0124\u0125\5(\25\2\u0125\u012b\3\2\2\2\u0126"+
		"\u0127\5\60\31\2\u0127\u0128\7/\2\2\u0128\u0129\5(\25\2\u0129\u012b\3"+
		"\2\2\2\u012a\u0112\3\2\2\2\u012a\u0116\3\2\2\2\u012a\u011a\3\2\2\2\u012a"+
		"\u011e\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0126\3\2\2\2\u012b/\3\2\2\2"+
		"\u012c\u012d\7\60\2\2\u012d\u012e\7B\2\2\u012e\u012f\7\61\2\2\u012f\u0130"+
		"\7B\2\2\u0130\u0131\7\25\2\2\u0131\u0139\7B\2\2\u0132\u0133\7\60\2\2\u0133"+
		"\u0134\7B\2\2\u0134\u0135\7\62\2\2\u0135\u0136\7B\2\2\u0136\u0137\7\25"+
		"\2\2\u0137\u0139\7B\2\2\u0138\u012c\3\2\2\2\u0138\u0132\3\2\2\2\u0139"+
		"\61\3\2\2\2\u013a\u013b\7\63\2\2\u013b\u015b\7B\2\2\u013c\u013d\7\64\2"+
		"\2\u013d\u015b\7B\2\2\u013e\u013f\7\65\2\2\u013f\u015b\7B\2\2\u0140\u0141"+
		"\7\66\2\2\u0141\u0142\7B\2\2\u0142\u0143\7\25\2\2\u0143\u015b\7B\2\2\u0144"+
		"\u0145\7\65\2\2\u0145\u0146\7B\2\2\u0146\u0147\7\67\2\2\u0147\u0148\5"+
		"\66\34\2\u0148\u0149\78\2\2\u0149\u015b\3\2\2\2\u014a\u014b\79\2\2\u014b"+
		"\u015b\7B\2\2\u014c\u014d\7:\2\2\u014d\u014e\7B\2\2\u014e\u014f\7\25\2"+
		"\2\u014f\u015b\7B\2\2\u0150\u0151\79\2\2\u0151\u0152\7B\2\2\u0152\u0153"+
		"\7\67\2\2\u0153\u0154\5\66\34\2\u0154\u0155\78\2\2\u0155\u015b\3\2\2\2"+
		"\u0156\u0157\7;\2\2\u0157\u0158\7B\2\2\u0158\u0159\7\25\2\2\u0159\u015b"+
		"\7B\2\2\u015a\u013a\3\2\2\2\u015a\u013c\3\2\2\2\u015a\u013e\3\2\2\2\u015a"+
		"\u0140\3\2\2\2\u015a\u0144\3\2\2\2\u015a\u014a\3\2\2\2\u015a\u014c\3\2"+
		"\2\2\u015a\u0150\3\2\2\2\u015a\u0156\3\2\2\2\u015b\63\3\2\2\2\u015c\u015d"+
		"\7<\2\2\u015d\u015e\7B\2\2\u015e\u015f\7\25\2\2\u015f\u0179\7B\2\2\u0160"+
		"\u0161\7=\2\2\u0161\u0179\7B\2\2\u0162\u0163\7>\2\2\u0163\u0164\7B\2\2"+
		"\u0164\u0165\7\25\2\2\u0165\u0179\7B\2\2\u0166\u0167\7?\2\2\u0167\u0168"+
		"\7B\2\2\u0168\u0169\7\25\2\2\u0169\u016a\7B\2\2\u016a\u016b\7\67\2\2\u016b"+
		"\u016c\5\66\34\2\u016c\u016d\78\2\2\u016d\u0179\3\2\2\2\u016e\u016f\7"+
		"@\2\2\u016f\u0170\7B\2\2\u0170\u0171\7\25\2\2\u0171\u0179\7B\2\2\u0172"+
		"\u0173\7A\2\2\u0173\u0174\7B\2\2\u0174\u0175\7$\2\2\u0175\u0176\7B\2\2"+
		"\u0176\u0177\7\25\2\2\u0177\u0179\7B\2\2\u0178\u015c\3\2\2\2\u0178\u0160"+
		"\3\2\2\2\u0178\u0162\3\2\2\2\u0178\u0166\3\2\2\2\u0178\u016e\3\2\2\2\u0178"+
		"\u0172\3\2\2\2\u0179\65\3\2\2\2\u017a\u017b\7B\2\2\u017b\u017c\7*\2\2"+
		"\u017c\u0193\7D\2\2\u017d\u017e\7B\2\2\u017e\u017f\7*\2\2\u017f\u0193"+
		"\7C\2\2\u0180\u0181\7B\2\2\u0181\u0182\7,\2\2\u0182\u0193\7D\2\2\u0183"+
		"\u0184\7B\2\2\u0184\u0185\7/\2\2\u0185\u0193\7D\2\2\u0186\u0187\7B\2\2"+
		"\u0187\u0188\7.\2\2\u0188\u0193\7D\2\2\u0189\u018a\7B\2\2\u018a\u018b"+
		"\7-\2\2\u018b\u0193\7D\2\2\u018c\u018d\7B\2\2\u018d\u018e\7+\2\2\u018e"+
		"\u0193\7D\2\2\u018f\u0190\7B\2\2\u0190\u0191\7+\2\2\u0191\u0193\7C\2\2"+
		"\u0192\u017a\3\2\2\2\u0192\u017d\3\2\2\2\u0192\u0180\3\2\2\2\u0192\u0183"+
		"\3\2\2\2\u0192\u0186\3\2\2\2\u0192\u0189\3\2\2\2\u0192\u018c\3\2\2\2\u0192"+
		"\u018f\3\2\2\2\u0193\67\3\2\2\2\21LYao\u0080\u009f\u00c2\u00f5\u010b\u0110"+
		"\u012a\u0138\u015a\u0178\u0192";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}