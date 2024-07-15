package br.com.dominio;

public abstract class Veiculo {
    private String placa;
    private String renavan;
    private String modelo;
    
    
    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", renavan=" + renavan + ", modelo=" + modelo + "]";
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getRenavan() {
        return renavan;
    }
    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    
    

}
