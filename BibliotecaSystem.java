public class BibliotecaSystem{
    public static void main(String args[]){

        Biblioteca l1, l2, l3, l4, l5;

        l1 = new Biblioteca("livro1", "autor1", "2020", "Info", "2A", "A", false);
        l2 = new Biblioteca("livro2", "autor2", "2020", "Info", "2A", "A", false);
        l3 = new Biblioteca("livro3", "autor3", "2020", "Info", "2A", "A", false);
        l4 = new Biblioteca("livro4", "autor4", "2020", "Info", "2A", "A", false);
        l5 = new Biblioteca("livro5", "autor5", "2020", "Info", "2A", "A", true);

 
         System.out.println(l1.imprimir());
         System.out.println(l2.imprimir());
         System.out.println(l3.imprimir());
         System.out.println(l4.imprimir());
         System.out.println(l5.imprimir());

         l4.emprestar(true);

    }
}