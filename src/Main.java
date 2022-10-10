import java.util.Arrays;

public class Main {

    private static final Employee [] employee = new Employee[10];

    public static void main(String[] args) {
            employee[0] = new Employee("Шишкин", "Андрей", "Денисович", 1, 60_000);
            employee[1] = new Employee("Фомин", "Сергей", "Иванович", 2, 65_000);
            employee[2] = new Employee("Самойлова", "Ирина", "Васильевна", 3, 75_000);
            employee[3] = new Employee("Зарипова", "Марина", "Сергеевна", 4, 82_000);
            employee[4] = new Employee("Якубов", "Кирилл", "Александрович", 5, 70_000);
            employee[5] = new Employee("Крылов", "Егор", "Андреевич", 1, 86_000);
            employee[6] = new Employee("Кашина", "Наталья", "Григорьевна", 2, 90_000);
            employee[7] = new Employee("Петрова", "Анна", "Дмитриевна", 3, 100_000);
            employee[8] = new Employee("Лихачев", "Артём", "Артурович", 4, 93_000);
            employee[9] = new Employee("Горбунова", "Светлана", "Николаевна", 5, 71_000);

        System.out.println("Список сотрудников (все данные):");
            printList();
        System.out.println("Сумма затрат на зарплаты в месяц равна " + countSalaryExpenditures() + " рублей.");

        String employeeWithMinSalary = findEmployeeWithMinSalary();
        if (employeeWithMinSalary == null) {
            System.out.println("Нет сотрудника с минимальной зарплатой.");
        } else {
            System.out.println("Сотрудник с минимальной зарплатой  - " + findEmployeeWithMinSalary());
        }
        String employeeWithMaxSalary = findEmployeeWithMaxSalary();
        if (employeeWithMaxSalary == null) {
            System.out.println("Нет сотрудника с максимальной зарплатой.");
        } else {
            System.out.println("Сотрудник с максимальной зарплатой  - " + findEmployeeWithMaxSalary());
        }

        System.out.println("Среднее значение зарплат - " + countAverageSalary() + " рублей.");
        System.out.println("Список сотрудников (ФИО):");
            printOnlyNames();

        System.out.println(" ");
        System.out.println("Задача из билета №4.");
        String[] string = new String[] {"утро", "день", "вечер", "утро"};
        System.out.println(Arrays.toString(deleteDuplicates(string)));
    }

    public static void printList() {
        for (int index = 0; index < employee.length; index++) {
            System.out.println(employee[index]);
        }
    }

    public static int countSalaryExpenditures() {
        int sum = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static String findEmployeeWithMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        String employeeWithMinSalary = null;
        for (Employee employee : employee) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee.getSurname() + " " + employee.getFirstName();
            }
        }
        return employeeWithMinSalary;
    }

    public static String findEmployeeWithMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        String employeeWithMaxSalary = null;
        for (Employee employee : employee) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee.getSurname() + " " + employee.getFirstName();
            }
        }
        return employeeWithMaxSalary;
    }

    public static int countAverageSalary() {
        int sum = 0;
        int averageSalary = 0;
        int j = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                sum = sum + employee.getSalary();
                j++;
            }
            averageSalary = sum / j;
        }
        return averageSalary;
    }

    public static void printOnlyNames() {
        for (int a = 0; a < employee.length; a++) {
            System.out.println(employee[a].getSurname() + " " + employee[a].getFirstName() + " " + employee[a].getMiddleName());
        }
    }


    // Метод для задачи из билета №4
    public static String[] deleteDuplicates(String[] string) {
        String[] stringWithoutDuplicates = new String[string.length];
        boolean ifRepeat = false;
        int k = 0;
        for (int i = 0; i < string.length; i++) {
            ifRepeat = false;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i].equals(string[j])) {
                    ifRepeat = true;
                    break;
                }
            }
            if (!ifRepeat){
                k++;
                stringWithoutDuplicates[k] = string[i];
            }
        }
        return stringWithoutDuplicates;
    }

}