package ru.foxit.grayfox;

/**
 * Author GasStation.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */

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
