/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab02;

import java.util.Scanner;

/**
 *
 * @author 1820501
 */
public class Lab02 {
      
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Просчитать функцию с заданными параметрами: ");
        System.out.println("2. Просчитать функцию со случайными параметрами: ");
        double a = 4.16, b = 5.07, x = -6.31;
        double y1, y2;
        double aa = Math.random() * 20 + (-10);
        double bb = Math.random() * 20 + (-10);
        double xx = Math.random() * 20 + (-10);

        y1 = function (a, b, x);
        y2 = function(aa, bb, xx);


        while (Math.pow(Math.exp((Math.cos(2/1-x)+ bb * Math.sin(3*x))), aa * x) < 0){
            bb = Math.random() * 20 + (-10);
            aa = Math.random() * 20 + (-10);
        }


        switch(scan.nextInt()){
            case 1:
                System.out.println("y = " + y1);
                break;
            case 2:
                System.out.println("y = " + y2);
                break;
        }
      }



      static double function (double a, double b, double x){
        return Math.pow(Math.exp((Math.cos(2/1-x)+ b * Math.sin(3*x))), a * x);
      }
}


//Math.random() * 20 + (-10)