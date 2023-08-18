/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dfcm9
 */
public class Jugador {
    
    private String nombre, nacionalidad, pieh;
    private Equipo equipo = new Equipo();
    protected int edad, rating, agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo;

    public Jugador(String nombre, String nacionalidad, String pieh, int edad, int rating, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.pieh = pieh;
        this.edad = edad;
        this.rating = rating;
        this.agarre = agarre;
        this.lanzamiento = lanzamiento;
        this.fisico = fisico;
        this.ritmo = ritmo;
        this.entrada = entrada;
        this.vision = vision;
        this.passing = passing;
        this.regate = regate;
        this.disparo = disparo;
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

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }

    @Override
    public String toString() {
        return "Jugador: [Nombre: "+nombre+"]" + "[Nacionalidad: "+nacionalidad+"]" + "[Piehabil: "+pieh+"]" + "[Edad: "+edad+"]" ;
    }
    
    
    
    
    
    
}
