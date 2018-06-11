package ru.foxit.grayfox;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Car car = new Car("BMW", 100, 10);
        GasStation gasprom = new GasStation(1000);
        Scooter scooter = new Scooter("Honda", 10, 0.2);
        Truck volvo = new Truck("Volvo", 500, 0.1);

        for (int i = 0; i < 10; i++) {
            scooter.drive(new Random().nextInt(5));
            volvo.drive(new Random().nextInt(2));
        }

        System.out.println(scooter);
        System.out.println(volvo);
        gasprom.getFuil(scooter);
        gasprom.getFuil(volvo);
        System.out.println(gasprom);
        System.out.println(scooter);
        System.out.println(volvo);
//        car.drive(5);
//        car.drive(5);
//        car.drive(5);
//        car.drive(5);
//        car.drive(5);
//        car.drive(5);
//        System.out.println(car);
//        gasStation.getFuil(car);
//        System.out.println(gasStation);
//        System.out.println(car);
    }
}
