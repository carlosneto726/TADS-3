package grafosjava;

import java.util.ArrayList;

/**
 *
 * @author Afranio
 */
public class GrafosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Grafos grafo = new Grafos();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");
        grafo.adicionarVertice("F");
        
        grafo.adicionarAresta(1, "A", "B");
        grafo.adicionarAresta(-2, "A", "C");
        grafo.adicionarAresta(3, "B", "D");
        grafo.adicionarAresta(2, "C", "B");
        grafo.adicionarAresta(1, "C", "D");
        grafo.adicionarAresta(4, "C", "E");
        grafo.adicionarAresta(-1, "D", "E");
        grafo.adicionarAresta(1, "D", "F");
        grafo.adicionarAresta(1, "E", "F");
        
        grafo.buscaEmLargura();
        
        grafo.gerarMatrizAdjacencia();
        
        
    }   
    
}
