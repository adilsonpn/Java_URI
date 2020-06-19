import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio2e{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    float base1, base2, altura, area;

    // entrada (o valor do lado trapezio)
    System.out.println("Digite o lado do basel");
    base1 = teclado.nextFloat();
    System.out.println("Digite o lado do base2");
    base2 = teclado.nextFloat();
    System.out.println("Digite o lado da altura");
    altura = teclado.nextFloat();

    // processamento (calcular a area)

    area = (base1 * base2)* altura/2;

    // saida (exibir o valor da area)
    System.out.println("O valor da area = "+area);
    
}

}