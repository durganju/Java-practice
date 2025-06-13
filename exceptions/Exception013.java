package java_tasks.exceptions;

class OuterClass2 {
    static int x = 10;
    static class InnerClass2 {
        int y = 5;
    }
}
public class Exception013 {
    public static void main(String[] args) {
        OuterClass2.InnerClass2 myInner = new OuterClass2.InnerClass2();
        System.out.println(myInner.y + OuterClass2.x);
    }
}
