package ua.edu.chmnu.fks.oop.lab05;

public class Element {
    private int data;
    public Element next = null;

    public Element(int data, Element next){
        this.data = data;
        this.next = next;
    }

    public Element(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Element getNext(){
        return next;
    }

    public void setNext(Element next){
        this.next = next;
    }

    public Element next(){
        return next != null ? next: null;
    }
}
