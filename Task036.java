package java_tasks;

public class Task036 {

    // Method 1: int first, float second
    void add(int x, float y) {
        System.out.println("int-float: " + x + ", " + y);
    }

    // Method 2: float first, int second
    void add(float x, int y) {
        System.out.println("float-int: " + x + ", " + y);
    }

    public static void main(String[] args) {
        Task036 obj = new Task036();

        obj.add(100, 80.80f);    // Matches int, float
        obj.add(10.50f, 60);     // Matches float, int
    }
}
