package clients.Personal;

import java.time.LocalDate;

import clients.Animal;

public class Doctor extends Personal {


    public Doctor(String name, LocalDate birthDate, String specialization, int licenseNumber, double salary) {
        super(name, birthDate, specialization, licenseNumber, salary);
    }

    public void toWork() {
        System.out.println("Доктор работает");
    }

    public void makeDiagnosis(Animal animal) {
        System.out.println("Доктор ставит диагноз " + animal.getName() + " " + animal.getType());
    }

    public void toHeal(Animal animal) {
        System.out.println("Доктор лечит " + animal.getName() + " " + animal.getType());
    }

}
