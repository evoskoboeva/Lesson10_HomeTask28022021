package com.companyCat.Task1;

import java.util.Objects;

public class Pupil
{
    public String characteristics=" who knows ";
    private String name;

    String study() {
        return this.name+" usually study "+characteristics;

    }
    String read(){
        return this.name+" usually read "+characteristics;

    }
    String write(){
        return this.name+" usually write "+characteristics;

    }
    String relax(){
        return this.name+" usually relax "+characteristics;

    }

    public Pupil(String name) {
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pupil)) return false;
        Pupil pupil = (Pupil) o;
        return getName().equals(pupil.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\''+" mark = " + characteristics +'\''+
                '}';
    }

}
