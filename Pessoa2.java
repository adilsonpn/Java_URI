public class Pessoa2{
    private String titulo;
    private String cargo;
    private double salario;



    public Pessoa2(String no, String car, double sa){
        nome    = no;
        cargo   = car;
        salario = sa;
    }

    
    public void setNome(String no){
        nome = no;
    }

    public String getNome(){
        return nome;
    }

    public void setCargo(String car){
        cargo   =   car;
        }

    public String getCargo(){
        return cargo;
    }

    public void setSalario(double sa){
        salario =   sa;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentarSalario(double sa){
        salario = salario + salario*sa/100;
    }

    public String imprimir(){
        return nome+" "+cargo+" R$"+salario;
    }
    


}