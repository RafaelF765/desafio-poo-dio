package br.com.dominio;

import java.util.HashMap;
import java.util.Map;

public class Portaria {
    private Map<Romaneio, VeiculoDeCarga> ordemDeCarregamento;

    
    public Portaria() {
        this.ordemDeCarregamento = new HashMap<>();
    }

    public Map<Romaneio, VeiculoDeCarga> getOrdemDeCarregamento() {
        return ordemDeCarregamento;
    }

    public void ordemChegada(Romaneio romaneio, VeiculoDeCarga caminhao){
        ordemDeCarregamento.put(romaneio, caminhao);
    }

    public void listarCarregamento(){
        System.out.println(ordemDeCarregamento);
    }


    @Override
    public String toString() {
        return "Portaria [ordemDeCarregamento=" + ordemDeCarregamento + "]";
    }
    

    

}
