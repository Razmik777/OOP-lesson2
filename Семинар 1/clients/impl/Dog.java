package clients.impl;
import java.time.LocalDate;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public  class Dog extends Animal implements Swimable, Goable {
    @Override
    public void eat() {
        System.out.println("Собака ест");
        
    }

    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double swim() {
        return 5;
        
    }

    @Override
    public double toGo() {
        return 30;
        
    }

    
}
