public class PessoaTeste2{
    public static void main(String args[]){
        Pessoa2 p1, p2, p3;

        p1 = new Pessoa2("Adilson", "Analista", 1000);
        p2 = new Pessoa2("Antonio", "Analista2", 2000);
        p3 = new Pessoa2("Jose","Analista3", 4000);

        System.out.println(p1.imprimir());
        System.out.println(p2.imprimir());
        System.out.println(p3.imprimir());

        p1.aumentarSalario(10);
        p2.aumentarSalario(5);
        p3.aumentarSalario(5);

        System.out.println(p1.imprimir());
        System.out.println(p2.imprimir());
        System.out.println(p3.imprimir());
    }
}