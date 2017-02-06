grammar LinguagemLMG;

IDENT: ('a'..'z'|'A'..'Z') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
CADEIA: '"' ~('\r' | '\n' | '"')* '"';
NUM: ('0'..'9')+ ('.' ('0'..'9')+)?;

CaracteresIgnorados: (' '|'\t'|'\r'|'\n')-> skip ;
Comentarios: '{' .*? '}' -> skip;

//Cria o escopo do programa
programa:
	'inicio-lmg' corpo 'fim-lmg'
;

//Chama as declaracoes e os comandos do programa
corpo:
	declaracoes comandos
;

//Cria grafos ou dgrafos
declaracoes:
	criar_grafo declaracoes 
	| criar_dgrafo declaracoes
	| criar_vertices declaracoes
	| criar_dados declaracoes
	|
;

//Cria um grafo
criar_grafo: 
	'criar grafo' grafo
;

//Cria um dgrafo [Pra que ter a especificacao do dgrafo mesmo?]
criar_dgrafo :
	'criar grafo direcional' dgrafo
;

//Para caso haja mais de um grafo na declaracao
grafo:
	grafo1=IDENT (',' outrosGrafos+=IDENT)* 
;

dgrafo:
	dgrafo1=IDENT (',' outrosDGrafos+=IDENT)*
;

//Cria vertices
criar_vertices:
	'criar vertices' vertices
;

//especificacao dos vertices
vertices:
	nome=IDENT ':' '[' vertice1=IDENT (',' outrosVertices+=IDENT)* ']'
;


//Cria dados
criar_dados:
	'criar dados' nome=IDENT ':' dado1=IDENT '=' valor1=value (',' outrosDados+=IDENT '=' outrosValores+=value)*
;

//especificacao dos comandos usados na linguagem
comandos:
	adicionar comandos
	| desenhar comandos
	| limpar comandos
	| plotar comandos
	| salvar comandos
	| para comandos
	| se comandos
	| exibir comandos
	| remover comandos
	|
;

//Adiciona vertices, dados e arestas ao grafo
adicionar:
	'adicionar vertices' vs=IDENT 'ao grafo' g1=IDENT
	|'adicionar vertice' v1=IDENT 'ao grafo' g2=IDENT //adiciona o vertice a tabela de simbolos do grafo
	| 'adicionar aresta' aresta 'ao grafo' g3=IDENT
	| 'adicionar aresta' daresta 'ao dgrafo' g4=IDENT
	| 'adicionar dados' ds=IDENT 'ao vertice' v2=IDENT 'do grafo' g5=IDENT
	| 'adicionar dado' d1=IDENT '=' value 'a aresta' a1=IDENT 'do grafo' g6=IDENT
;

//Definicao da aresta
//Adiciona a aresta a tabela de simbolos
aresta:
	nome=IDENT ':' v1=IDENT '--' v2=IDENT 
;

daresta:
	nome=IDENT ':' v1=IDENT '->' v2=IDENT
;

//Desenha o grafo na tela
desenhar:
	'desenhar grafo' grafo1=IDENT 'na tela'
;

//Limpa a tela
limpar: 
	'limpar tela'
;

//Plota a tela
plotar:
	'plotar tela'
;

//Salva a tela num arquivo
salvar:
	'salvar tela em' CADEIA
;

//especificacao do for
para:
	'para cada vertice' v1=IDENT 'no grafo' g1=IDENT ':' comandos 'fim-para'
	| 'para cada aresta' a1=IDENT 'no grafo' g2=IDENT ':' comandos 'fim-para'
	| 'para cada vizinho' vz1=IDENT 'do vertice' v2=IDENT 'no grafo' g3=IDENT ':' comandos 'fim-para'
;

//Numero ou cadeia 
value:
	NUM 
	| CADEIA
;

//especificacao do if
se:
	'se aresta' a1=IDENT 'do grafo' g1=IDENT 'possui' expressao ':' comandos senao 'fim-se'
	| 'se' comparacao_key ':' comandos senao 'fim-se'
;

//especificacao do else
senao:
	'senao:' comandos
	|
;

//Comparacao do if
comparacao_key:
	key '==' value
	| key '!=' value
	| key '>=' value
	| key '<=' value
	| key '<' value
	| key '>' value
;

//Key funciona para as comparacoes
key:
	'valor de' val1=IDENT 'no vertice' v1=IDENT 'do grafo' g1=IDENT
	| 'valor de' val2=IDENT 'na aresta' a1=IDENT 'do grafo' g2=IDENT
;

//Exibir vertices, arestas, vizinhos, grafo ou dgrafo [NAO TEM EXIBIR DADOS?]
exibir:
	'exibir grafo' g1=IDENT
	| 'exibir grafo direcional' dg1=IDENT
	| 'exibir vertices do grafo' g2=IDENT
	| 'exibir vertice' v1=IDENT 'do grafo' g3=IDENT //exibe os dados do vertice
	| 'exibir vertices do grafo' g4=IDENT 'onde ('expressao')'
	| 'exibir arestas do grafo' g5=IDENT
	| 'exibir aresta' a1=IDENT 'do grafo' g6=IDENT
	| 'exibir arestas do grafo' g7=IDENT 'onde ('expressao')' 
	| 'exibir vizinhos do vertice' v2=IDENT 'do grafo' g8=IDENT
;

//Remover vertices, arestas e dados
remover:
	'remover vertice' v1=IDENT 'do grafo' g1=IDENT
	| 'remover arestas do grafo' g2=IDENT
	| 'remover aresta' a1=IDENT 'do grafo' g3=IDENT
	| 'remover arestas' a2=IDENT 'do grafo' g4=IDENT 'onde ('expressao')'
	| 'remover dados da aresta' a3=IDENT 'do grafo' g5=IDENT
	| 'remover dados' d1=IDENT 'do vertice' v2=IDENT 'do grafo' g6=IDENT
;

//Expressao usada para exibicao e remocao condicional
expressao :
	i1=IDENT '==' v1=NUM
	|i2=IDENT '==' v2=CADEIA
	|i3=IDENT '>=' v3=NUM
	|i4=IDENT '>' v4=NUM
	|i5=IDENT '<' v5=NUM
	|i6=IDENT '<=' v6=NUM
	|i7=IDENT '!=' v7=NUM
	|i8=IDENT '!=' v8=CADEIA
;