package java_tasks.exceptions;

import java.util.ArrayList;

public class Exception009_1 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        // Adding subject marks
        marks.add(85);  // Subject 1
        marks.add(90);  // Subject 2
        marks.add(78);  // Subject 3

        // Print all marks
        System.out.println("Marks: " + marks);

        // Access one subject mark
        System.out.println("Mark in Subject 2: " + marks.get(1)); // Index starts at 0

        // Remove 1st subject mark
        marks.remove(0);
        System.out.println("After removing Subject 1: " + marks);
    }
}
