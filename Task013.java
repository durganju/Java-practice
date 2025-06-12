package java_tasks;

public class Task013 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            if (i == 5 || i == 7) {
                continue; // Skip 5 and 7
            }
            System.out.println(i);
        }
    }
}

