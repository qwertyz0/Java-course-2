package ua.edu.chmnu.fks.oop.lab06;

public class Parallelogram {
    private double length = 0.0;
    private double width = 0.0;
    private double angle1 = 0.0;

    public Parallelogram(){

    }

    public Parallelogram(double length, double width, double angle1){
        this.length = length;
        this.width = width;
        this.angle1 = angle1;
    }

    public double perimeter(){
        return 2 * (length + width);
    }

    public double square(){
        return Math.abs(width * length * width * Math.sin(angle1));
    }

    public final double getLength() {
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public final double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getAngle1() {
        return angle1;
    }

    public void setAngle1(double angle1){
        this.angle1 = angle1;
    }
}
