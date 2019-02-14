package ua.edu.chmnu.fks.oop.lab04;

import java.math.BigInteger;

public class Lab04_1 {

    public static void main(String[] args){

      System.out.println(fact(5));
    }


    public static int fact (int n){

        if (n == 1)
            return 1;


        return n * fact(n-1);

    }

}
