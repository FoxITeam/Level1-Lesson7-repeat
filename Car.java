package ru.foxit.grayfox;

public abstract class Car {
    private String model;
    private double fuilTank;
    private double fuilConsuption;
    private double maxFuilVolume;

    public Car(String model, double fuilTank, double fuilConsuption) {
        this.model = model;
        this.fuilTank = fuilTank;
        maxFuilVolume = fuilTank;
        this.fuilConsuption = fuilConsuption;
    }

    // Композиция это взаимодействие никак не связанных классов.
    public void drive(int distance) {
        fuilTank -= distance / fuilConsuption;
    }

    public double fillFuilTank() {
        double fuilNeed = maxFuilVolume - fuilTank;
        fuilTank = maxFuilVolume;
        return fuilNeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuilTank=" + fuilTank +
                ", fuilConsuption=" + fuilConsuption +
                '}';
    }
}
