import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio2b{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    float lado, altura, area;

    // entrada (o valor do lado quadrado)
    System.out.println("Digite o lado do retangulo");
    lado = teclado.nextFloat();
    altura = teclado.nextFloat();

    // processamento (calcular a area)

    area = lado * altura;

    // saida (exibir o valor da area)
    System.out.println("O valor da area = "+area);
    
}

}