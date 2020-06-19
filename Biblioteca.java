public class Biblioteca{
    private String titulo;
    private String autor;
    private String ano;
    private String categoria;
    private String estante;
    private String prateleira;
    private boolean emprestado;



    public Biblioteca(String titulo, String autor, String ano, String categoria, String estante, String prateleira, boolean emprestado){
        this.titulo    = titulo;
        this.autor     = autor;
        this.ano       = ano;
        this.categoria = categoria;
        this.estante   = estante;
        this.prateleira = prateleira;
        this.emprestado = emprestado;


    }

    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor   =   autor;
        }

    public String getAutor(){
        return this.autor;
    }

    public void setAno(String ano){
        this.ano    =   ano;
    }

    public String getAno(){
        return this.ano;
    }

    public void setCategoria(String categoria){
        this.categoria  = categoria;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setEstante(String estante){
        this.estante  = estante;
    }

    public String getEstante(){
        return this.estante;
    }

    public void setPrateleira(String prateleira){
        this.prateleira  = prateleira;
    }

    public String getPrateleira(){
        return this.prateleira;
    }

    public void setEmprestado(boolean emprestado){
        this.emprestado  = emprestado;
    }

    public boolean getEmprestado(){
        return this.emprestado;
    }

     public String imprimir(){
        return this.titulo+" "+this.autor+" "+this.ano+" "+this.categoria+" "+this.estante+" "+this.prateleira+" "+this.emprestado;
    }
    



}