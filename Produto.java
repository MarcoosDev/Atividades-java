public class Produto {
    private String nome;
    private  Double preco;
    private  int quantidadeEstoque;

    public Produto(String nome, Double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    
    public Double calcularValorTotalEstoque(){
        return (getQuantidadeEstoque() * getPreco());
    }

    public Double calcularValorComDesconto(Double porcentagem){
        return (preco - (preco * (porcentagem *100)));
    }
}
