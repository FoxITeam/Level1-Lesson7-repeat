package ru.foxit.grayfox;

public class GasStation {
    private double fuilTank;

    public GasStation(int fuilTank) {
        this.fuilTank = fuilTank;
    }

    public void getFuil(Car car) {
        fuilTank -= car.fillFuilTank();
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "fuilTank=" + fuilTank +
                '}';
    }
}
