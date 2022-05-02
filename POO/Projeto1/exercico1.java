package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        // Declaração de variaveis.
        int c = 0;
        double media = 0;
        double idade = 0;
        double idadeAux = 0;
        boolean negIdade = false;

        while(true){
            idadeAux = in.nextInt();
            idade += idadeAux;

            if(idadeAux < 0 && c == 0){ // Codinção para conferir se o primeiro valor é menor que 0.
            System.out.println("impossivel calcular");
            negIdade = true;
            break;

            }else if (idadeAux < 0){ // Codinção para quebrar o laço.
                break;
            }

            c++;
            media = idade / c;
        }
        if (negIdade ==  false){ // Para saber se no final é pra imprimir ou não a media.
        System.out.println(String.format("%.2f", media));
        }

    }
}
