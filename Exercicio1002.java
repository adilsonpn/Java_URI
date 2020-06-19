import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exercicio1002{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);    
    double pi, raio1, raio2, area;
    raio1 = input.nextDouble();
    pi = 3.14159;
    raio2 = raio1 * raio1;
    area = raio2 * pi;
    
   System.out.printf("A=%.4f\n",area);
                  
}

}