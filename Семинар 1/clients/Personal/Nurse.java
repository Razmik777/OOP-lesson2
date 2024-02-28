package clients.Personal;

import java.time.LocalDate;

import clients.Animal;

public class Nurse extends Personal {

    public Nurse(String name, LocalDate birthDate, String specialization, int licenseNumber, double salary) {
        super(name, birthDate, specialization, licenseNumber, salary);
    }

    public void toWork() {
        System.out.println("Медсестра работает");
    }

    public void assistProcedures(Animal animal) {
        System.out.println("Медсестра назначает процедуры");
    }

    public void careForPatients(Animal animal) {
        System.out.println("Медсестра заботится о " + animal.getName() + " " + animal.getType());
    }
}
