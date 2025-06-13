package java_tasks.exceptions;

class OuterClass5 {
    int x = 10;
    static class InnerClass5 {
        static int y = 5;
    }
}
public class Exception015 {
    public static void main(String[] args) {
        OuterClass5.InnerClass5 myInner = new OuterClass5.InnerClass5();
        System.out.println(myInner.y);

    }
}

