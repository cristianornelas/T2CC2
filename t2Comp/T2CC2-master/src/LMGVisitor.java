
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author crist
 */
public class LMGVisitor extends LinguagemLMGBaseVisitor {
    int needtab = 0;
    String needtabstr = "";
    StringBuffer codigo = new StringBuffer();
    String num;
    TabelaDeSimbolos table;
    Escopos escopos;
    
    public LMGVisitor() {
        escopos = new Escopos();
        //#Gerador de Codigo
        codigo.append(needtabstr+"import networkx as nx\n" + "import matplotlib.pyplot as plt\n");
    }
    
    public void addTab(){
        needtabstr +="\t";
    }
    
    public void rmTab(){
        needtabstr = needtabstr.substring(0,(needtabstr.length()-1));
    }
    
    @Override   
    public Object visitPlotar(LinguagemLMGParser.PlotarContext ctx) {
        //#Gerador de Codigo
        codigo.append(needtabstr+"plt.show()\n");
        return null;
    }
    
    @Override
    public Object visitPrograma(LinguagemLMGParser.ProgramaContext ctx) {
        escopos.empilhar();
        super.visitCorpo(ctx.corpo());
        escopos.desempilhar();

        return null;
    }

    @Override
    public Object visitGrafo(LinguagemLMGParser.GrafoContext ctx) {
        if (!escopos.pegarEscopoAtual().existe(ctx.grafo1.getText())) {
            escopos.pegarEscopoAtual().inserir(ctx.grafo1.getText(), 0, ctx.grafo1.getLine());
            //#Gerador de Codigo
            codigo.append(needtabstr+ctx.grafo1.getText() + " = nx.MultiGraph()\n");
        } else {
            System.err.println("Linha " + ctx.grafo1.getLine() + ": Variavel " + ctx.grafo1.getText() + " ja existe neste escopo.");
            System.exit(0);
        }
        for (int i = 0; i < ctx.outrosGrafos.size(); i++) {
            if (!escopos.pegarEscopoAtual().existe(ctx.outrosGrafos.get(i).getText())) {
                escopos.pegarEscopoAtual().inserir(ctx.outrosGrafos.get(i).getText(), 0, ctx.outrosGrafos.get(i).getLine());
            } else {
                System.err.println("Linha " + ctx.outrosGrafos.get(i).getLine() + ": Variavel " + ctx.outrosGrafos.get(i).getText() + " ja existe neste escopo.");
                System.exit(0);
            }
        }

        return null;
    }

    @Override
    public Object visitDgrafo(LinguagemLMGParser.DgrafoContext ctx) {
        if (!escopos.pegarEscopoAtual().existe(ctx.dgrafo1.getText())) {
            escopos.pegarEscopoAtual().inserir(ctx.dgrafo1.getText(), 1, ctx.dgrafo1.getLine());
            //#Gerador de Codigo
            codigo.append(needtabstr+ctx.dgrafo1.getText()+" = nx.MultiDiGraph()\n");
        } else {
            System.err.println("Linha " + ctx.dgrafo1.getLine() + ": Variavel " + ctx.dgrafo1.getText() + " ja existe neste escopo.");
            System.exit(0);
        }
        for (int i = 0; i < ctx.outrosDGrafos.size(); i++) {
            if (!escopos.pegarEscopoAtual().existe(ctx.outrosDGrafos.get(i).getText())) {
                escopos.pegarEscopoAtual().inserir(ctx.outrosDGrafos.get(i).getText(), 1, ctx.outrosDGrafos.get(i).getLine());
            } else {
                System.err.println("Linha " + ctx.outrosDGrafos.get(i).getLine() + ": Variavel " + ctx.outrosDGrafos.get(i).getText() + " ja existe neste escopo.");
                System.exit(0);
            }
        }

        return null;
    }

    @Override
    public Object visitVertices(LinguagemLMGParser.VerticesContext ctx) {
        //Adiciona todos os vertices dentro de uma lista
        List<String> vertices = new ArrayList<String>();
        vertices.add(ctx.vertice1.getText());

        for (int i = 0; i < ctx.outrosVertices.size(); i++) {
            vertices.add(ctx.outrosVertices.get(i).getText());
        }

        for (int i = 0; i < vertices.size(); i++) {
            if (!escopos.pegarEscopoAtual().existe(vertices.get(i))) {
                escopos.pegarEscopoAtual().inserir(vertices.get(i), ctx.vertice1.getLine());
            }
        }

        //Adiciona o nome da lista da tabela e associa a lista de vertices a esse nome
        if (!escopos.pegarEscopoAtual().existe(ctx.nome.getText())) {
            escopos.pegarEscopoAtual().inserir(ctx.nome.getText(), vertices, ctx.nome.getLine());
        } else {
            System.err.println("Linha " + ctx.IDENT.getLine() + ": Variavel " + ctx.IDENT.getText() + " ja existe neste escopo.");
            System.exit(0);
        }
        //#Gerador de Codigo
        List<String> vaux = new ArrayList<String>();
        for(String v : vertices){
            vaux.add("\'"+v.toString()+"\'");
        }
        codigo.append(needtabstr+ctx.nome.getText() + " = " + vaux + "\n");
        return null;
    }

    @Override
    public Object visitValue(LinguagemLMGParser.ValueContext ctx) {
        if (ctx.CADEIA() == null) {
            return ctx.NUM().getText();
        } else {
            return ctx.CADEIA().getText();
        }
    }

 
   
    
    @Override
    public Object visitCriar_dados(LinguagemLMGParser.Criar_dadosContext ctx) {
        LinkedHashMap atributos = new LinkedHashMap<>();
        LinkedHashMap atributos2 = new LinkedHashMap<>();
        atributos.put(ctx.nome.getText() + "." + ctx.dado1.getText(), visitValue(ctx.valor1));
        atributos2.put(ctx.dado1.getText(), visitValue(ctx.valor1));

        for (int i = 0; i < ctx.outrosDados.size(); i++) {
            atributos.put(ctx.nome.getText() + "." + ctx.outrosDados.get(i).getText(), ctx.outrosValores.get(i).getText());
            atributos2.put(ctx.outrosDados.get(i).getText(), ctx.outrosValores.get(i).getText());

        }

        if (!escopos.pegarEscopoAtual().existe(ctx.nome.getText())) {
            escopos.pegarEscopoAtual().inserir(ctx.nome.getText(), atributos2, ctx.nome.getLine());
        } else {
            System.err.println("Linha " + ctx.nome.getLine() + ": Variavel " + ctx.nome.getText() + " ja existe neste escopo.");
            System.exit(0);
        }

        // Adiciona todos os dados do conjunto na tabela de simbolos.
        for (Object key : atributos.keySet()) {
            if (escopos.pegarEscopoAtual().existe(key.toString())) {
                System.err.println("Linha " + ctx.nome.getLine() + ": Variavel " + key.toString() + " ja existe neste escopo.");
                System.exit(0);
            } else {
                //Verifica se o valor eh um float ou uma string e chama o metodo inserir adequado
                Object visitValue = atributos.get(key);
                float value;
                try {
                    value = Float.parseFloat(visitValue.toString());
                    escopos.pegarEscopoAtual().inserir(key.toString(), value, ctx.nome.getLine());
                } catch (NumberFormatException nbe) {
                    escopos.pegarEscopoAtual().inserir(key.toString(), visitValue.toString(), ctx.nome.getLine());
                }
            }
        }
//        escopos.pegarEscopoAtual().printTabela();

        return null;
    }

    @Override
    public Object visitAresta(LinguagemLMGParser.ArestaContext ctx) {
        if (escopos.pegarEscopoAtual().existe(ctx.nome.getText())) {
            System.err.println("Linha " + ctx.nome.getLine() + ": Variavel " + ctx.nome.getText() + " ja existe neste escopo.");
            System.exit(0);
        } else {
            if (!escopos.pegarEscopoAtual().existe(ctx.v1.getText())) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Vertice " + ctx.v1.getText() + " ainda nao foi criado.");
                System.exit(0);
            }
            if (!escopos.pegarEscopoAtual().existe(ctx.v2.getText())) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Vertice " + ctx.v2.getText() + " ainda nao foi criado.");
                System.exit(0);
            }
            escopos.pegarEscopoAtual().inserir(ctx.nome.getText(), ctx.v1.getText(), ctx.v2.getText(), ctx.nome.getLine());
        }

        return ctx.nome.getText();
    }

    @Override
    public Object visitDaresta(LinguagemLMGParser.DarestaContext ctx) {
        if (escopos.pegarEscopoAtual().existe(ctx.nome.getText())) {
            System.err.println("Linha " + ctx.v1.getLine() + ": Variavel " + ctx.v1.getText() + " ja existe neste escopo.");
            System.exit(0);
        } else {
            if (!escopos.pegarEscopoAtual().existe(ctx.v1.getText())) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Vertice " + ctx.v1.getText() + " ainda nao foi criado.");
                System.exit(0);
            }
            if (!escopos.pegarEscopoAtual().existe(ctx.v2.getText())) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Vertice " + ctx.v2.getText() + " ainda nao foi criado.");
                System.exit(0);
            }
            escopos.pegarEscopoAtual().inserir(ctx.nome.getText(), ctx.v1.getText(), ctx.v2.getText(), ctx.nome.getLine());
        }

        return ctx.nome.getText();
    }

    @Override
    public Object visitAdicionar(LinguagemLMGParser.AdicionarContext ctx) {
        if (ctx.vs != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.vs.getText())) {
                System.err.println("Linha " + ctx.vs.getLine() + ": Variavel " + ctx.vs.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.vs.getText()) != 1) {
                System.err.println("Linha " + ctx.vs.getLine() + ": Variavel " + ctx.vs.getText() + " deve ser uma lista de vertices.");
                System.exit(0);
            }
        }
        if (ctx.v1 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.v1.getText())) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Variavel " + ctx.v1.getText() + " ja existe neste escopo.");
                System.exit(0);
            } else {
                if (ctx.g2 != null) {
                    if (!escopos.pegarEscopoAtual().existe(ctx.g2.getText())) {
                        System.err.println("Linha " + ctx.g2.getLine() + ": Variavel " + ctx.g2.getText() + " ainda nao foi criada.");
                        System.exit(0);
                    } else {
                        if (escopos.pegarEscopoAtual().getTipo(ctx.g2.getText()) != 0) {
                            System.err.println("Linha " + ctx.g2.getLine() + ": Variavel " + ctx.g2.getText() + " deve ser um grafo.");
                            System.exit(0);
                        } else {
                            escopos.pegarEscopoAtual().inserir(ctx.v1.getText(), ctx.v1.getLine());
                        }
                    }
                }
            }
        }
        if (ctx.v2 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.v2.getText())) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Variavel " + ctx.v2.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else {
                if (escopos.pegarEscopoAtual().getTipo(ctx.v2.getText()) != 4) {
                    System.err.println("Linha " + ctx.v2.getLine() + ": Variavel " + ctx.v2.getText() + " deve ser um vertice.");
                    System.exit(0);
                }
            }
        }
        if (ctx.ds != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.ds.getText())) {
                System.err.println("Linha " + ctx.ds.getLine() + ": Variavel " + ctx.ds.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.ds.getText()) != 3) {
                System.err.println("Linha " + ctx.ds.getLine() + ": Variavel " + ctx.ds.getText() + " deve ser um conjunto de dados.");
                System.exit(0);
            }
        }
        if (ctx.d1 != null && ctx.a1 != null && ctx.g6 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.d1.getText())) {
                System.err.println("Linha " + ctx.d1.getLine() + ": Variavel " + ctx.d1.getText() + " ja existe neste escopo.");
                System.exit(0);
            } else {
                if (!escopos.pegarEscopoAtual().existe(ctx.a1.getText())) {
                    System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " ainda nao foi criada.");
                    System.exit(0);
                } else if (escopos.pegarEscopoAtual().getTipo(ctx.a1.getText()) != 2) {
                    System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " deve ser uma aresta.");
                    System.exit(0);
                }
                if (!escopos.pegarEscopoAtual().existe(ctx.g6.getText())) {
                    System.err.println("Linha " + ctx.g6.getLine() + ": Variavel " + ctx.g6.getText() + " ainda nao foi criada.");
                    System.exit(0);
                } else if (escopos.pegarEscopoAtual().getTipo(ctx.g6.getText()) != 0) {
                    System.err.println("Linha " + ctx.g6.getLine() + ": Variavel " + ctx.g6.getText() + " deve ser um grafo.");
                    System.exit(0);
                }

                //Verifica se o retorno de value eh um float ou uma string e chama o metodo inserir adequado
                Object visitValue = visitValue(ctx.value());
                float value;
                try {
                    value = Float.parseFloat(visitValue.toString());
                    escopos.pegarEscopoAtual().inserir(ctx.a1.getText() + "." + ctx.d1.getText(), value, ctx.d1.getLine());
                } catch (NumberFormatException nbe) {
                    escopos.pegarEscopoAtual().inserir(ctx.a1.getText() + "." + ctx.d1.getText(), visitValue.toString(), ctx.d1.getLine());
                }

            }
        }

        if (ctx.g1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g1.getText())) {
                System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g1.getText()) != 0) {
                System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }
        if (ctx.g3 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g3.getText())) {
                System.err.println("Linha " + ctx.g3.getLine() + ": Variavel " + ctx.g3.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g3.getText()) != 0) {
                System.err.println("Linha " + ctx.g3.getLine() + ": Variavel " + ctx.g3.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }
        if (ctx.g4 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g4.getText())) {
                System.err.println("Linha " + ctx.g4.getLine() + ": Variavel " + ctx.g4.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g4.getText()) != 0) {
                System.err.println("Linha " + ctx.g4.getLine() + ": Variavel " + ctx.g4.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }
        if (ctx.g5 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g5.getText())) {
                System.err.println("Linha " + ctx.g5.getLine() + ": Variavel " + ctx.g5.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g5.getText()) != 0) {
                System.err.println("Linha " + ctx.g5.getLine() + ": Variavel " + ctx.g5.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }

        if (ctx.vs != null && ctx.g1 != null) {
            for (String v : escopos.pegarEscopoAtual().getElement(ctx.vs.getText()).vertices) {
                escopos.pegarEscopoAtual().getElement(v).addParent(ctx.g1.getText());

            }
            //#Gerador de Codigo
            codigo.append(needtabstr+ctx.g1.getText() + ".add_nodes_from(" + ctx.vs.getText() + ")\n");
        }

        if (ctx.v1 != null && ctx.g2 != null) {
            escopos.pegarEscopoAtual().getElement(ctx.v1.getText()).addParent(ctx.g2.getText());
        }

        if (ctx.g3 != null) {
            String aux;
            escopos.pegarEscopoAtual().getElement(aux = visitAresta(ctx.aresta()).toString()).addParent(ctx.g3.getText());
            //#Gerador de Codigo
            codigo.append(needtabstr+ctx.g3.getText() + ".add_edge(\'" + ctx.aresta().v1.getText() + "\',\'" + ctx.aresta().v2.getText() + "\',key=\'" + aux + "\')\n");
        }

        if (ctx.g4 != null) {
            escopos.pegarEscopoAtual().getElement(visitDaresta(ctx.daresta()).toString()).addParent(ctx.g4.getText());
            
            
        }

        //variaveis
        EntradaTabelaDeSimbolos aux = new EntradaTabelaDeSimbolos();

        if (ctx.ds != null && ctx.v2 != null & ctx.g5 != null) {
            if (escopos.pegarEscopoAtual().getElement(ctx.v2.getText()).isChild(ctx.g5.getText())) {
                escopos.pegarEscopoAtual().getElement(ctx.ds.getText()).addParent(ctx.v2.getText());
                //#Gerador de Codigo
                codigo.append(needtabstr+ctx.g5.getText() + ".add_node(\"" + ctx.v2.getText() + "\"");
                aux = escopos.pegarEscopoAtual().getElement(ctx.ds.getText());
                for (Object key : aux.atributos.keySet()) {
                    //#Gerador de Codigo
                    codigo.append(needtabstr+",");
                    float value;
                    try {
                        value = Float.parseFloat(aux.atributos.get(key).toString());
                        escopos.pegarEscopoAtual().inserir(ctx.v2.getText() + "." + key.toString(), value, ctx.ds.getLine());
                        escopos.pegarEscopoAtual().getElement(ctx.v2.getText() + "." + key.toString()).addParent(ctx.v2.getText());
                        //#Gerador de Codigo
                        codigo.append(needtabstr+key.toString() + "=" + value);

                    } catch (NumberFormatException nbe) {
                        escopos.pegarEscopoAtual().inserir(ctx.v2.getText() + "." + key.toString(), aux.atributos.get(key).toString(), ctx.ds.getLine());
                        escopos.pegarEscopoAtual().getElement(ctx.v2.getText() + "." + key.toString()).addParent(ctx.v2.getText());
                        //#Gerador de Codigo
                        codigo.append(needtabstr+key.toString() + "=" + aux.atributos.get(key).toString());
                    }
                }
                //#Gerador de Codigo
                codigo.append(needtabstr+")\n");

            } else {
                System.err.println("Linha " + ctx.v2.getLine() + ": Vertice " + ctx.v2.getText() + " nao pertence ao grafo " + ctx.g5.getText());
                System.exit(0);
            }

            //Adiciona os parents pra cada dado do conjunto
            for (Object key : escopos.pegarEscopoAtual().getElement(ctx.ds.getText()).atributos.keySet()) {
                escopos.pegarEscopoAtual().getElement(ctx.ds.getText() + "." + key.toString()).addParent(ctx.v2.getText());
            }

        }

        if (ctx.d1 != null && ctx.a1 != null && ctx.g6 != null) {
            if (escopos.pegarEscopoAtual().getElement(ctx.a1.getText()).isChild(ctx.g6.getText())) {
                escopos.pegarEscopoAtual().getElement(ctx.a1.getText() + "." + ctx.d1.getText()).addParent(ctx.a1.getText());
                //#Gerador de Codigo
                codigo.append(needtabstr+ctx.g6.getText()+".add_edge(\'");
                codigo.append(needtabstr+escopos.pegarEscopoAtual().getElement(ctx.a1.getText()).vertice1);
                codigo.append(needtabstr+"\',\'");
                codigo.append(needtabstr+escopos.pegarEscopoAtual().getElement(ctx.a1.getText()).vertice2);
                codigo.append(needtabstr+"\',key=\'"+ctx.a1.getText()+"\',"+ctx.d1.getText()+"=");
                try {
                        float value = Float.parseFloat(ctx.value().toString());
                        //#Gerador de Codigo
                        codigo.append(needtabstr+value);

                    } catch (NumberFormatException nbe) {
                        
                        //#Gerador de Codigo
                        codigo.append(needtabstr+ctx.value().getText());
                    }
                //#Gerador de Codigo
                codigo.append(needtabstr+")\n");
            } else {
                System.err.println("Linha " + ctx.a1.getLine() + ": Aresta " + ctx.a1.getText() + " nao pertence ao grafo " + ctx.g6.getText());
                System.exit(0);
            }
        }

        return null;
    }

    @Override
    public Object visitDesenhar(LinguagemLMGParser.DesenharContext ctx) {
        if (!escopos.pegarEscopoAtual().existe(ctx.grafo1.getText())) {
            System.err.println("Linha " + ctx.grafo1.getLine() + ": Variavel " + ctx.grafo1.getText() + " ainda nao foi criada.");
            System.exit(0);
        } else {
            if (escopos.pegarEscopoAtual().getTipo(ctx.grafo1.getText()) != 0) {
                System.err.println("Linha " + ctx.grafo1.getLine() + ": Variavel " + ctx.grafo1.getText() + " deve ser um grafo.");
                System.exit(0);
            }else{
                //#Gerador de Codigo
                
                    codigo.append(needtabstr+"nx.draw_networkx("+ctx.grafo1.getText()+",with_labels=True)\n");
               
                    
            }
        }
        return null;
    }

    @Override
    public Object visitLimpar(LinguagemLMGParser.LimparContext ctx) {
        //#Gerador de Codigo
        codigo.append(needtabstr+"plt.clf()\n");
        return null; 
    }
    
    @Override
    public Object visitPara(LinguagemLMGParser.ParaContext ctx) {
        if (ctx.v1 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.v1.getText())) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Variavel " + ctx.v1.getText() + " ja existe neste escopo.");
                System.exit(0);
            } else {
                escopos.pegarEscopoAtual().inserir(ctx.v1.getText(), ctx.v1.getLine());
                escopos.pegarEscopoAtual().getElement(ctx.v1.getText()).addParent(ctx.g1.getText());
                //#Gerador de Codigo
                codigo.append(needtabstr+"for "+ctx.v1.getText()+" in list("+ctx.g1.getText()+".nodes()):\n");
                addTab();
            }
        }
        if (ctx.a1 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.a1.getText())) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " ja existe neste escopo.");
                System.exit(0);
            } else {
                escopos.pegarEscopoAtual().inserir(ctx.a1.getText(), "none", "nome", ctx.a1.getLine());
                escopos.pegarEscopoAtual().getElement(ctx.a1.getText()).addParent(ctx.g2.getText());
            }
        }
        if (ctx.vz1 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.vz1.getText())) {
                System.err.println("Linha " + ctx.vz1.getLine() + ": Variavel " + ctx.vz1.getText() + " ja existe neste escopo.");
                System.exit(0);
            } else {
                escopos.pegarEscopoAtual().inserir(ctx.vz1.getText(), ctx.vz1.getLine());
                escopos.pegarEscopoAtual().getElement(ctx.vz1.getText()).addParent(ctx.g3.getText());
            }
        }
        if (ctx.g1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g1.getText())) {
                System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " ainda nao foi declarada.");
                System.exit(0);
            } else {
                if (escopos.pegarEscopoAtual().getTipo(ctx.g1.getText()) != 0) {
                    System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " deve ser um grafo.");
                    System.exit(0);
                }
            }
        }
        if (ctx.g2 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g2.getText())) {
                System.err.println("Linha " + ctx.g2.getLine() + ": Variavel " + ctx.g2.getText() + " ainda nao foi declarada.");
                System.exit(0);
            } else {
                if (escopos.pegarEscopoAtual().getTipo(ctx.g2.getText()) != 0) {
                    System.err.println("Linha " + ctx.g2.getLine() + ": Variavel " + ctx.g2.getText() + " deve ser um grafo.");
                    System.exit(0);
                }
            }
        }
        if (ctx.g3 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g3.getText())) {
                System.err.println("Linha " + ctx.g3.getLine() + ": Variavel " + ctx.g3.getText() + " ainda nao foi declarada.");
                System.exit(0);
            } else {
                if (escopos.pegarEscopoAtual().getTipo(ctx.g3.getText()) != 0) {
                    System.err.println("Linha " + ctx.g3.getLine() + ": Variavel " + ctx.g3.getText() + " deve ser um grafo.");
                    System.exit(0);
                }
            }
        }
        if (ctx.v2 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.v2.getText())) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Variavel " + ctx.v2.getText() + " ainda nao foi declarada.");
                System.exit(0);
            } else {
                if (escopos.pegarEscopoAtual().getTipo(ctx.v2.getText()) != 4) {
                    System.err.println("Linha " + ctx.v2.getLine() + ": Variavel " + ctx.v2.getText() + " deve ser um vertice.");
                    System.exit(0);
                }
            }
        }

        if (ctx.v2 != null && ctx.g3 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.v2.getText()).isChild(ctx.g3.getText())) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Vertice " + ctx.v2.getText() + " nao pertence ao grafo " + ctx.g3.getText());
                System.exit(0);
            }
        }

        visitChildren(ctx);
        
        //#Gerador de Codigo
        rmTab();
        if (ctx.v1 != null) {
            escopos.pegarEscopoAtual().remover(ctx.v1.getText());
        }
        if (ctx.a1 != null) {
            escopos.pegarEscopoAtual().remover(ctx.a1.getText());
        }
        if (ctx.vz1 != null) {
            escopos.pegarEscopoAtual().remover(ctx.vz1.getText());
        }

        return null;
    }

    @Override
    public Object visitSalvar(LinguagemLMGParser.SalvarContext ctx) {
        //#Gerador de Codigo
        codigo.append(needtabstr+"plt.savefig("+ctx.CADEIA().toString()+")");
        return null;
    }
    
    @Override
    public Object visitSe(LinguagemLMGParser.SeContext ctx) {

        if (ctx.a1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.a1.getText())) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " ainda nao foi declarada.");
                System.exit(0);
            } else {
                //verifica se a variavel eh uma aresta
                if (escopos.pegarEscopoAtual().getTipo(ctx.a1.getText()) != 2) {
                    System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " deve ser uma aresta.");
                    System.exit(0);
                }
            }
        }

        if (ctx.g1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g1.getText())) {
                System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " ainda nao foi declarada.");
                System.exit(0);
            } else {
                //verifica se a variavel eh um grafo
                if (escopos.pegarEscopoAtual().getTipo(ctx.g1.getText()) != 0) {
                    System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " deve ser um grafo.");
                    System.exit(0);
                }
            }
        }

        if (ctx.a1 != null && ctx.g1 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.a1.getText()).isChild(ctx.g1.getText())) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Aresta " + ctx.a1.getText() + " nao pertence ao grafo " + ctx.g1.getText());
                System.exit(0);
            }
        }
        try {
            num = ctx.a1.getText();
        } catch (NullPointerException e) {

        }
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitExibir(LinguagemLMGParser.ExibirContext ctx) {

        if (ctx.v1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.v1.getText())) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Variavel " + ctx.v1.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.v1.getText()) != 4) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Variavel " + ctx.v1.getText() + " deve ser um vertice.");
                System.exit(0);
            }
        }
        if (ctx.v2 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.v2.getText())) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Variavel " + ctx.v2.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.v2.getText()) != 4) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Variavel " + ctx.v2.getText() + " deve ser um vertice.");
                System.exit(0);
            }
        }
        if (ctx.a1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.a1.getText())) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.a1.getText()) != 2) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " deve ser uma aresta.");
                System.exit(0);
            }
        }
        if (ctx.g1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g1.getText())) {
                System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g1.getText()) != 0) {
                System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " deve ser um grafo.");
                System.exit(0);
            }
            //#Gerador de Codigo
            codigo.append(needtabstr+"nx.info("+ctx.g1.getText()+")\n");
        }
        if (ctx.g2 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g2.getText())) {
                System.err.println("Linha " + ctx.g2.getLine() + ": Variavel " + ctx.g2.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g2.getText()) != 0) {
                System.err.println("Linha " + ctx.g2.getLine() + ": Variavel " + ctx.g2.getText() + " deve ser um grafo.");
                System.exit(0);
            }
            //#Gerador de Codigo
            codigo.append(needtabstr+"print list(nx.nodes("+ctx.g2.getText()+"))\n");
        }
        if (ctx.g3 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g3.getText())) {
                System.err.println("Linha " + ctx.g3.getLine() + ": Variavel " + ctx.g3.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g3.getText()) != 0) {
                System.err.println("Linha " + ctx.g3.getLine() + ": Variavel " + ctx.g3.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }
        if (ctx.g4 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g4.getText())) {
                System.err.println("Linha " + ctx.g4.getLine() + ": Variavel " + ctx.g4.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g4.getText()) != 0) {
                System.err.println("Linha " + ctx.g4.getLine() + ": Variavel " + ctx.g4.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }
        if (ctx.g5 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g5.getText())) {
                System.err.println("Linha " + ctx.g5.getLine() + ": Variavel " + ctx.g5.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g5.getText()) != 0) {
                System.err.println("Linha " + ctx.g5.getLine() + ": Variavel " + ctx.g5.getText() + " deve ser um grafo.");
                System.exit(0);
            }
            //#Gerador de Codigo
            codigo.append(needtabstr+"print list(nx.edges("+ctx.g5.getText()+"))\n");
        }
        if (ctx.g6 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g6.getText())) {
                System.err.println("Linha " + ctx.g6.getLine() + ": Variavel " + ctx.g6.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g6.getText()) != 0) {
                System.err.println("Linha " + ctx.g6.getLine() + ": Variavel " + ctx.g6.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }
        if (ctx.g7 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g7.getText())) {
                System.err.println("Linha " + ctx.g7.getLine() + ": Variavel " + ctx.g7.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g7.getText()) != 0) {
                System.err.println("Linha " + ctx.g7.getLine() + ": Variavel " + ctx.g7.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }
        if (ctx.g8 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g8.getText())) {
                System.err.println("Linha " + ctx.g8.getLine() + ": Variavel " + ctx.g8.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g8.getText()) != 0) {
                System.err.println("Linha " + ctx.g8.getLine() + ": Variavel " + ctx.g8.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }
        if (ctx.dg1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.dg1.getText())) {
                System.err.println("Linha " + ctx.dg1.getLine() + ": Variavel " + ctx.dg1.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.dg1.getText()) != 0) {
                System.err.println("Linha " + ctx.dg1.getLine() + ": Variavel " + ctx.dg1.getText() + " deve ser um grafo.");
                System.exit(0);
            }
            //#Gerador de Codigo
            codigo.append(needtabstr+"print nx.info("+ctx.dg1.getText()+")\n");
        }

        if (ctx.v1 != null && ctx.g3 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.v1.getText()).isChild(ctx.g3.getText())) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Vertice" + ctx.v1.getText() + " nao pertence ao grafo " + ctx.g3.getText());
                System.exit(0);
            }
            //#Gerador de Codigo
            codigo.append(needtabstr+"print nx.info("+ctx.g3.getText()+",\'"+ctx.v1.getText()+"\')\n");
        }

        if (ctx.a1 != null && ctx.g6 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.a1.getText()).isChild(ctx.g6.getText())) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Aresta" + ctx.a1.getText() + " nao pertence ao grafo " + ctx.g6.getText());
                System.exit(0);
            }
            //#Gerador de Codigo
            codigo.append(needtabstr+"print nx.get_edge_attributes("+ctx.g6.getText()+","+ctx.a1.getText()+")\n");
        }

        if (ctx.v2 != null && ctx.g8 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.v2.getText()).isChild(ctx.g8.getText())) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Vertice" + ctx.v2.getText() + " nao pertence ao grafo " + ctx.g8.getText());
                System.exit(0);
            }
            //#Gerador de Codigo
            codigo.append(needtabstr+"print list(nx.neighbors("+ctx.g8.getText()+",\'"+ctx.v2.getText()+"\'))\n");
        }

        visitChildren(ctx);

        return null;
    }

    @Override
    public Object visitRemover(LinguagemLMGParser.RemoverContext ctx) {
        if (ctx.v1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.v1.getText())) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Variavel " + ctx.v1.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.v1.getText()) != 4) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Variavel " + ctx.v1.getText() + " deve ser um vertice.");
                System.exit(0);
            }
        }

        if (ctx.v2 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.v2.getText())) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Variavel " + ctx.v2.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.v2.getText()) != 4) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Variavel " + ctx.v2.getText() + " deve ser um vertice.");
                System.exit(0);
            }
        }

        if (ctx.g1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g1.getText())) {
                System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g1.getText()) != 0) {
                System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }

        if (ctx.g2 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g2.getText())) {
                System.err.println("Linha " + ctx.g2.getLine() + ": Variavel " + ctx.g2.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g2.getText()) != 0) {
                System.err.println("Linha " + ctx.g2.getLine() + ": Variavel " + ctx.g2.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }

        if (ctx.g3 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g3.getText())) {
                System.err.println("Linha " + ctx.g3.getLine() + ": Variavel " + ctx.g3.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g3.getText()) != 0) {
                System.err.println("Linha " + ctx.g3.getLine() + ": Variavel " + ctx.g3.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }

        if (ctx.g4 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g4.getText())) {
                System.err.println("Linha " + ctx.g4.getLine() + ": Variavel " + ctx.g4.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g4.getText()) != 0) {
                System.err.println("Linha " + ctx.g4.getLine() + ": Variavel " + ctx.g4.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }

        if (ctx.g5 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g5.getText())) {
                System.err.println("Linha " + ctx.g5.getLine() + ": Variavel " + ctx.g5.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g5.getText()) != 0) {
                System.err.println("Linha " + ctx.g5.getLine() + ": Variavel " + ctx.g5.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }

        if (ctx.g6 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.g6.getText())) {
                System.err.println("Linha " + ctx.g6.getLine() + ": Variavel " + ctx.g6.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.g6.getText()) != 0) {
                System.err.println("Linha " + ctx.g6.getLine() + ": Variavel " + ctx.g6.getText() + " deve ser um grafo.");
                System.exit(0);
            }
        }

        if (ctx.a1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.a1.getText())) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.a1.getText()) != 2) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " deve ser uma aresta.");
                System.exit(0);
            }
        }

        if (ctx.a2 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.a2.getText())) {
                System.err.println("Linha " + ctx.a2.getLine() + ": Variavel " + ctx.a2.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.a2.getText()) != 2) {
                System.err.println("Linha " + ctx.a2.getLine() + ": Variavel " + ctx.a2.getText() + " deve ser uma aresta.");
                System.exit(0);
            }
        }

        if (ctx.a3 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.a3.getText())) {
                System.err.println("Linha " + ctx.a3.getLine() + ": Variavel " + ctx.a3.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.a3.getText()) != 2) {
                System.err.println("Linha " + ctx.a3.getLine() + ": Variavel " + ctx.a3.getText() + " deve ser uma aresta.");
                System.exit(0);
            }
        }

        if (ctx.d1 != null) {
            if (!escopos.pegarEscopoAtual().existe(ctx.d1.getText())) {
                System.err.println("Linha " + ctx.d1.getLine() + ": Variavel " + ctx.d1.getText() + " ainda nao foi criada.");
                System.exit(0);
            } else if (escopos.pegarEscopoAtual().getTipo(ctx.d1.getText()) != 5) {
                System.err.println("Linha " + ctx.d1.getLine() + ": Variavel " + ctx.d1.getText() + " deve ser um dado.");
                System.exit(0);
            }
        }

        if (ctx.v1 != null && ctx.g1 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.v1.getText()).isChild(ctx.g1.getText())) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Vertice " + ctx.v1.getText() + " nao pertence ao grafo " + ctx.g1.getText());
                System.exit(0);
            } else {

                escopos.pegarEscopoAtual().remover(ctx.v1.getText());
                //#Gerador de Codigo
                if (needtabstr.length()>0)
                    codigo.append(needtabstr+ctx.g1.getText()+".remove_node("+ctx.v1.getText()+")\n");
                else
                    codigo.append(needtabstr+ctx.g1.getText()+".remove_node(\'"+ctx.v1.getText()+"\')\n");
               
            }
        }

        if (ctx.a1 != null && ctx.g3 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.a1.getText()).isChild(ctx.g3.getText())) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Aresta " + ctx.a1.getText() + " nao pertence ao grafo " + ctx.g3.getText());
                System.exit(0);
            }
        }

        if (ctx.a2 != null && ctx.g4 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.a2.getText()).isChild(ctx.g4.getText())) {
                System.err.println("Linha " + ctx.a2.getLine() + ": Aresta " + ctx.a2.getText() + " nao pertence ao grafo " + ctx.g4.getText());
                System.exit(0);
            }
        }

        if (ctx.a3 != null && ctx.g5 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.a3.getText()).isChild(ctx.g5.getText())) {
                System.err.println("Linha " + ctx.a3.getLine() + ": Aresta " + ctx.a3.getText() + " nao pertence ao grafo " + ctx.g5.getText());
                System.exit(0);
            }
        }

        if (ctx.d1 != null && ctx.v2 != null && ctx.g6 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.v2.getText()).isChild(ctx.g6.getText())) {
                System.err.println("Linha " + ctx.v2.getLine() + ": Vertice " + ctx.v2.getText() + " nao pertence ao grafo " + ctx.g6.getText());
                System.exit(0);
            }
            if (!escopos.pegarEscopoAtual().getElement(ctx.d1.getText()).isChild(ctx.v2.getText())) {
                System.err.println("Linha " + ctx.d1.getLine() + ": Conjunto de dados " + ctx.d1.getText() + " nao pertence ao vertice " + ctx.v2.getText());
                System.exit(0);
            } else {
                escopos.pegarEscopoAtual().remover(ctx.d1.getText());
            }
        }

        visitChildren(ctx);

        return null;
    }

    @Override
    public Object visitKey(LinguagemLMGParser.KeyContext ctx) {
        if (ctx.v1 != null && !escopos.pegarEscopoAtual().existe(ctx.v1.getText())) {
            System.err.println("Linha " + ctx.v1.getLine() + ": Variavel " + ctx.v1.getText() + " ainda nao foi declarada.");
            System.exit(0);
        }

        if (ctx.g1 != null && !escopos.pegarEscopoAtual().existe(ctx.g1.getText())) {
            System.err.println("Linha " + ctx.g1.getLine() + ": Variavel " + ctx.g1.getText() + " ainda nao foi declarada.");
            System.exit(0);
        }

        if (ctx.a1 != null && !escopos.pegarEscopoAtual().existe(ctx.a1.getText())) {
            System.err.println("Linha " + ctx.a1.getLine() + ": Variavel " + ctx.a1.getText() + " ainda nao foi declarada.");
            System.exit(0);
        }

        if (ctx.g2 != null && !escopos.pegarEscopoAtual().existe(ctx.g2.getText())) {
            System.err.println("Linha " + ctx.g2.getLine() + ": Variavel " + ctx.g2.getText() + " ainda nao foi declarada.");
            System.exit(0);
        }

        if (ctx.val1 != null && !escopos.pegarEscopoAtual().existe(ctx.v1.getText() + "." + ctx.val1.getText())) {
            //escopos.pegarEscopoAtual().printTabela();
            System.err.println("Linha " + ctx.val1.getLine() + ": Variavel " + ctx.v1.getText() + "." + ctx.val1.getText() + " ainda nao foi declarada.");
            System.exit(0);
        }

        if (ctx.val2 != null && !escopos.pegarEscopoAtual().existe(ctx.val2.getText())) {
            System.err.println("Linha " + ctx.val2.getLine() + ": Variavel " + ctx.val2.getText() + " ainda nao foi declarada.");
            System.exit(0);
        }

        if (ctx.v1 != null && ctx.g1 != null && ctx.val1 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.v1.getText()).isChild(ctx.g1.getText())) {
                System.err.println("Linha " + ctx.v1.getLine() + ": Vertice " + ctx.v1.getText() + " nao pertence ao grafo " + ctx.g1.getText());
                System.exit(0);
            }

            if (!escopos.pegarEscopoAtual().getElement(ctx.v1.getText() + "." + ctx.val1.getText()).isChild(ctx.v1.getText())) {
                System.err.println("Linha " + ctx.val1.getLine() + ": Dado " + ctx.val1.getText() + " nao pertence ao vertice " + ctx.v1.getText());
                System.exit(0);
            }
            return ctx.val1.getText();
        }

        if (ctx.a1 != null && ctx.g2 != null) {
            if (!escopos.pegarEscopoAtual().getElement(ctx.a1.getText()).isChild(ctx.g2.getText())) {
                System.err.println("Linha " + ctx.a1.getLine() + ": Aresta" + ctx.a1.getText() + " nao pertence ao grafo " + ctx.g2.getText());
                System.exit(0);
            }
            if (!escopos.pegarEscopoAtual().getElement(ctx.val2.getText()).isChild(ctx.a1.getText())) {
                System.err.println("Linha " + ctx.val2.getLine() + ": Dado " + ctx.val2.getText() + " nao pertence a aresta " + ctx.a1.getText());
                System.exit(0);
            }

            return ctx.val2.getText();
        }

        visitChildren(ctx);

        return null;
    }

    @Override
    public Object visitComparacao_key(LinguagemLMGParser.Comparacao_keyContext ctx) {
        Object visitValue = visitValue(ctx.value());
        String visitKey = visitKey(ctx.key()).toString();
        if (escopos.pegarEscopoAtual().getElement(ctx.key().v1.getText() + "." + visitKey).isFloat() && !visitValue.getClass().getSimpleName().contains("Double")) {
            int linha = escopos.pegarEscopoAtual().getElement(ctx.key().v1.getText() + "." + visitKey).linha;
            System.out.println("Linha " + linha + " tipos de " + visitKey + " e " + visitValue.toString() + " sao  incompativeis.");
            System.exit(0);
        }

        if (!escopos.pegarEscopoAtual().getElement(ctx.key().v1.getText() + "." + visitKey).isFloat() && !visitValue.getClass().getSimpleName().contains("String")) {
            int linha = escopos.pegarEscopoAtual().getElement(ctx.key().v1.getText() + "." + visitKey).linha;
            System.out.println("Linha " + linha + " tipos de " + visitKey + " e " + visitValue.toString() + " sao incompativeis.");
            System.exit(0);
        }

        return null;

    }

    @Override
    public Object visitExpressao(LinguagemLMGParser.ExpressaoContext ctx) {

        if (ctx.i1 != null && ctx.v1 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.i1.getText())) {
                if (!escopos.pegarEscopoAtual().getElement(ctx.i1.getText()).isFloat()) {
                    System.err.println("Linha " + ctx.i1.getLine() + ": tipos de " + ctx.i1.getText() + " e " + ctx.v1.getText() + " sao incompativeis.");
                    System.exit(0);
                }
            } else {
                System.err.println("Linha " + ctx.i1.getLine() + ": Variavel " + ctx.i1.getText() + " ainda nao foi declarada.");
                System.exit(0);
            }
        }

        if (ctx.i2 != null && ctx.v2 != null) {
//            escopos.pegarEscopoAtual().printTabela();
            if (escopos.pegarEscopoAtual().existe(num + "." + ctx.i2.getText())) {
                if (escopos.pegarEscopoAtual().getElement(num + "." + ctx.i2.getText()).isFloat()) {
                    System.err.println("Linha " + ctx.i2.getLine() + ": tipos de " + ctx.i2.getText() + " e " + ctx.v2.getText() + " sao incompativeis.");
                    System.exit(0);
                }
            } else {
                System.err.println("Linha " + ctx.i2.getLine() + ": Variavel " + ctx.i2.getText() + " ainda nao foi declarada.");
                System.exit(0);
            }
        }

        if (ctx.i3 != null && ctx.v3 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.i3.getText())) {
                if (!escopos.pegarEscopoAtual().getElement(ctx.i3.getText()).isFloat()) {
                    System.err.println("Linha " + ctx.i3.getLine() + ": tipos de " + ctx.i3.getText() + " e " + ctx.v3.getText() + " sao incompativeis.");
                    System.exit(0);
                }
            } else {
                System.err.println("Linha " + ctx.i3.getLine() + ": Variavel " + ctx.i3.getText() + " ainda nao foi declarada.");
                System.exit(0);
            }
        }

        if (ctx.i4 != null && ctx.v4 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.i4.getText())) {
                if (!escopos.pegarEscopoAtual().getElement(ctx.i4.getText()).isFloat()) {
                    System.err.println("Linha " + ctx.i4.getLine() + ": tipos de " + ctx.i4.getText() + " e " + ctx.v4.getText() + " sao incompativeis.");
                    System.exit(0);
                }
            } else {
                System.err.println("Linha " + ctx.i4.getLine() + ": Variavel " + ctx.i4.getText() + " ainda nao foi declarada.");
                System.exit(0);
            }
        }

        if (ctx.i5 != null && ctx.v1 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.i5.getText())) {
                if (!escopos.pegarEscopoAtual().getElement(ctx.i5.getText()).isFloat()) {
                    System.err.println("Linha " + ctx.i5.getLine() + ": tipos de " + ctx.i5.getText() + " e " + ctx.v5.getText() + " sao incompativeis.");
                    System.exit(0);
                }
            } else {
                System.err.println("Linha " + ctx.i5.getLine() + ": Variavel " + ctx.i5.getText() + " ainda nao foi declarada.");
                System.exit(0);
            }
        }

        if (ctx.i6 != null && ctx.v6 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.i6.getText())) {
                if (!escopos.pegarEscopoAtual().getElement(ctx.i6.getText()).isFloat()) {
                    System.err.println("Linha " + ctx.i6.getLine() + ": tipos de " + ctx.i6.getText() + " e " + ctx.v6.getText() + " sao incompativeis.");
                    System.exit(0);
                }
            } else {
                System.err.println("Linha " + ctx.i6.getLine() + ": Variavel " + ctx.i6.getText() + " ainda nao foi declarada.");
                System.exit(0);
            }
        }

        if (ctx.i7 != null && ctx.v7 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.i7.getText())) {
                if (!escopos.pegarEscopoAtual().getElement(ctx.i7.getText()).isFloat()) {
                    System.err.println("Linha " + ctx.i7.getLine() + ": tipos de " + ctx.i7.getText() + " e " + ctx.v7.getText() + " sao incompativeis.");
                    System.exit(0);
                }
            } else {
                System.err.println("Linha " + ctx.i7.getLine() + ": Variavel " + ctx.i7.getText() + " ainda nao foi declarada.");
                System.exit(0);
            }
        }

        if (ctx.i8 != null && ctx.v8 != null) {
            if (escopos.pegarEscopoAtual().existe(ctx.i8.getText())) {
                if (escopos.pegarEscopoAtual().getElement(ctx.i8.getText()).isFloat()) {
                    System.err.println("Linha " + ctx.i8.getLine() + ": tipos de " + ctx.i8.getText() + " e " + ctx.v8.getText() + " sao incompativeis.");
                    System.exit(0);
                }
            } else {
                System.err.println("Linha " + ctx.i8.getLine() + ": Variavel " + ctx.i8.getText() + " ainda nao foi declarada.");
                System.exit(0);
            }
        }

        return null;
    }

}
