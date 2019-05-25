package ua.edu.chmnu.fks.oop.lab03;

public class Audit {
    public static void main(String[] args) {

        int[] arr = {6, 2, 5, 5, 4, 2, 1};
        int temp;

        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            int j = i - 1;
            while( j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.printf("  " + arr[i]);
        }
    }
}
