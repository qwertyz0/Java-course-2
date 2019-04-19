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
public class Camera {
    
    protected String name = "n/a";
    protected double zoom = 0;
    protected String type = "n/a";

    
    
    public String Type() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    public String Name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double Zoom() {
        return zoom;
    }

    public void setZoom(double zoom) {
        this.zoom = zoom;
    }
    
    
    public void descriptionOfCamera(){
    System.out.println("---------------------------------");
    System.out.println("| Camera name: " +name);
    System.out.println("| Type of the camera: " +type);
    System.out.println("| Zoom of the camera: " +zoom+ "-x");
    
    
}
    
}
