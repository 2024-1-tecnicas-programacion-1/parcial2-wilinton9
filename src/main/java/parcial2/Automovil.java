package parcial2;

public class Automovil extends Vehiculo {
    // Atributos adicionales
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;
    
    public Automovil(String marca, String modelo, int año, int numeroPuertas, TipoCombustible tipoCombustible) {
        // Llama al constructor de la clase base (Vehiculo)
        super(marca, modelo, año);
        // Inicializa los atributos adicionales
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    
    // Sobrescritura del método imprimirInformacion()
    @Override
    public String imprimirInformacion() {
        return getMarca() + " " + getModelo() + " " + getAño() + ", " + numeroPuertas + " puertas, combustión a " + tipoCombustible;
    }
    
    // Getters y Setters (opcional, pero recomendado para acceder a los atributos adicionales)
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    @Override
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }




    // TODO: Tu código va aquí
}
