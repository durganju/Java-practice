package java_tasks.exceptions;

import java.util.*;

public class Exception020 {

    public static void main(String[] args) {


        List<String> a1 = new ArrayList<>();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println("ArrayList Elements");
        System.out.println("\t" + a1);


        List<String> l1 = new LinkedList<>();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println("LinkedList Elements");
        System.out.println("\t" + l1);


        Set<String> s1 = new HashSet<>();
        s1.add("Zara");
        s1.add("Mahnaz");
        s1.add("Ayan");
        System.out.println("Set Elements");
        System.out.println("\t" + s1);


        Map<String, String> m1 = new HashMap<>();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println("Map Elements");
        System.out.println("\t" + m1);
    }
}
