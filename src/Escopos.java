import java.util.LinkedList;
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
public final class Escopos {
    private LinkedList<TabelaDeSimbolos> pilhaDeTabelas;
    
    public Escopos() {
        pilhaDeTabelas = new LinkedList<>();
        empilhar();
    }

    public void empilhar() {
        pilhaDeTabelas.push(new TabelaDeSimbolos());
    }
    
    public TabelaDeSimbolos pegarEscopoAtual() {
        return pilhaDeTabelas.peek();
    }
    
    public TabelaDeSimbolos desempilhar() {
        return pilhaDeTabelas.pop();
    }
    
    public List<TabelaDeSimbolos> percorrerEscopos() {
        return pilhaDeTabelas;
    }
}