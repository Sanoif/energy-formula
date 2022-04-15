package edu.college;

public class Energy {
    private final double G = 9.8;
    private double speed;
    private double mass;
    private double height;
    private double Ekin;
    private double Epot;

    public Energy() {
    }

    public Energy(double speed, double mass, double height) {
        this.speed = speed;
        this.mass = mass;
        this.height = height;
    }

    public void CountKineticEnergy() {
        Ekin = (mass * Math.pow(speed, 2)) / 2;
    }

    public void CountPotentialEnergy() {
        Epot = mass * G * height;
    }

    public void PrintKineticEnergy() {
        System.out.printf("""
                Mass: %skg
                Speed: %s m/s
                Ekin: %s J
                """, mass, speed, Ekin);
    }

    public void PrintPotentialEnergy() {
        System.out.printf("""
                Mass: %s kg
                G: %s m/s^2
                Epot: %s J
                """, mass, G, Epot);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getEkin() {
        return Ekin;
    }

    public double getEpot() {
        return Epot;
    }
}
