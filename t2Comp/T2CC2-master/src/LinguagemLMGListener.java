// Generated from .\LinguagemLMG.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguagemLMGParser}.
 */
public interface LinguagemLMGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LinguagemLMGParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LinguagemLMGParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(LinguagemLMGParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(LinguagemLMGParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LinguagemLMGParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LinguagemLMGParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#criar_grafo}.
	 * @param ctx the parse tree
	 */
	void enterCriar_grafo(LinguagemLMGParser.Criar_grafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#criar_grafo}.
	 * @param ctx the parse tree
	 */
	void exitCriar_grafo(LinguagemLMGParser.Criar_grafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#criar_dgrafo}.
	 * @param ctx the parse tree
	 */
	void enterCriar_dgrafo(LinguagemLMGParser.Criar_dgrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#criar_dgrafo}.
	 * @param ctx the parse tree
	 */
	void exitCriar_dgrafo(LinguagemLMGParser.Criar_dgrafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#grafo}.
	 * @param ctx the parse tree
	 */
	void enterGrafo(LinguagemLMGParser.GrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#grafo}.
	 * @param ctx the parse tree
	 */
	void exitGrafo(LinguagemLMGParser.GrafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#dgrafo}.
	 * @param ctx the parse tree
	 */
	void enterDgrafo(LinguagemLMGParser.DgrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#dgrafo}.
	 * @param ctx the parse tree
	 */
	void exitDgrafo(LinguagemLMGParser.DgrafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#criar_vertices}.
	 * @param ctx the parse tree
	 */
	void enterCriar_vertices(LinguagemLMGParser.Criar_verticesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#criar_vertices}.
	 * @param ctx the parse tree
	 */
	void exitCriar_vertices(LinguagemLMGParser.Criar_verticesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#vertices}.
	 * @param ctx the parse tree
	 */
	void enterVertices(LinguagemLMGParser.VerticesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#vertices}.
	 * @param ctx the parse tree
	 */
	void exitVertices(LinguagemLMGParser.VerticesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#criar_dados}.
	 * @param ctx the parse tree
	 */
	void enterCriar_dados(LinguagemLMGParser.Criar_dadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#criar_dados}.
	 * @param ctx the parse tree
	 */
	void exitCriar_dados(LinguagemLMGParser.Criar_dadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(LinguagemLMGParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(LinguagemLMGParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#adicionar}.
	 * @param ctx the parse tree
	 */
	void enterAdicionar(LinguagemLMGParser.AdicionarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#adicionar}.
	 * @param ctx the parse tree
	 */
	void exitAdicionar(LinguagemLMGParser.AdicionarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#aresta}.
	 * @param ctx the parse tree
	 */
	void enterAresta(LinguagemLMGParser.ArestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#aresta}.
	 * @param ctx the parse tree
	 */
	void exitAresta(LinguagemLMGParser.ArestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#daresta}.
	 * @param ctx the parse tree
	 */
	void enterDaresta(LinguagemLMGParser.DarestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#daresta}.
	 * @param ctx the parse tree
	 */
	void exitDaresta(LinguagemLMGParser.DarestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#desenhar}.
	 * @param ctx the parse tree
	 */
	void enterDesenhar(LinguagemLMGParser.DesenharContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#desenhar}.
	 * @param ctx the parse tree
	 */
	void exitDesenhar(LinguagemLMGParser.DesenharContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#limpar}.
	 * @param ctx the parse tree
	 */
	void enterLimpar(LinguagemLMGParser.LimparContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#limpar}.
	 * @param ctx the parse tree
	 */
	void exitLimpar(LinguagemLMGParser.LimparContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#plotar}.
	 * @param ctx the parse tree
	 */
	void enterPlotar(LinguagemLMGParser.PlotarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#plotar}.
	 * @param ctx the parse tree
	 */
	void exitPlotar(LinguagemLMGParser.PlotarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#salvar}.
	 * @param ctx the parse tree
	 */
	void enterSalvar(LinguagemLMGParser.SalvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#salvar}.
	 * @param ctx the parse tree
	 */
	void exitSalvar(LinguagemLMGParser.SalvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(LinguagemLMGParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(LinguagemLMGParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LinguagemLMGParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LinguagemLMGParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(LinguagemLMGParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(LinguagemLMGParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(LinguagemLMGParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(LinguagemLMGParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#comparacao_key}.
	 * @param ctx the parse tree
	 */
	void enterComparacao_key(LinguagemLMGParser.Comparacao_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#comparacao_key}.
	 * @param ctx the parse tree
	 */
	void exitComparacao_key(LinguagemLMGParser.Comparacao_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(LinguagemLMGParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(LinguagemLMGParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#exibir}.
	 * @param ctx the parse tree
	 */
	void enterExibir(LinguagemLMGParser.ExibirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#exibir}.
	 * @param ctx the parse tree
	 */
	void exitExibir(LinguagemLMGParser.ExibirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#remover}.
	 * @param ctx the parse tree
	 */
	void enterRemover(LinguagemLMGParser.RemoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#remover}.
	 * @param ctx the parse tree
	 */
	void exitRemover(LinguagemLMGParser.RemoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemLMGParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LinguagemLMGParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemLMGParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LinguagemLMGParser.ExpressaoContext ctx);
}