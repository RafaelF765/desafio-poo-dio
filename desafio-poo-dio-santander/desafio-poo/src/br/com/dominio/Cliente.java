package br.com.dominio;

public class Cliente {
    private String nome;
    private String endereco;
    private String cnpj;

    

    public Cliente(String nome, String endereco, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", endereco=" + endereco + ", cnpj=" + cnpj + "]";
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCnpj() {
        return cnpj;
    }


    
}
