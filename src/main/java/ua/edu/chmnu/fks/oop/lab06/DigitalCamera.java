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
public class DigitalCamera extends Camera {
    
    protected double fps = 0;

    public double getFps() {
        return fps;
    }

    public void setFps(double fps) {
        this.fps = fps;
    }
    
    public void descriptionOfCamera (){
        super.descriptionOfCamera();
        System.out.println("| This camera shoots at a frequency: " +fps+ " frame per second");
    }
}
