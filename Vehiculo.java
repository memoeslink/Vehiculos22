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
public class Vehiculo {
    
    private String nombre;
    private int currentOcupantes = 0;
    private int capacidad, nllantas;
    private boolean cinturones, tienecinturones;
    
    public void mensaje()
    {
        JOptionPane.showMessageDialog(null, "Vehículo: " + this.nombre + "\n Capacidad: " + this.capacidad + "\n N. de llantas: " + this.nllantas);
    }
    
    public boolean abrocharCinturones()
    {
        if(tienecinturones==true)
        {
            if(cinturones==false)
            {
                cinturones = true;
                JOptionPane.showMessageDialog(null, "Los cinturones del vehículo " + this.nombre + " han sido abrochados.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Los cinturones del vehículo " + this.nombre + " ya están abrochados");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El vehículo " + this.nombre + " no tiene cinturones.");
        }
        return cinturones;
    }
    
    public Vehiculo()
    {
        this.nombre = "";
        this.capacidad = 0;
        this.nllantas = 0;
        this.cinturones = false;
        this.tienecinturones = false;
    }
    
    //Limpiar y construir
    //Src y ejecutable
    public Vehiculo(String nombre, int capacidad, int nllantas, boolean cinturones, boolean tienecinturones)
    {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nllantas = nllantas;
        this.cinturones = cinturones;
        this.tienecinturones = tienecinturones;
    }
    
    public int getNllantas() {
        return nllantas;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @param nllantas the nllantas to set
     */
    public void setNllantas(int nllantas) {
        this.nllantas = nllantas;
    }
    
    @Override
    public String toString()
    {
        return this.getNombre() + " puede llevar a " + this.getCapacidad() + " personas, y cuenta con " + this.getNllantas() + " llantas.";
    }

    /**
     * @return the cinturones
     */
    public boolean isCinturones() {
        return cinturones;
    }

    /**
     * @param cinturones the cinturones to set
     */
    public void setCinturones(boolean cinturones) {
        this.cinturones = cinturones;
    }

    /**
     * @return the tienecinturones
     */
    public boolean isTienecinturones() {
        return tienecinturones;
    }

    /**
     * @param tienecinturones the tienecinturones to set
     */
    public void setTienecinturones(boolean tienecinturones) {
        this.tienecinturones = tienecinturones;
    }
    
    public boolean subirPasajero(Persona p){
        boolean r = false;
        if(this.currentOcupantes<this.capacidad)
        {
            this.currentOcupantes++;
            r = true;
        }
        return r;
    }
    
    public boolean bajarPasajero(Persona p){
        boolean r = false;
        if(this.currentOcupantes > 0)
        {
            this.currentOcupantes--;
            r = true;
        }
        return r;
    }
}
