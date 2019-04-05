package com.example.dagger.constructorinjection;

import javax.inject.Inject;

public class CoffeeMaker {

    private final ElectricHeater heater;

    @Inject
    public CoffeeMaker(ElectricHeater heater) {
        System.out.println("CoffeeMaker() created");
        this.heater = heater;
    }

    public void brew() {
        heater.on();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
