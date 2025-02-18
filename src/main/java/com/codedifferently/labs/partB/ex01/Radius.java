package com.codedifferently.labs.partB.ex01;
import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");

        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.println("The area of circle is: "+area);

    }

}

