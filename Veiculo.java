public class Veiculo {
    private String placa;
    private String modelo;
    private Double valorDiaria;
    private boolean alugado;

    public Veiculo(String placa, String modelo, double valorDiaria){
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public boolean alugar(){
        if(alugado) return false;
        alugado = true;
        return alugado;
    }

    public void devolver (){
        alugado = false;
    }

    public double calcularValorAluguel(int dias){
        return valorDiaria * dias;
    }
}
