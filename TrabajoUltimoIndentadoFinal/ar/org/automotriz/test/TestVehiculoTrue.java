package ar.org.automotriz.test;

import ar.org.automotriz.entities.AutoClasico;
import ar.org.automotriz.entities.Bus;

public class TestVehiculoTrue {
      public static void main(String[] args) {
             System.out.println("prueba");
               Bus vehiculo1=new Bus("1", "2", "3", 4, "5", "6");
                System.out.println(vehiculo1);
                  AutoClasico vehiculo2=new AutoClasico("nullo", "a", "b");
                     System.out.println(vehiculo2);    
                       AutoClasico vehiiulo2=new AutoClasico("a", "b", "c", "uno", "dos");
                       System.out.println(vehiiulo2);
                          vehiiulo2.installar("tres", "cuatro");
                          System.out.println(vehiiulo2);
}
}
