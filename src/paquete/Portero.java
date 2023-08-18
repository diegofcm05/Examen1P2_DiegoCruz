/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.Random;

/**
 *
 * @author dfcm9
 */
public class Portero extends Jugador{
    
    Random ran = new Random();

    public Portero() {
    }
    
    

    public Portero(String nombre, String nacionalidad, String pieh, int edad) {
        super(nombre, nacionalidad, pieh, edad);
        
        setAgarre();
        setLanzamiento();
        setFisico();
        setRitmo();
        setEntrada();
        setVision();
        setPassing();
        setRegate();
        setDisparo();
        setRating();
       
    }

    @Override
    public void setRating() {
        rating = (agarre+lanzamiento+fisico+ritmo+entrada+vision+passing+regate+disparo)/9;
    }

    @Override
    public void setAgarre() {  
        int x = (1+ ran.nextInt(12))*12;
        while (x<70 || x>100){
            x = (1+ ran.nextInt(12))*12;
            
        }
        agarre =x;  
    }

    @Override
    public void setLanzamiento() {
        int x = (1+ ran.nextInt(12))*12;
        while (x<70 || x>100){
            x = (1+ ran.nextInt(12))*12;
            
        }
        lanzamiento =x;
    }

    @Override
    public void setFisico() {
        int x = (1+ran.nextInt(5))*13;
        fisico =x;
    }

    @Override
    public void setRitmo() {
        int x = (1+ran.nextInt(5))*13;
        ritmo =x;
    }

    @Override
    public void setEntrada() {
        int x = (1+ran.nextInt(5))*13;
        entrada =x;
        
    }

    @Override
    public void setVision() {
        int x = (1+ran.nextInt(5))*13;
        vision =x;
    }

    @Override
    public void setPassing() {
        int x = (1+ ran.nextInt(12))*12;
        while (x<70 || x>100){
            x = (1+ ran.nextInt(12))*12;
            
        }
        passing =x;
    }

    @Override
    public void setRegate() {
        int x = (1+ran.nextInt(5))*13;
        regate =x;
   }

    @Override
    public void setDisparo() {
        int x = (1+ran.nextInt(5))*13;
        disparo =x;
    }

    
    
    
    
    
    
}
