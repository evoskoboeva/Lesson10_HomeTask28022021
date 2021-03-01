package com.companyCat.Task1;

import java.io.ObjectInputStream;

public class Main {

    //Создайте класс ученик — Pupil. В теле класса создайте поле имя и методы void
    //study(), void read(), void write(), void relax(). Создайте 3 производных
    //класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
    //переопределите каждый из методов, в зависимости от успеваемости ученика.
    //Создать класс, представляющий учебный класс школы — ClassRoom. Конструктор
    //класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4
    //учеников. Предусмотрите возможность того, что пользователь может передать 2 или
    //3 аргумента. Выведите информацию о том, как все ученики экземпляра класса
    //ClassRoom умеют учиться, читать, писать, отдыхать. Для каждого из классов
    //реализовать метод toString() и конструктор с параметром.
    public static void main(String[] args) {

        Pupil pupil = new Pupil("Ivanoff");
        System.out.println(pupil.getName()+pupil.write());

        BadPupil badPupil = new BadPupil("Petroff");
        System.out.println(badPupil.getName()+badPupil.relax());

        GoodPupil goodPupil = new GoodPupil("Sidoroff");
        System.out.println(goodPupil.getName()+goodPupil.read());

        ExcelentPupil excelentPupil = new ExcelentPupil("Medoff");
        System.out.println(excelentPupil.getName()+excelentPupil.study());



        ClassRoom classRoom = new ClassRoom(4);
        classRoom.pupils[0] = excelentPupil;
        classRoom.pupils[1] = badPupil;
        classRoom.pupils[2]= goodPupil;
        classRoom.pupils[3]=pupil;
        System.out.println(classRoom);

        }


    }

