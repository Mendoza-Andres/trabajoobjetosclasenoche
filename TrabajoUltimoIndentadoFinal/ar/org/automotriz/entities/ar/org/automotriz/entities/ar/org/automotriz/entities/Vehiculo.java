package ar.org.automotriz.entities;
public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private Radio radio;
    private int precio;

    public  Vehiculo(String marca, String modelo, String color, int precio,String radiomarca, String potencia) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.radio = new Radio(radiomarca, potencia);
        this.precio = precio;
    }
    
    public  Vehiculo(String marca, String modelo, String color,String radiomarca, String potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.radio = new Radio(radiomarca, potencia);
    }

    public  Vehiculo(String marca, String modelo, String color, int precio) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public  Vehiculo(String marca, String modelo, String color) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        
    }

    @Override
    public String toString() {
        return "Vehiculos [AutoNuevo=" + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
                + ", Radio=" + radio + ", precio=" + precio + "]";
    }

    public void estabilizar(String radiomarca, String potencia){
        if(radiomarca==null&potencia==null) this.radio=null;
    }
    public void installar(String radiomarca, String potencia){
      if(this.radio!=null) System.out.println("ya hay Radio");else{
     this.radio=new Radio(radiomarca, potencia);
   }  }
public void modificar(String radiomarca, String potencia){
       if(this.radio!=null) this.radio=new Radio(radiomarca, potencia); 
       else System.out.println("no hay Radio para modificar");
    }

   

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public Radio getRadio() {
        return radio;
    }

    public int getPrecio() {
        return precio;
    }
}
