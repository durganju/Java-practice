public class swapnumbers {
    public static void main(String[] args){
    int a= 2;
    int b= 5;

    System.out.println("Before Swap: a = " + a + ", b =" +b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("After Swap: a = " + a + ", b =" +b);
}
}
