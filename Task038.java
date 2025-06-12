// File name: AbstractDemo.java

public class Task038 {

    public static void main(String[] args) {
        Employee e = new SalaryEmployee("George W.", "Houston, TX", 43);
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
    }
}

// Abstract class
abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " at " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}

// Subclass without any overridden methods
class SalaryEmployee extends Employee {
    public SalaryEmployee(String name, String address, int number) {
        super(name, address, number); // Call to Employee constructor
    }

    // No overridden methods here
}