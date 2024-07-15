package br.com.dominio;

public class Item {
    private Produto produto;
    private int quantidade;

    

    @Override
    public String toString() {
        return "Item [produto=" + produto + ", quantidade=" + quantidade + ", pesoLiquido()=" + pesoLiquido() + "]";
    }

    public Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double pesoLiquido(){
        return quantidade * produto.getPeso();
    }

    public Produto getProduto(){
        return produto;
    }

}
