package java_tasks;

public class Task020 {
    public static void main(String[] args) {
        // Initialize array with characters of your name
        char[] Name = { 'A', 'l', 'i', 'c', 'e' };


        int n = Name.length;
        System.out.println("There are " + n + " letters in my name.");


        System.out.print("Letters in my name: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }

        System.out.println();
    }
}


class CopyExample {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};


        int[] shallow = original;
        shallow[0] = 9;
        System.out.println("Original[0] after shallow copy change: " + original[0]);
        int[] deep = original.clone();
        deep[0] = 100;
        System.out.println("Original[0] after deep copy change: " + original[0]);
        System.out.println("Deep[0]: " + deep[0]);
    }
}

