package clients.impl;
import java.time.LocalDate;

import clients.Animal;
import clients.Goable;
import clients.Owner;

public  class Ostrich extends Animal implements Goable {
    @Override
    public void eat() {
        System.out.println("Страус клюет");
        
    }

    public Ostrich(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double toGo() {
        return 50;
        
    }

}
