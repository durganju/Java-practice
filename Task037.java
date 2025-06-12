package java_tasks;

class Employee {
    private int pwd;
    protected int Salary;
    public int empid;

    Employee(int pwd, int Salary, int empid) {
        this.pwd = pwd;
        this.Salary = Salary;
        this.empid = empid;
    }

    public int getPwd() {
        return pwd;
    }
}

class HR extends Employee {
    HR() {
        super(1254, 50000, 10001);
    }
}

public class Task037 {
    public static void main(String[] args) {
        HR hr = new HR();

        System.out.println("Employee ID: " + hr.empid);     // Public
        System.out.println("Salary: " + hr.Salary);         // Protected
        System.out.println("Password: " + hr.getPwd());     // Private via getter
    }
}
