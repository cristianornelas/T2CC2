// Generated from .\LinguagemLMG.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguagemLMGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguagemLMGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LinguagemLMGParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(LinguagemLMGParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(LinguagemLMGParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#criar_grafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriar_grafo(LinguagemLMGParser.Criar_grafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#criar_dgrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriar_dgrafo(LinguagemLMGParser.Criar_dgrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#grafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrafo(LinguagemLMGParser.GrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#dgrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDgrafo(LinguagemLMGParser.DgrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#criar_vertices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriar_vertices(LinguagemLMGParser.Criar_verticesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#vertices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertices(LinguagemLMGParser.VerticesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#criar_dados}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriar_dados(LinguagemLMGParser.Criar_dadosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(LinguagemLMGParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#adicionar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdicionar(LinguagemLMGParser.AdicionarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#aresta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAresta(LinguagemLMGParser.ArestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#daresta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaresta(LinguagemLMGParser.DarestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#desenhar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesenhar(LinguagemLMGParser.DesenharContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#limpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimpar(LinguagemLMGParser.LimparContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#plotar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlotar(LinguagemLMGParser.PlotarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#salvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalvar(LinguagemLMGParser.SalvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(LinguagemLMGParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LinguagemLMGParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#se}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(LinguagemLMGParser.SeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao(LinguagemLMGParser.SenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#comparacao_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacao_key(LinguagemLMGParser.Comparacao_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(LinguagemLMGParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#exibir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExibir(LinguagemLMGParser.ExibirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#remover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemover(LinguagemLMGParser.RemoverContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemLMGParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(LinguagemLMGParser.ExpressaoContext ctx);
}