public class Refrigerante1{
    private String nome;
    private double preco;
    private int    qtde;

    public Refrigerante1(String nome, double preco, int qtde){
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public void tirarEstoque(){
        this.qtde--;
    }

    public int getQtde(){
        return this.qtde;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }
}