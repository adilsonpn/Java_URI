import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio2c{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    float base, altura, area;

    // entrada (o valor do lado quadrado)
    System.out.println("Digite o lado do triangulo");
    base = teclado.nextFloat();
    altura = teclado.nextFloat();

    // processamento (calcular a area)

    area = (base * altura)/2;

    // saida (exibir o valor da area)
    System.out.println("O valor da area = "+area);
    
}

}