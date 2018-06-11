package ru.foxit.grayfox.MyTest;

public abstract class Animal {
    private int runMaxDistance; // Дистанция бега
    private int swimMaxDistance; // Дистанция плавания
    private int jumpMaxDistance; // Дистанция прыжка

    // Конструктор
    public Animal(int runMaxDistance, int swimMaxDistance, int jumpMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }

    // Геттеры и сеттеры
    public int getRunMaxDistance() {
        return runMaxDistance;
    }

    public int getSwimMaxDistance() {
        return swimMaxDistance;
    }

    public int getJumpMaxDistance() {
        return jumpMaxDistance;
    }

    public void run(int runDistance) { // Бегать
        System.out.println("run: " + (runDistance <= getRunMaxDistance()));
    }
    public void swim(int swimDistance) { // Плыть
        System.out.println("swim: " + (swimDistance <= getSwimMaxDistance()));
    }
    public void jump(float jumpHeight) { // Прыгать
        System.out.println("jump: " + (jumpHeight <= getJumpMaxDistance()));
    }
}