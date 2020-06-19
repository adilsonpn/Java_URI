import java.util.Scanner;
public class URI1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float total;
        total = 0f;
        System.out.println("Digite o codigo e a quantidade:\n");
        int codig = teclado.nextInt();
        int qtde = teclado.nextInt();

        if (codig == 1){
            total = (qtde*4f);
        }
            else{   
                if (codig == 2){
                    total = (qtde*4.5f);
                }
                    else{  
                        if (codig == 3){
                            total = (qtde*5f);
                        }
                            else{ 
                                if (codig == 4){
                                    total = (qtde*2f);
                                }
                                else{
                                    if (codig == 5){
                                        total = (qtde*1.5f);
                                    }
                                      
                                } 
                            }         
                    }
            }
            System.out.printf("Total: R$ %.2f\n",total);
    }
}