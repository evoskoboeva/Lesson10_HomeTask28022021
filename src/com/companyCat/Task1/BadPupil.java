package com.companyCat.Task1;

public class BadPupil extends Pupil{
    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public BadPupil(String name) {
        super(name);
        this.characteristics =  "bad";

    }


    @Override
    public String relax() {
        return super.relax() + "excellent";
    }
    @Override
    public String study() {
        return super.study();
    }
    @Override
    public String read() {
        return super.read();
    }
    @Override
    public String write() {
        return super.write();
    }
}
