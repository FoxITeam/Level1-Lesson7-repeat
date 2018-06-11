package ru.foxit.grayfox.animal;
// todo | 1. Создать классы Собака и Кот с наследованием от класса Животное.
// todo | 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому
// todo | методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
// todo | 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака
// todo | 0.5 м.; плавание: кот должен плавать медленно, собака 10 м.).
// todo | 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
// todo | (Например, dog1.run(150); -> результат: run: true)
// todo | 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть
// todo | 400 м., у другой 600 м.

/**
 * Author Main.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */

public class Main {
    // В абстрактном классе мы пишем правила для всех животных (общее поведение для всех животных) и любой объект который
    // хочет стать животным, обязан следовать этим правилам.
    public static void main(String[] args) {
        System.out.println("Кошка: ");
        Animal vaska = new Cat(200,2,2);
        vaska.run(1450);
        vaska.swim(1);
        vaska.jump(2);

        System.out.println("Собака: ");
        Animal elka = new Dog(500,3,2);
        elka.run(400);
        elka.swim(2);
        elka.jump(5);
    }


//    public static void main(String[] args) {
//        Animal vaska = new Cat("Васька");
//        System.out.println(vaska.getAnimalName());
//        vaska.run(600);
//        vaska.jump(1.5f);
//        vaska.swim(1);
//
//        Animal sharik = new Cat("Шарик");
//        System.out.println(sharik.getAnimalName());
//
//
//        // Создать массив животных и попробовать написать Animal[0] = new Cat
//        Animal[] animals = new Animal[5];
//        animals[0] = new Cat("Елка");
//        animals[1] = new Dog("Муха");
//        ...
//    }
}
