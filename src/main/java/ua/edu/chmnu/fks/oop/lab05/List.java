package ua.edu.chmnu.fks.oop.lab05;

public class List {
    private Element root = null;
    public void addFirst(int data){
        if(root == null){
            root = new Element(data);
        }
        else{
            root = new Element(data, root);
        }
    }

    public void addLast(int data){
        if(root == null){
            addFirst(data);
        }
        else{
            Element element = root;
            while(element.next() != null){
                element = element.next();
            }
            element.setNext(new Element(data));
        }
    }


    public Element find(int data) {
        Element element = root;
        while(element != null && element.getData() != data){
            element = element.next();
        }
        return element;
    }

    public void printList(){
        Element element = root;
        while(element != null){
            System.out.printf(" " + element.getData());
            element = element.next();
        }
        System.out.println();
    }

    public void reverseList()
    {
        Element element = root;
        Element previous = null;
        Element previous1 = null;
        while(element.getNext() != null)
        {
            if(element == root)
            {
                previous = element;
                element = element.getNext();
                previous.setNext(null);
            }
            else
            {
                previous1 = element;
                element = element.getNext();
                previous1.setNext(previous);
                previous = previous1;
            }
        }
        element.setNext(previous);
        root = element;
    }

    public int lengthList(){
        Element element = root;
        int count = 0;
        if(element != null){
            count++;
            while(element != null && element.next() != null){
                count++;
                element = element.next();
            }
        }
        return count;
    }
}
