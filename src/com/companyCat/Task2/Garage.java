package com.companyCat.Task2;

import com.companyCat.Task1.Pupil;

public class Garage {
    public Vehicle[] vehicles;

    public Garage(int vehicleNumber) {
        vehicles = new Vehicle[vehicleNumber];
    }

   /* public Garage[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Garage[] vehicles) {
        this.vehicles = vehicles;
    }*/

    @Override
    public String toString() {
        String result = "\nGarage\n\n";
        for (int i = 0; i < this.vehicles.length; i++) {
            result += "\n" + vehicles[i];
        }

        return result;
    }

}
