package java_tasks;

public class Task005 {public static void add(int a, int b){
    int result = a + b;
    System.out.println("Addition: " + result);
}
public static void subtract(int a, int b){
    int result = a - b;
    System.out.println("Subraction: " + result);
}
public static void multiply(int a, int b){
    int result = a * b;
    System.out.println("Multiplication: " + result);
}
public static void divide(int a, int b){
    int result = a / b;
    System.out.println("Divition: " + result);
}
public static void main(String[] args){
    int x = 10;
    int y = 5;

    add(x, y);
    subtract(x, y);
    multiply(x, y);
    divide(x, y);
}
}
