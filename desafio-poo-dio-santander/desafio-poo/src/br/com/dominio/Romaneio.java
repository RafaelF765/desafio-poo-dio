package br.com.dominio;

import java.util.ArrayList;
import java.util.List;

public class Romaneio {
    private int numero = 0;
    private Cliente cliente;
    private List<Item>itens;
    private double pesoBruto;

    public Romaneio(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        
    }
    

    public List<Item> adicionarItems(Produto produto, int quantidade){
        itens.add(new Item(produto, quantidade));
        return itens;
    }

    public double pesoPedido(){
        double peso = 0;
        if (!itens.isEmpty()) {
            for(Item item: itens){
                peso += item.pesoLiquido();
            }
        }
        return this.pesoBruto = peso;
    }

    @Override
    public String toString() {
        return "Romaneio [numero=" + numero + ", cliente=" + cliente + ", itens=" + itens + ", pesoBruto=" + pesoBruto
                + "]";
    }


    public int getNumero() {
        return numero;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public List<Item> getItens() {
        return itens;
    }


    public double getPesoBruto() {
        return pesoBruto;
    }

    

    
}
