package arrayOfObjects;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John", "Doe", "Manager");
        employees[1] = new Employee("Jane", "Doe", "Assistant Manager");
        employees[2] = new Employee("Jack", "Doe", "Supervisor");

        for (Employee employee : employees) {
            employee.introduceSelf();
        }
    }
}
