import java.util.Scanner;

public class Task012_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctLogin = "Durga";
        String correctPwd = "12345867";
        String loginid, pwd;
        int count = 0;

        do {
            System.out.println("Enter your login ID and password:");
            loginid = sc.nextLine();
            pwd = sc.nextLine();

            if (!(loginid.equals(correctLogin) && pwd.equals(correctPwd))) {
                System.out.println("Incorrect credentials. Try again.");
                count++;
            }
        } while (!(loginid.equals(correctLogin) && pwd.equals(correctPwd)));

        System.out.println("You have logged in successfully after " + count + " failed attempts.");
        sc.close();
    }
}