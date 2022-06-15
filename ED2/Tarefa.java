/**** @author CarlosH ****/

public class Tarefa {
    
    String descricao;
    int inicio;
    int fim;
    
    
    public Tarefa(){
    }
    
    public Tarefa(String descricao, int inicio, int fim){
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
        
    }
    
    void setDescicao(String desc){
        descricao = desc;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    
    void setInicio(int inic){
        inicio = inic;
    }
    public int getInicio(){
        return inicio;
    }
    
    void setFim(int fi){
        fim = fi;
    }
    
    public int getFim(){
        return fim;
    }
    
    
}
