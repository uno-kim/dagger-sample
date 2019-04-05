package com.example.dagger.constructorinjection;

import dagger.Component;
import dagger.Lazy;

@Component
public interface CoffeeComponent {

    // Provision method
    CoffeeMaker getCoffeeMaker();

    Lazy<MilkMaker> getLazyMilkMaker();
}
