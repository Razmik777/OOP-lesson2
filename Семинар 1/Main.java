import clients.Owner;
import clients.Swimable;
import clients.VeterinaryClinic;
import clients.Personal.Doctor;
import clients.Personal.Nurse;
import clients.impl.Bird;
import clients.impl.Cat;
import clients.impl.Dog;
import clients.impl.Duck;
import clients.impl.Fish;
import clients.impl.Lion;
import clients.impl.Ostrich;
import clients.Animal;
import clients.Flyable;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Animal cat = new Cat("Мурзик", 5, LocalDate.now(), new Owner("Роман"));
        Animal dog = new Dog("Шарик", 20, LocalDate.now(), new Owner("Иван"));
        Animal bird = new Bird("Кеша", 0.2f, LocalDate.now(), new Owner("Сергей"));
        Animal duck = new Duck("Кряква", 0.5f, LocalDate.now(), new Owner("Алик"));

        VeterinaryClinic clinic = new VeterinaryClinic("Ветеринарная клиника");
        clinic.addAnimal(dog);
        clinic.removeAnimal(bird);
        System.out.println(clinic);

        Doctor doctor = new Doctor("Вячеслав", LocalDate.now(), "Терапевт", 123, 10000);
        Nurse  nurse = new Nurse("Диана", LocalDate.now(), "Терапевт-медсестра", 456, 5000);

        doctor.toWork();
        nurse.toWork();
        doctor.makeDiagnosis(dog);
        nurse.assistProcedures(dog);
        doctor.toHeal(dog);
        nurse.careForPatients(dog);

        System.out.println(doctor);
        System.out.println(nurse);
        System.out.println(clinic.getSalary(doctor));
    }
}
