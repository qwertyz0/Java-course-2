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
public class Lab06 {
    public static void main (String[] args){
        
        
        //Camera cam = new Camera();
        DigitalCamera dc = new DigitalCamera();
        FilmCamera fc = new FilmCamera();
        
        dc.setName("Canon");
        dc.setZoom(6.5);
        dc.setFps(29.9);
        dc.setType("Digital camera");
        dc.descriptionOfCamera();
       
        fc.setName("Sony");
        fc.setZoom(2.2);
        fc.setFilm("This film can shoot in the negative!");
        fc.setType("Film camera");
        fc.descriptionOfCamera();
        
    }
}
