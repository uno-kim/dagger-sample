package com.example.dagger.constructorinjection;

import javax.inject.Inject;

public class ElectricHeater implements Heater {

    boolean heating;

    @Inject
    public ElectricHeater() {
        System.out.println("ElectricHeater() created");
    }

    @Override
    public void on() {
        System.out.println("~ ~ ~ heating on ~ ~ ~");
        this.heating = true;
    }

    @Override
    public void off() {
        System.out.println("~ ~ ~ heating off ~ ~ ~");
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
