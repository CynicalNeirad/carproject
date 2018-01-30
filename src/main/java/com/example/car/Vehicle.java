package com.example.car;
import javax.management.remote.SubjectDelegationPermission;
import java.util.Scanner;


public class Vehicle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String n = keyboard.nextLine();
        Car Red = new Car(n);
        System.out.println(Red.start());
        System.out.println(Red.acel());
        System.out.println(Red.mph());
        System.out.println(Red.stop());

        n = keyboard.nextLine();
        Car Blue = new Car(n);
        System.out.println(Blue.start());
        System.out.println(Blue.acel());
        System.out.println(Blue.mph());
        System.out.println(Blue.stop());

    }
}