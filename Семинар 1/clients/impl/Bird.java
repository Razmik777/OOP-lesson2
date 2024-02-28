package clients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Flyable;
import clients.Owner;

public class Bird extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("Птица клюет");

    }

    public Bird(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return 10;
    }

}
