public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static class Manager extends Employee {
        public Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        public void displayDetails() {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Sales", 50000);
        Manager m1 = new Manager(201, "Marketing", 75000);

        e1.setSalary(55000);

        m1.displayDetails();
    }
}
