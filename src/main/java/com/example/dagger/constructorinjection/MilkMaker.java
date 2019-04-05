package com.example.dagger.constructorinjection;

import javax.inject.Inject;

public class MilkMaker {

    private final ElectricHeater heater;

    @Inject
    public MilkMaker(ElectricHeater heater) {
        System.out.println("MilkMaker() created");
        this.heater = heater;
    }

    public void brew() {
        heater.on();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
