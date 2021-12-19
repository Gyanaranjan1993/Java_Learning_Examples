package com.gyana.design.builderpattern;

import java.util.Scanner;

public class ClientApplication {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter What car you want : 1 for sports car, 2 for sedan car");

        int input = scanner.nextInt();
        Director director = new Director();
        Builder builder = new CarBuilder();

        switch (input) {
            case 1:
                Car sportsCar = director.buildSportsCar(builder);
                System.out.println(sportsCar);
                break;
            case 2 :
                Car sedanCar = director.buildSedan(builder);
                System.out.println(sedanCar);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
