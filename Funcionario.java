public class Funcionario {
    private String nome;
    private String cargo;
    private Double salario;

    public  Funcionario(String nome, String cargo, Double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public double calcularBonus(){
        return (salario * 0.1);
    }

    public void aumentarSalario(double percentual){
        salario += salario * (percentual/100);
    }
}
