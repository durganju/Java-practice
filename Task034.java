package java_tasks;

public class Task034 {
    // First overloaded method
    void add(int x, int y) {
        System.out.println(x + " &&& " + y);
    }

    // Second overloaded method
    void add(int x, int y, int z) {
        System.out.println(x + " $$$ " + y + " $$$ " + z);
    }

    public static void main(String[] args) {
        Task034 tobj = new Task034();
        tobj.add(10, 20);         // Calls 2-parameter method
        tobj.add(100, 200, 300);  // Calls 3-parameter method
    }
}
