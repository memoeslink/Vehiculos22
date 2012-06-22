/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Memoeslink
 */
public class Pasajero implements Persona{

    private boolean isInVehiculo = false;
    private String nombre;
    private Vehiculo vehiculo;
    
    public Pasajero(String n){
        this.nombre = n;
    }
    
    @Override
    public boolean subirAVehiculo(Vehiculo v) {
        boolean r = false;
        if(this.isInVehiculo==false)
        {
            this.isInVehiculo = true;
            r = true;
        }
        return r;
    }

    @Override
    public boolean isConductor() {
        return false;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean isInVehiculo() {
        return this.isInVehiculo;
    }

    @Override
    public boolean bajarDeVehiculo() {
        boolean r = false;
        if(this.isInVehiculo==true)
        {
            this.isInVehiculo = false;
            r = true;
        }
        return r;
    }

    @Override
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    @Override
    public void conducir() {
        JOptionPane.showMessageDialog(null, "Yo soy un humilde pasajero y no puedo conducir.");
    }
    
}
