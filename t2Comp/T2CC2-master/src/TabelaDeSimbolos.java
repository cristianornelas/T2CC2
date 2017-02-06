import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
/**
 *
 * @author cristiano
 */
public class TabelaDeSimbolos {
    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;
    
    public TabelaDeSimbolos() {
        tabelaDeSimbolos = new HashMap<>();
    }
      
    public void inserir(String nome, int tipoGrafo, int linha) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(nome, tipoGrafo, linha);
        tabelaDeSimbolos.put(nome, etds);
    }
    
    public void inserir(String nome, List<String> vertices, int linha) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(nome, vertices, linha);
        tabelaDeSimbolos.put(nome, etds);
    }
    
    public void inserir(String nome, String vertice1, String vertice2, int linha) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(nome, vertice1, vertice2, linha);
        tabelaDeSimbolos.put(nome, etds);
    }
    
    public void inserir(String nome, LinkedHashMap atributos, int linha) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(nome, atributos, linha);
        tabelaDeSimbolos.put(nome, etds);
    }
    
    public void inserir(String nome, int linha){
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(nome, linha);
        tabelaDeSimbolos.put(nome, etds);
    }
    
    public void inserir(String key, String value, int linha){
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(key, value, linha);
        tabelaDeSimbolos.put(key, etds);
    }
    
    public void inserir(String key, float value, int linha){
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(key, value, linha);
        tabelaDeSimbolos.put(key, etds);
    }
    
    public void remover(String nome) {
        tabelaDeSimbolos.remove(nome);
    }
    
    public int getTipo(String nome){
        return tabelaDeSimbolos.get(nome).tipoEntrada;
    }
    
    public boolean existe(String nome) {
        if(!tabelaDeSimbolos.containsKey(nome) && !verificarVertice(nome))
            return false;
        else
            return true;
    }
    
    public EntradaTabelaDeSimbolos getElement(String nome){
        if (existe(nome))
            return tabelaDeSimbolos.get(nome);
        else {
            System.err.println("Variavel "+nome + " nao existe.");
            return null;
        }
        
    }
    
    public boolean verificarVertice(String vertice) {
        for(String key: tabelaDeSimbolos.keySet()) {
            if(tabelaDeSimbolos.get(key).tipoEntrada == 1 && tabelaDeSimbolos.get(key).vertices.contains(vertice))
                return true;
        }
        return false;
    }
    
    public boolean verificarAtributos(String atributo) {
        for(String key: tabelaDeSimbolos.keySet()) {
            if(tabelaDeSimbolos.get(key).tipoEntrada == 3 && tabelaDeSimbolos.get(key).atributos.containsKey(atributo))
                return true;
        }
        return false;
    }
    
    public void printTabela() {
        System.out.println("*****************************");     
        for(String key: tabelaDeSimbolos.keySet()) {
            tabelaDeSimbolos.get(key).printETDS();
        }
        System.out.println("*****************************");
        
    }
}