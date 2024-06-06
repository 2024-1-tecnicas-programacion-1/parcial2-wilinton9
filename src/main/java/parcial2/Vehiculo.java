package parcial2;

public class Vehiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private TipoCombustible tipoCombustible;
    
    // Constructor
    public Vehiculo(String marca, String modelo, int año, TipoCombustible tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipoCombustible = tipoCombustible;
    }
    
    // Método para imprimir la información del vehículo
    public String imprimirInformacion() {
        return marca + " " + modelo + " " + año + " - Tipo de Combustible: " + tipoCombustible;
    }
    
    // Getters y Setters (opcional, pero recomendado para acceder a los atributos)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}


