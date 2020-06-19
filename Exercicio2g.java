import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio2g{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    float lado1, lado2, lado3, area;

    // entrada (o valor do lado cubo)
    System.out.println("Digite o lado do lado1");
    lado1 = teclado.nextFloat();
    System.out.println("Digite o lado do lado2");
    lado2 = teclado.nextFloat();
    System.out.println("Digite o lado da lado3");
    lado3 = teclado.nextFloat();

    // processamento (calcular a area)

    area = lado1 * lado2 * lado3;

    // saida (exibir o valor da area)
    System.out.println("O valor da area = "+area);
    
}

}