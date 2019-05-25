package ua.edu.chmnu.fks.oop.lab06;

public class Parallelepiped extends Parallelogram{
    private double height;
    private double angle2;
    private double angle3;

    public Parallelepiped(){

    }

    public Parallelepiped(double length, double width, double angle1, double height, double angle2, double angle3){
        super(length, width, angle1);
        this.height = height;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    public double volume(){
        return Math.abs(super.square() * height * Math.sin(angle2));
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(double angle2){
        this.angle2 = angle2;
    }

    public double getAngle3() {
        return angle3;
    }

    public void setAngle3(double angle3){
        this.angle3 = angle3;
    }

    @Override
    public double square() {
        Parallelogram p2 = new Parallelogram(getLength(), height, angle2);
        Parallelogram p3 = new Parallelogram(getWidth(), height, angle3);
        return 2 * (super.square() + p2.square() + p3.square());
    }

    @Override
    public double perimeter() {
        return super.perimeter() * 2 + 4 * height;
    }
}

