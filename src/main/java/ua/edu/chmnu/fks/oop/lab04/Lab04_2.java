package ua.edu.chmnu.fks.oop.lab04;

import java.lang.reflect.Array;

public class Lab04_2 {

    public static void main(String[] args){

        int [] arr = new int[] {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            int index = (int)(Math.random() * arr.length);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;


        }
        for(int u: arr){
            System.out.println(u);
        }
    }
}
