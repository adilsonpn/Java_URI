import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio1005{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);    
    double a, b, soma, media;
    a = input.nextDouble();
    b = input.nextDouble();
    soma = a * 3.5 + b * 7.5;
    media = soma / 11;
    
   System.out.printf("MEDIA = %.5f\n",media);
                  
}

}