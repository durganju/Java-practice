package java_tasks.exceptions;

class OuterClass1 {
    int x = 10;
    private class InnerClass1 {
        int y = 5;
    }
    public int getSum() {
        InnerClass1 inner = new InnerClass1();
        return inner.y + x;
    }
}
public class Exception012 {
    public static void main(String[] args) {
        OuterClass1 myOuter = new OuterClass1();
        System.out.println(myOuter. getSum());
    }
}

