/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab06;

/**
 *
 * @author 1820501
 */
public class FilmCamera extends Camera {
    
    protected String film = "n/a"; 

    public String Film() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
    
    public void descriptionOfCamera(){
        super.descriptionOfCamera();
        System.out.println("| Type of the film: " +film);
    }
}
