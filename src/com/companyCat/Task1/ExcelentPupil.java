package com.companyCat.Task1;

public class ExcelentPupil extends Pupil {

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public ExcelentPupil(String name) {
        super(name);
        this.characteristics = "ecellent";
    }
    @Override
    public String relax() {
        return super.relax() + "bad";
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

