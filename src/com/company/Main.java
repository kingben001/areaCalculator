package com.company;

public class Main {

    public static void main(String[] args) {
        double test = area(5.0);
        System.out.println(test);
        double test2 = area(-2,4.0);
        System.out.println(test2);

    }
    public static double area (double radius){
        if (radius < 0){
            return -1.0;
        }
        radius = radius * radius * Math.PI;

        return radius;
    }
    public static double area (double x, double y){
        if (x < 0 || y < 0 || x + y < 0){
            return -1.0;
        }
        double rectangle2 = x * y;

        return rectangle2;
    }

}
