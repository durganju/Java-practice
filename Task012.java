import java.util.Scanner;

public class Task012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctLogin = "Durga";
        String correctPwd = "12345867";
        String loginid, pwd;
        int count = 0;

        System.out.println("Enter your login ID and password:");
        loginid = sc.nextLine();
        pwd = sc.nextLine();

        while (!(loginid.equals(correctLogin) && pwd.equals(correctPwd))) {
            System.out.println("Incorrect credentials. Try again.");
            System.out.println("Enter your login ID and password:");
            loginid = sc.nextLine();
            pwd = sc.nextLine();
            count++;
        }

        System.out.println("You have logged in successfully after " + count + " failed attempts.");
        sc.close();
    }
}