public class Employee {
    private final String firstName;
    private final String middleName;
    private final String surname;
    private int department;
    private int salary;

    private static int counter = 0;

    private final int id;

    public Employee(String surname, String firstName, String middleName, int department, int salary) {
        this.id = counter++;
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void setSalary() {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ". " + surname + " " + firstName + " " + middleName + ". Отдел: " + department + ". Зарплата: " + salary + ".";
    }
}
