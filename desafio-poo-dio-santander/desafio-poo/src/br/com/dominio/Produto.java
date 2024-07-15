package br.com.dominio;

public class Produto {
    private String nome;
    private double peso;
    private String unidade;

    

    public Produto(String nome, double peso, String unidade) {
        this.nome = nome;
        this.peso = peso;
        this.unidade = unidade;
    }
    
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    public String getUnidade() {
        return unidade;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", peso=" + peso + ", unidade=" + unidade + "]";
    }

}
