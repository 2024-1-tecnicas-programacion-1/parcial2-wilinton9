package parcial2;

public class Principal {
    public static void main(String[] args) {
      
        Automovil miAutomovil = new Automovil("Ford", "Focus", 2018, 4, TipoCombustible.GASOLINA);
        
 
        Motocicleta miMotocicleta = new Motocicleta("Yamaha", "YZF-R3", 2020, TipoMotocicleta.DEPORTIVA);
        
       
        Vehiculo vehiculoInformacion;
        
      
        vehiculoInformacion = miAutomovil;
        System.out.println("Información del vehículo (Automovil): " + vehiculoInformacion.imprimirInformacion());
        
       
        vehiculoInformacion = miMotocicleta;
        System.out.println("Información del vehículo (Motocicleta): " + vehiculoInformacion.imprimirInformacion());
    }
}

 

