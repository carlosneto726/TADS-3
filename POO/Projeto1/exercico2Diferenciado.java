package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico2Diferenciado {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int indexes = in.nextInt();
        String vetor[] = in.nextLine().split(" ");
        int vetorAux[];
        vetorAux = new int[indexes];
        int count;

        for(count = 0; count < indexes; count++){
            vetorAux[count] = Integer.parseInt(vetor[count]);
            System.out.println(vetorAux[count]);
        }
    }
}