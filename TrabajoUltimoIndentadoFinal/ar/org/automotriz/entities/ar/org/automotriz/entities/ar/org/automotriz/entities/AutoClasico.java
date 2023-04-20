package ar.org.automotriz.entities;
public class AutoClasico extends Vehiculo{
    public AutoClasico(String marca, String modelo, String color, int precio,String radiomarca, String potencia) {
        super(marca,modelo,color,precio,radiomarca,potencia);
    
    }
    public AutoClasico(String marca, String modelo, String color, int precio) {
        super(marca,modelo,color,precio);
    
    }
    public AutoClasico(String marca, String modelo, String color) {
        super(marca,modelo,color);

    
    }
    public AutoClasico(String marca, String modelo, String color,String radiomarca, String potencia) {
        super(marca,modelo,color, radiomarca,potencia);
    
    }
}
