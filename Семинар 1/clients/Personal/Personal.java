package clients.Personal;

import java.time.LocalDate;

public abstract class Personal {

    protected String name;
    protected LocalDate age;
    protected String specialization;
    protected int licenseNumber;
    public double salary;

    public Personal(String name, LocalDate age, String specialization, int licenseNumber, double salary) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("name = %s, birthDate = %s, specialization = %s, licenseNumber = %s, salary = %s", name,
                age, specialization, licenseNumber, salary);
    }

    public String getName() {
        return name;
    }

    public LocalDate getAge() {
        return age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void toWork();
}
