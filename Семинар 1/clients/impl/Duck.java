package clients.impl;
import java.time.LocalDate;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Duck extends Animal implements Flyable,Swimable,Goable {
    @Override
    public void eat() {
        System.out.println("Утка клюет");
        
    }

    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return 2;
    }

    @Override
    public double swim() {
        return 8;
        
    }

    @Override
    public double toGo() {
       return 5;
        
    }


}
