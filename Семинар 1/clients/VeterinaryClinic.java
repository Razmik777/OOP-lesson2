package clients;

import java.util.ArrayList;
import java.util.List;

import clients.Personal.Personal;

public class VeterinaryClinic {

    protected String nameOfClinic;
    protected List<Personal> personal = new ArrayList<>();
    protected List<Animal> animal = new ArrayList<>();

    public VeterinaryClinic(String nameOfClinic) {
        this.nameOfClinic = nameOfClinic;
        this.animal = new ArrayList<>();
        this.personal = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("name = %s", nameOfClinic);
    }
    
    public void addAnimal(Animal animal){
        this.animal.add(animal);
    }

    public void removeAnimal(Animal animal){
        this.animal.remove(animal);
    }

    public List<Flyable> getAllFlyers() {
        List<Flyable> flyables = new ArrayList<>();
        for(Flyable flyable : flyables) {
            if(flyable instanceof Flyable) {
                ((Flyable) flyable).fly();
            }
        }
        return flyables;
    }

    public List<Swimable> getAllSwimmers() {
        List<Swimable> swimables = new ArrayList<>();
        for(Swimable swimable : swimables) {
            if(swimable instanceof Swimable) {
                ((Swimable) swimable).swim();
            }
        }
        return swimables;
    }

    public List<Goable> getAllGoers() {
        List<Goable> goables = new ArrayList<>();  
        for(Goable goable : goables) {
            if(goable instanceof Goable) {
                ((Goable) goable).toGo();
            }
        }
        return goables;
    }

    public double getSalary(Personal person) {
        return person.getSalary();
    }

    public void setSalary(Personal person, double salary){
        person.setSalary(salary);
    }
}
