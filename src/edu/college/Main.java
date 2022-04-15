package edu.college;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Energy energy = new Energy();
        Energy energy2 = new Energy(5, 3, 5);

        System.out.print("Insert speed(km/h): ");
        energy.setSpeed(scanner.nextDouble());
        System.out.print("Insert mass(kg): ");
        energy.setMass(scanner.nextDouble());
        System.out.print("Insert height(m): ");
        energy.setHeight(scanner.nextDouble());

        System.out.println("\nKinetic energy of first object:");
        energy.CountKineticEnergy();
        energy.PrintKineticEnergy();

        System.out.println("Potential energy of first object:");
        energy.CountPotentialEnergy();
        energy.PrintPotentialEnergy();

        System.out.println("\nKinetic energy of second object:");
        energy2.CountKineticEnergy();
        energy2.PrintKineticEnergy();

        System.out.println("Potential energy of second object:");
        energy2.CountPotentialEnergy();
        energy2.PrintPotentialEnergy();
    }
}
