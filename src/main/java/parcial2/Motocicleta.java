package parcial2;

    public class Motocicleta extends Vehiculo {
   
    private TipoMotocicleta tipoMotocicleta;
    
    
    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año); 
        this.tipoMotocicleta = tipoMotocicleta;
    }
    
    
    @Override
    public String imprimirInformacion() {
        return getMarca() + " " + getModelo() + " " + getAño() + ", " + tipoMotocicleta;
    }
    
   
    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }


    // TODO: Tu código va aquí
}
