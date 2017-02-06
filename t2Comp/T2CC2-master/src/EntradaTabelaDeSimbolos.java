import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cristiano
 */
public class EntradaTabelaDeSimbolos {
    //Nome do grafo, vertice, lista de vertices, dado, conjunto de dados ou aresta
    public String nome;
    
    //Lista de vertices
    public List<String> vertices;
    
    //Tipo do grafo
    // 0 - grafo 1 - dgrafo
    public int tipoGrafo;
    
    //Lista de atributos do dado
    public LinkedHashMap atributos;
    
    //Vertices da aresta
    public String vertice1, vertice2;
    
    //Key e value de um unico dado
    String key, valueS;
    float valueF;
    boolean eFloat;
    
    //Nome dos pais
    public List<String> parents;
    
    int linha;
    //Tipo da entrada
    //0 - Grafo, 1 - Lista de Vertices, 2 - Aresta, 3 - Conjunto de dados
    //4 - Vertice e 5 - Dado
    int tipoEntrada;
    
    public EntradaTabelaDeSimbolos(){
        
    }
    
    
    //Construtor Grafo
    public EntradaTabelaDeSimbolos(String nome, int tipoGrafo, int linha) {
        this.nome = nome;
        this.tipoGrafo = tipoGrafo;
        this.linha = linha;
        this.tipoEntrada = 0;
        this.parents = new ArrayList<>();
    }
    //Construtor Lista de Vertices
    public EntradaTabelaDeSimbolos(String nome, List<String> vertices, int linha) {
        this.nome = nome;
        this.vertices = vertices;
        this.linha = linha;
        this.tipoEntrada = 1;
        this.parents = new ArrayList<>();
    }
    //Construtor Aresta
    public EntradaTabelaDeSimbolos(String nome, String vertice1, String vertice2 , int linha) {
        this.nome = nome;
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.linha = linha;
        this.tipoEntrada = 2;
        this.parents = new ArrayList<>();
    }
    //Construtor conjunto de Dados
    public EntradaTabelaDeSimbolos(String nome, LinkedHashMap atributos, int linha){
        this.nome = nome;
        this.atributos = atributos;
        this.linha = linha;
        this.tipoEntrada = 3;
        this.parents = new ArrayList<>();
    }
    //Construtor Vertice
    public EntradaTabelaDeSimbolos(String nome, int linha) {
        this.nome = nome;
        this.linha = linha;
        this.tipoEntrada = 4;
        this.parents = new ArrayList<>();
    }
    //Contrutor Dado
    public EntradaTabelaDeSimbolos(String key, String value, int linha){
        this.key = key;
        this.valueS = value;
        this.linha = linha;
        this.tipoEntrada = 5;
        this.parents = new ArrayList<>();
        this.eFloat = false;
    }
    
    public EntradaTabelaDeSimbolos(String key, float value, int linha) {
        this.key = key;
        this.valueF = value;
        this.linha = linha;
        this.tipoEntrada = 5;
        this.parents = new ArrayList<>();
        this.eFloat = true;
    }
    
    public boolean isFloat(){
        return this.eFloat;
    }
    
    public boolean contemVertice(String vertice) {
        if(vertices.contains(vertice))
            return true;
        else
            return false;
    }
    
    public boolean contemAtributo(String atributo) {
        if(atributos.containsKey(atributo))
            return true;
        else
            return false;
    }
    
    public void addParent(String parent) {
        this.parents.add(parent);
    }
    
    public boolean isChild(String parent){
        return parents.contains(parent);
    }
    
    public void printETDS() {
        System.err.println("------------------------------------------------------");
        switch(this.tipoEntrada){
            case 0:
                System.err.println("Tipo Entrada: " + this.tipoEntrada);
                System.err.println("Nome: " + this.nome);
                System.err.println("Tipo Grafo: " + this.tipoGrafo);
                System.err.println("Linha: " + this.linha);
                System.err.println("Parents: " + this.parents);
                break;
            case 1:
                System.err.println("Tipo Entrada: " + this.tipoEntrada);
                System.err.println("Nome: "+ this.nome);
                System.err.println("Linha: " + this.linha);
                System.err.println("Parents: " + this.parents);
                break;
            case 2:
                System.err.println("Tipo Entrada: " + this.tipoEntrada);
                System.err.println("Nome: "+ this.nome);
                System.err.println("Vertice 1: " + this.vertice1);
                System.err.println("Vertice 2: " + this.vertice2);
                System.err.println("Linha: " + this.linha);
                System.err.println("Parents: " + this.parents);
                break;
            case 3:
                System.err.println("Tipo Entrada: " + this.tipoEntrada);
                System.err.println("Nome: "+ this.nome);
                System.err.println("Atributos: " + this.atributos);
                System.err.println("Linha: " + this.linha);
                System.err.println("Parents: " + this.parents);
                break;
            case 4:
                System.err.println("Tipo Entrada: "+ this.tipoEntrada);
                System.err.println("Nome: "+ this.nome);
                System.err.println("Linha: " + this.linha);
                System.err.println("Parents: " + this.parents);
                break;
            case 5:
                System.err.println("Tipo Entrada: "+ this.tipoEntrada);
                System.err.println("Key: "+ this.key);
                System.err.println("ValueF: " + this.valueF);
                System.err.println("ValueS: " + this.valueS);
                System.err.println("EFloat: " + this.eFloat);
                System.err.println("Parents: " + this.parents);
                break;
        } 
    }
}