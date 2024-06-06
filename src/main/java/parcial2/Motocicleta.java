package parcial2;

    public class Motocicleta extends Vehiculo {
    // Atributo adicional
    private TipoMotocicleta tipoMotocicleta;
    
    // Constructor
    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año); 
        this.tipoMotocicleta = tipoMotocicleta;
    }
    
    // Sobrescritura del método imprimirInformacion()
    @Override
    public String imprimirInformacion() {
        return getMarca() + " " + getModelo() + " " + getAño() + ", " + tipoMotocicleta;
    }
    
    // Getter y Setter para tipoMotocicleta (opcional, pero recomendado)
    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }


    // TODO: Tu código va aquí
}
