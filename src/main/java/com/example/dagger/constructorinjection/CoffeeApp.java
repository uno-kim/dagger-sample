package com.example.dagger.constructorinjection;

import dagger.Lazy;
import com.example.dagger.constructorinjection.DaggerCoffeeComponent;

public class CoffeeApp {

    public static void main(String[] args) {

        CoffeeComponent coffeeComponent1 = DaggerCoffeeComponent.create();
        System.out.println(coffeeComponent1);
        CoffeeMaker coffeeMaker1 = coffeeComponent1.getCoffeeMaker();
        coffeeMaker1.brew();
        System.out.println(coffeeMaker1);

        Lazy<MilkMaker> milkMakerLazy1 = coffeeComponent1.getLazyMilkMaker();
        milkMakerLazy1.get().brew();

        CoffeeComponent coffeeComponent2 = DaggerCoffeeComponent.create();
        System.out.println(coffeeComponent2);
        CoffeeMaker coffeeMaker2 = coffeeComponent1.getCoffeeMaker();
        System.out.println(coffeeMaker2);
    }
}
