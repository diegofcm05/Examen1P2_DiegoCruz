package paquete;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dfcm9
 */
public class Equipo {
    
    private String nombre, pais;
    private int rating;
    private ArrayList<Jugador> plantilla = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        setRating();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return rating;
    }

    public void setRating() {
        int acum = 0;
        if (plantilla.isEmpty()){
            rating = 0;
        }
        else{
            for (Jugador jugador : plantilla) {
                acum+= jugador.getRating();
            }
            rating = acum/plantilla.size();
        }
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public String toString() {
        return "Equipo: [Nombre: "+nombre+"] " + "[Pais: "+pais+"] " + "[Rating: "+rating+"]";
    }
    
    
    
    
    
}
