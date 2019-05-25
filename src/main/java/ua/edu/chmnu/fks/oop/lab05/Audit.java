package ua.edu.chmnu.fks.oop.lab05;

public class Audit {
    public static void main(String[] args) {
        List list = new List();
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(1);
        list.addLast(9);
        System.out.println("\n" + " direct order:");
        list.printList();
        //list.removeLast();
        list.reverseList();
        System.out.println("from the end:");
        list.printList();
        Element find = list.find(1);
        System.out.printf("%d on the list\n", find.getData());
        System.out.printf("\n" + "length list: %d\n", list.lengthList());
    }
}

