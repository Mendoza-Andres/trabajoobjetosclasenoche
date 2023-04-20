
package ar.org.automotriz.entities;
public final class Bus extends Vehiculo{
    public Bus(String marca, String modelo, String color, int precio,String radiomarca, String potencia) {
        super(marca,modelo,color,precio,radiomarca,potencia);
    
    }
    public Bus(String marca, String modelo, String color, int precio) {
        super(marca,modelo,color,precio);
    
    }
    public Bus(String marca, String modelo, String color) {
        super(marca,modelo,color);

    
    }
    public Bus(String marca, String modelo, String color,String radiomarca, String potencia) {
        super(marca,modelo,color, radiomarca,potencia);
    
    }
    
}
