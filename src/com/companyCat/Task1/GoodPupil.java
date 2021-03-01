package com.companyCat.Task1;

public class GoodPupil extends Pupil {

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public GoodPupil(String name) {
        super(name);
        this.characteristics = "good";
    }
    @Override
    public String relax() {
        return super.relax()+"so so" ;
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
