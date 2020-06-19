import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio2f{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    float altura, largura, profundidade, area;

    // entrada (o valor do lado paralelepipedo)
    System.out.println("Digite o lado do altura");
    altura = teclado.nextFloat();
    System.out.println("Digite o lado do largura");
    largura = teclado.nextFloat();
    System.out.println("Digite o lado da profundidade");
    profundidade = teclado.nextFloat();

    // processamento (calcular a area)

    area = altura * largura * profundidade;

    // saida (exibir o valor da area)
    System.out.println("O valor da area = "+area);
    
}

}