// canal vai de 1 a 99
// volume vai de 0 a 10
// aumentarVolume, diminuir volume, voltarCanal, mutar
public class Televisao{
    String  marca;
    int     tamanhoTela;
    int     canal;
    int     volume;
    boolean ligada;

    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV "+marca+" esta desligada");
    }

    void avancarCanal(){
        if (ligada == true){
            canal++;
        
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void aumentarVolume(){
        if (ligada){
            volume++;
        if (volume >=10){
            volume = 1);
        }
                System.out.println("A TV "+marca+" esta no canal "+volume);
            }
            else{
                System.out.println("Por favor, antes ligue a TV "+marca);
            }
        }
       
    }

    void power(){
        ligada = !ligada;
        System.out.println("Status da TV "+marca+" : Ligada = "+ligada);
    }




}