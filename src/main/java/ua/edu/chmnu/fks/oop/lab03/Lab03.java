package ua.edu.chmnu.fks.oop.lab03;

public class Lab03 {

    public static void main(String[] args) {

        int[] arr = new int[]{30, -2, 17, 75, 17, 64, 86, 9, 17};


        int num = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 17) {
                num += 1;
            }

        }
        System.out.println("The probability of occurrence of a given number in the array = " + num + " to "+ arr.length);
    }
}
