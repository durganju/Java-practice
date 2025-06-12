package java_tasks;

public class Task035 {

    // Method with char parameters
    void add(char x, char y) {
        System.out.println("Characters: " + x + ", " + y);
    }

    // Method with int parameters
    void add(int x, int y) {
        System.out.println("Integers: " + x + ", " + y);
    }

    public static void main(String[] args) {
        Task035 obj = new Task035();

        obj.add('d', 'a');     // Calls method with char parameters
        obj.add(100, 100);     // Calls method with int parameters
    }
}
