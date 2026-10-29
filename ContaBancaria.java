public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private Double saldo;
    
    public ContaBancaria (String numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(Double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public boolean sacar(Double valor){
        if ((saldo - valor) >= 0){
            saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
}
