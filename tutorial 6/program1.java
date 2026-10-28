class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class Developer extends Employee {
    double bonus;
    double totalSalary;

    Developer(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
        bonus = basicSalary * 0.10;
        totalSalary = basicSalary + bonus;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class program1 {
    public static void main(String[] args) {
        Developer d = new Developer(101, "Rahul", 30000);
        d.display();
    }
}