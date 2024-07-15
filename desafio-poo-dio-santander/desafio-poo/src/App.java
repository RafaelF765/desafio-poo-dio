import br.com.dominio.Cliente;
import br.com.dominio.Motorista;
import br.com.dominio.Portaria;
import br.com.dominio.Produto;
import br.com.dominio.Romaneio;
import br.com.dominio.VeiculoDeCarga;

public class App {
    public static void main(String[] args) throws Exception {
        Motorista motora = new Motorista("Benezio Ozorio", "D");
        VeiculoDeCarga caminhao = new VeiculoDeCarga(15000, 8000, 23000, motora);
        Produto banana = new Produto("Banana", 1.5, "DZ");
        Cliente cliente = new Cliente("Fruta Doce", "Pernambuco-PE", "12.236.458/7854-89");
        Romaneio romaneio = new Romaneio(cliente);
        Portaria portaria = new Portaria();

        romaneio.adicionarItems(banana, 1000);
        portaria.ordemChegada(romaneio, caminhao);

        portaria.listarCarregamento();


    }
}
