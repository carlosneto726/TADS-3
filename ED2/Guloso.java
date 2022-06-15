/**** @author CarlosH ****/
import java.util.ArrayList;
import java.util.Collections;

public class Guloso {
    public static void main(String[] args){
        Tarefa tarefa1 = new Tarefa("t1", 1, 2);
        Tarefa tarefa2 = new Tarefa("t2", 2, 3);
        Tarefa tarefa3 = new Tarefa("t3", 3, 6);
        Tarefa tarefa4 = new Tarefa("t4", 1, 5);
        
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
        
        tarefas.add(tarefa1);
        tarefas.add(tarefa2);
        tarefas.add(tarefa3);
        tarefas.add(tarefa4);
        
        Collections.sort(tarefas); 
        
        ArrayList<Tarefa> solucoes = new ArrayList<Tarefa>();
        
        solucoes.add(tarefas.get(0));
        int pos = 0;
        
        for(int i = 0; i < tarefas.size(); i++){
            if(tarefas.get(i).getInicio() >= tarefas.get(pos).getFim()){
                solucoes.add(tarefas.get(i));
                pos = i;
            }
        }
        
        System.out.println(solucoes.size());
     
    }    
}
