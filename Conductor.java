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
public class Conductor implements Persona{
    
    private String nombre;
    private boolean isInVehiculo;
    private Vehiculo vehiculo;
    
    public Conductor(String n){
        this.nombre = n;
    }
    
    @Override
    public boolean subirAVehiculo(Vehiculo v) {
        boolean r = false;
        if(this.isInVehiculo==false)
        {
            this.isInVehiculo = true;
            this.vehiculo = v;
            r = true;
            //return true;
        }
        return r;
        //return false;
    }

    @Override
    public boolean isConductor() {
        return true;
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
        String s = "No tengo vehículo qué conducir.";
        if(this.isInVehiculo())
        {
            s = "¡Hey, perros! Estoy manejando un " + this.vehiculo.getNombre() + " (xD).";
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
