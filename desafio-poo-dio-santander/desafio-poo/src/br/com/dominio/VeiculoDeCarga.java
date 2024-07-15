package br.com.dominio;

public class VeiculoDeCarga extends Veiculo {
        private double capacidade;
        private double tara;
        private double pesoBruto;
        private Motorista motorista;

        

        public VeiculoDeCarga(double capacidade, double tara, double pesoBruto, Motorista motorista) {
                this.capacidade = capacidade;
                this.tara = tara;
                this.pesoBruto = pesoBruto;
                this.motorista = motorista;
        }



        @Override
        public String toString() {
                return "VeiculoDeCarga [capacidade=" + capacidade + ", tara=" + tara + ", pesoBruto=" + pesoBruto + ", motorista="+ motorista+"]";
        }



        public double carregarVeiculo(double peso){
                if (this.capacidade >= peso) {
                        double novaCapacidade = capacidade - peso;
                        this.capacidade = novaCapacidade;
                        this.pesoBruto = peso + this.tara;
                        return this.pesoBruto;  
                }else{
                        System.out.println("A carga excede o limite permitido do veículo!");
                        return this.pesoBruto;
                }
                
        }



        public double getCapacidade() {
                return capacidade;
        }



        public double getTara() {
                return tara;
        }



        public double getPesoBruto() {
                return pesoBruto;
        }

}
