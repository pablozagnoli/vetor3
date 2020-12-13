
package vetor3;

import java.util.Scanner;


public class Vetor3 {

   
    public static void main(String[] args) {
     
        
         Scanner teclado = new Scanner(System.in);
        int Nota[] = new int[3];
        String Aluno[] = new String[3];
        int maior, menor;
        int posMaior, posMenor;

        for (int i = 0; i < Aluno.length; i++) {
            System.out.println("Digite o nome do aluno " + i);
            Aluno[i] = teclado.next();
            System.out.println("Digite a nota do aluno " + Aluno[i]);
            Nota[i] = teclado.nextInt();

        }

        maior=Nota[0];
        menor=Nota[0];
        posMaior=0;
        posMenor=0;
        
        for (int i = 0; i < Aluno.length; i++) {
            if ( Nota[1]>maior ) {

                maior=Nota[i];
                posMaior=i;
                        
               
            }  
            else if (Nota[i]<menor) {
                menor=Nota[i];
                posMenor=i;
                
                
            } 

        }

        
      System.out.println("O aluno com a melhor nota é " + Aluno[posMaior]);  
        System.out.println("O aluno com a pior nota é " + Aluno[posMenor]);  
    }
    
}

