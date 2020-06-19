import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio5{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    float tempo, vel, dist, consumo;

    System.out.println("Digite o tempo da viagem");
    tempo = teclado.nextFloat();
    System.out.println("Digite a velocidade media");
    vel = teclado.nextFloat();

    dist = tempo * vel;

    consumo = dist / 12;

    System.out.printf("voce percorreu %,3f km \n"+
                    "a uma velocidade de %.3f km/h \n"+
                    "consumiu %,3f litros \n",
                    dist, vel, consumo);
}

}