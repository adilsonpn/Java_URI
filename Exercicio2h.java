import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio2h{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    float raio, altura, volume;
    float pi =3.14f;
    

    // entrada (o valor do lado cilindro)
    System.out.println("Digite o lado do raio");
    raio = teclado.nextFloat();
    System.out.println("Digite o lado do altura");
    altura = teclado.nextFloat();
    
    // processamento (calcular a area)

    volume = pi * raio * raio * altura;

    // saida (exibir o valor da area)
    // System.out.println("O valor da area = "+volume);
    System.out.printf("O valor da area = %.2f", volume);
}

}