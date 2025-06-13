package java_tasks.exceptions;


    class OuterClass4{
    int x = 50;
        class InnerClass4 {
        public int innerMethod() {
            return x;
        }
    }
}
public class Driverclass {
    public static void main(String[] args) {
        OuterClass4 myOuter = new OuterClass4();
        OuterClass4.InnerClass4 myInner = myOuter.new InnerClass4();
        System.out.println(myInner.innerMethod());
    }
}
