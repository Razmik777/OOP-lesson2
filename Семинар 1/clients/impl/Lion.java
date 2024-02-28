package clients.impl;
import java.time.LocalDate;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public  class Lion extends Animal implements Swimable,Goable {
    @Override
    public void eat() {
        System.out.println("Лев кушает");
        
    }

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }


    @Override
    public double swim() {
        return 15;
        
    }

    @Override
    public double toGo() {
        return 20;
        
    }
   

}
