package com.companyCat.Task2;

public class Main {

    public static void main(String[] args) {
        // Создать класс Vehicle – транспортное средство. В теле класса создайте поля:
        //координаты и параметры средств передвижения (цена, скорость, год выпуска).
        //Создайте 3 производных класса Plane, Саr и Ship.
        //Для класса Plane должна быть определена высота и количество пассажиров.
        //Для класса Ship — количество пассажиров и порт приписки.
        //Для класса Car — грузоподъёмность.
        //Создать класс Garage, который содержит массив транспортных средств и
        //реализовать наполнение гаража различными объектами. Написать программу,
        //которая выводит на экран информацию о всех транспортных средствах в гараже. Для
        //полей всех классов реализовать setter’ы (с проверками) и getter’ы, методы toString()
        //и конструкторы.


        Car car = new Car(-1000, 1878, -200, -5);
        Ship ship = new Ship(20000, 2025, 150, 150, "odessa");
        Plane plane = new Plane(500000, 2022, 400, 3, 250);

        Garage garage = new Garage(3);
        garage.vehicles[0] = car;
        garage.vehicles[1] = ship;
        garage.vehicles[2] = plane;
        System.out.println(garage);

    }
}