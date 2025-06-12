package java_tasks;

public class Task019 {
    public static void main(String[] args) {
        // Step 1: Create an array of your name
        char[] Name = { 'J', 'o', 'h', 'n' };


        System.out.println(Name); // This may print as a memory reference, not characters individually


        int n = Name.length;
        System.out.println("There are " + n + " letters in my name");


        System.out.print("Letters in my name: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }

        System.out.println();
    }
}
