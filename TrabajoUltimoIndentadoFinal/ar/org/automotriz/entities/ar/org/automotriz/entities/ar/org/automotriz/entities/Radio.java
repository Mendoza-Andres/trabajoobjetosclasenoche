package ar.org.automotriz.entities;
public class Radio {
    private String radiomarca;
    private String potencia;
    public Radio(String radiomarca, String potencia) {
        this.radiomarca = radiomarca;
        this.potencia = potencia;
    }
    @Override
    public String toString() {
        return "radio [radiomarca=" + radiomarca + ", potencia=" + potencia + "]";
    } 
    public String getMarca() {
        return radiomarca;
    }
    public String getPotencia() {
        return potencia;
    }



}
