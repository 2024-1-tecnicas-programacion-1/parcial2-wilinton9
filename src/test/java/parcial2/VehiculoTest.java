package parcial2;

import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehiculoTest {
private String Marca;
private String Modelo;
private int Año;

    public VehiculoTest(String Marca, String Modelo, int Año, Vehiculo vehiculo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
        this.vehiculo = vehiculo;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAño() {
        return Año;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

  

   
  public void imprimirInformacion(String marca, String modelo, int año){
      System.out.println(marca + modelo + año);
  }
     private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        vehiculo = new Vehiculo("Toyota", "Corolla", 2020);
        
    }

    @Test
    public void testVehiculoCreation() {
        assertNotNull(vehiculo, "El objeto Vehiculo no debería ser null");
        assertEquals("Toyota", vehiculo.getMarca());
        assertEquals("Corolla", vehiculo.getModelo());
        assertEquals(2020, vehiculo.getAño());
    }

    @Test
    public void testImprimirInformacion() {
        String expectedOutput = "Toyota Corolla 2020";
        assertEquals(expectedOutput, vehiculo.imprimirInformacion());
    }

    @Test
    public void testGettersAndSetters() {
        vehiculo.setMarca("Honda");
        vehiculo.setModelo("Civic");
        vehiculo.setAño(2021);

        assertEquals("Honda", vehiculo.getMarca());
        assertEquals("Civic", vehiculo.getModelo());
        assertEquals(2021, vehiculo.getAño());
    }

    @Test
    public void testSetMarca() {
        vehiculo.setMarca("Ford");
        assertEquals("Ford", vehiculo.getMarca());
    }

    @Test
    public void testSetModelo() {
        vehiculo.setModelo("Fiesta");
        assertEquals("Fiesta", vehiculo.getModelo());
    }

    @Test
    public void testSetAño() {
        vehiculo.setAño(2018);
        assertEquals(2018, vehiculo.getAño());
    }
    
}
