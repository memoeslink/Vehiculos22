/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Memoeslink
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro = new Vehiculo();
        carro.setNombre("Mini Cooper");
        carro.setNllantas(4);
        carro.setCapacidad(4);
        carro.setTienecinturones(true);
        carro.mensaje();
        carro.abrocharCinturones();
        
        Vehiculo camioneta = new Vehiculo();
        camioneta.setNombre("Lobo Raptor");
        camioneta.setNllantas(4);
        camioneta.setCapacidad(8);
        camioneta.setTienecinturones(true);
        camioneta.mensaje();
        camioneta.abrocharCinturones();
        
        Vehiculo autobus = new Vehiculo();
        autobus.setNombre("CapaCity");
        autobus.setNllantas(4);
        autobus.setCapacidad(50);
        autobus.setTienecinturones(true);
        autobus.mensaje();
        autobus.abrocharCinturones();
        
        Vehiculo moto = new Vehiculo("Yamaha", 2, 2, false, false);
        moto.mensaje();
        moto.abrocharCinturones();
        Persona Juan = new Conductor("Juan");
        Juan.conducir();
        
        Persona Memoeslink = new Conductor("Memoeslink");
        Memoeslink.subirAVehiculo(carro);
        Memoeslink.conducir();
        
        Persona Mony = new Pasajero("Mony");
        Mony.subirAVehiculo(moto);
        Mony.conducir();
    }
}
