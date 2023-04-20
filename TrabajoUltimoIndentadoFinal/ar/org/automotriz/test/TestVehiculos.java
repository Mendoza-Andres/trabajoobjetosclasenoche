package ar.org.automotriz.test;

import ar.org.automotriz.entities.AutoClasico;
import ar.org.automotriz.entities.AutoNuevo;
import ar.org.automotriz.entities.Bus;

public class TestVehiculos {
    public static void main(String[] args) {
        System.out.println("prueba1");
         Bus auto1=new Bus("1", "2", "3", 4);
         System.out.println(auto1);
          auto1.installar("cuatro", "cinco");
          System.out.println(auto1);
           auto1.modificar("otro", "tiene");
            System.out.println(auto1);

        System.out.println("prueba2");
         /*AutoClasico auto2=new AutoClasico("4", "5", "6", "siete", "ocho");*/
            AutoClasico auto2=new AutoClasico("4", "5", "6", "siete", "ocho");
           System.out.println(auto2);
             auto2.modificar("7", "8");
              System.out.println(auto2);
               AutoClasico auto3=new AutoClasico("9", "10", "11");
                System.out.println(auto3);
                 auto3.modificar("nueve", "diez");
                  System.out.println(auto3);

         System.out.println("prueba3");         
          AutoNuevo auto4=new AutoNuevo("carro", "nuevo", "colorido", 43210, "si", "alta");
            System.out.println(auto4);
              auto4.modificar("cambio", "igual");
               System.out.println(auto4);

}
}
