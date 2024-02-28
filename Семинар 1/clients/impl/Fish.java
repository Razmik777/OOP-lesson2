package clients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Owner;
import clients.Swimable;

public  class Fish extends Animal implements Swimable {
    @Override
    public void eat() {
        System.out.println("Рыба ест");

    }

    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double swim() {
        return 30;
        
    }

}
