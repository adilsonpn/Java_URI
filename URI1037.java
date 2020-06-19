import java.util.Scanner;
public class URI1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor;
        System.out.println("Digite o valor:\n");
        valor = teclado.nextFloat();

        if (valor >= 0 && valor <= 25){
            System.out.println("Intervalo [0,25]");
        }
            else{   // ja sei que o salario é >= 1000
                if (valor >= 25 && valor <= 50){
                    System.out.println("Intervalo [25,50]");
                }
                    else{   // ja sei que é >=1000 e também >=2500
                        if (valor >= 50 && valor <= 75){
                            System.out.println("Intervalo [50,75]");
                        }
                            else{ // já sei que é maior que 5000
                                if (valor >= 75 && valor <= 100){
                                    System.out.println("Intervalo [75,100]");
                                }
                                else{
                                    System.out.println("Fora de intervalo");
                                } 
                            }         
                    }
            }
    }
}