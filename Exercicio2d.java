import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio2d{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    float diagonal1, diagonal2, area;

    // entrada (o valor do lado quadrado)
    System.out.println("Digite o lado do diagonal");
    diagonal1 = teclado.nextFloat();
    System.out.println("Digite o lado do diagona2");
    diagonal2 = teclado.nextFloat();

    // processamento (calcular a area)

    area = (diagonal1 * diagonal2);

    // saida (exibir o valor da area)
    System.out.println("O valor da area = "+area);
    
}

}