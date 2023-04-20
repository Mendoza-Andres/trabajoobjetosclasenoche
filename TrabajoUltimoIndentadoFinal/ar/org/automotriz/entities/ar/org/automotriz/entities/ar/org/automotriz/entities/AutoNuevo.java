
package ar.org.automotriz.entities;
public class AutoNuevo extends Vehiculo {
    public AutoNuevo(String marca, String modelo, String color, int precio,String radiomarca, String potencia) {
        super(marca,modelo,color,precio,radiomarca,potencia);
    
    }
   
    public AutoNuevo(String marca, String modelo, String color,String radiomarca, String potencia) {
        super(marca,modelo,color, radiomarca,potencia);
    
    }
    
}
