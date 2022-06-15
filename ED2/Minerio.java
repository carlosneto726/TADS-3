/**
 *
 * @author IFG
 */
public class Minerio {
    
    String nome;
    int preco;
    int peso;
    
    
    Minerio(){
    }
    Minerio(String nome ,int peso, int preco){
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
