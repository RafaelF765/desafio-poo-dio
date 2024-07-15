package br.com.dominio;

public class Motorista {
    private String nome;
    private String categoria;

    
    public Motorista(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return "Motorista [nome=" + nome + ", categoria=" + categoria + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

}
