import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    
public class Exec20{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);    
    
    int sexo;
    float altura;
    float pesoIdeal;


    sexo = teclado.nextInt();
    altura = teclado.nextFloat();
   
       
   
   if ( sexo == 0){
    pesoIdeal = (72.7f * altura) - 58.0f;
    }
    else{
            pesoIdeal = (62.1f * altura) - 44.7f;
    }
   System.out.println("Seu peso ideal vale = "+pesoIdeal);
}

}