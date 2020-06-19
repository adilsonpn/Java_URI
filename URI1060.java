import java.util.Scanner;
public class URI1060{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
  float num;
  int qtd = 0;
  
  for (int cont =1; cont <=6; cont++){
      // num = teclado.nextFloat();
        if (num > 0){
            qtd = qtd + 1;
        }
    }
    System.out.println(qtd +" valores positivos"); 
  
       
    }
}