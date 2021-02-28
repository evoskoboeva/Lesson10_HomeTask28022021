package com.companyCat.Task1;

import java.io.ObjectInputStream;

public class ClassRoom {
    public Pupil[] pupils;



    //private Pupil characteristics;

    public ClassRoom(int pupilsNumber) {
        pupils = new Pupil[pupilsNumber];
    }

    @Override
    public String toString() {
        String result = "\nClassRoom\n\n";
        for (int i = 0; i < this.pupils.length; i++) {
            result += "\n" + pupils[i];
        }

        return result;
    }



}

