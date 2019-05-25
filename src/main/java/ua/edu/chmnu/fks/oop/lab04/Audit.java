package ua.edu.chmnu.fks.oop.lab04;

import java.math.BigInteger;

public class Audit {

    public static void main(String[] args) {

        System.out.println("Answer is: " + fact(5));
    }


    public static int fact(int n) {

        if (n == 1)
            return 1;

        return n * fact(n - 1);
    }

    public static BigInteger fact(BigInteger n) {

        if (n.equals(BigInteger.ONE))
            return BigInteger.ONE;

        return n.multiply(fact(n.subtract(BigInteger.ONE)));

    }
}


