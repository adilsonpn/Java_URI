import java.util.Scanner;
public class URI1040{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float N1, N2, N3, N4, soma, media;
        
        N1 = teclado.nextFloat();
        N2 = teclado.nextFloat();
        N3 = teclado.nextFloat();
        N4 = teclado.nextFloat();

        soma = N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1;

        media = soma / 10;

        System.out.printf("MEDIA = "+media+" \n ");
        
        if (media >= 7.0f){
             System.out.println("Aluno reprovado.");
        }
            else{
                if (media <= 5.0f){
                    System.out.println("Aluno reprovado.");
                }
                    else{
                        if (media >= 5.0f && media <= 6.9f){
                        System.out.println("Aluno em exame.");
                        }
                    } 
            }
        
    }
}