package ua.edu.chmnu.fks.oop.lab08;

import java.util.*;


public class Lab08 {

    public static void main(String[] args) {
        int[] key = {3};
        Integer keyValue;
        String encoded = "", decoded = "";
        String message = "Deadline in 12:00 am";
        Queue<Integer> encodingQueue = new LinkedList<Integer>();


        // key queues
        for (int i = 0; i < key.length; i++) {
            encodingQueue.add(key[i]);
        }

        //encode message
            for (int i = 0; i < message.length(); i++) {
                keyValue = encodingQueue.remove();
                encoded += (char) (message.charAt(i) + keyValue);
                encodingQueue.add(keyValue);
            }

            System.out.println("Encoded message: " + encoded);


    }
}
