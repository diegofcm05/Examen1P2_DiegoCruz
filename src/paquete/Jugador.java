package paquete;


import paquete.Equipo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dfcm9
 */
public abstract class Jugador {
    
    private String nombre, nacionalidad, pieh;
    private Equipo equipo = new Equipo();
    private int edad;
    protected int rating, agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo;

    public Jugador(String nombre, String nacionalidad, String pieh, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.pieh = pieh;
        this.edad = edad;
    }

    

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPieh() {
        return pieh;
    }

    public void setPieh(String pieh) {
        this.pieh = pieh;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRating() {
        return rating;
    }

    public abstract void setRating();

    public int getAgarre() {
        return agarre;
    }

    public abstract void setAgarre();

    public int getLanzamiento() {
        return lanzamiento;
    }

    public abstract void setLanzamiento();

    public int getFisico() {
        return fisico;
    }

    public abstract void setFisico();

    public int getRitmo() {
        return ritmo;
    }

    public abstract void setRitmo();

    public int getEntrada() {
        return entrada;
    }

    public abstract void setEntrada();

    public int getVision() {
        return vision;
    }

    public abstract void setVision();

    public int getPassing() {
        return passing;
    }

    public abstract void setPassing();

    public int getRegate() {
        return regate;
    }

    public abstract void setRegate();
       
    

    public int getDisparo() {
        return disparo;
    }

    public abstract void setDisparo();

    @Override
    public String toString() {
        return "Jugador: [Nombre: "+nombre+"]" + "[Nacionalidad: "+nacionalidad+"]" + "[Piehabil: "+pieh+"]" + "[Edad: "+edad+"]" ;
    }
    
    
    
    
    
    
    
    
    
}
