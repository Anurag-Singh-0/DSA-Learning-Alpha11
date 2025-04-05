import java.util.Scanner;

public class FindMaxNum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter your first A number: ");
        int a = sc.nextInt();
        System.err.print("Enter your second B number: ");
        int b = sc.nextInt();
        System.err.print("Enter your Third C number: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.err.println("It is greater than all value - " + a);
            } else {
                System.out.println("It is greater than all value - " + c);
            }
        } else if (b > c) {
            System.out.println("It is greater than all value - " + b);
        } else {
            System.out.println("It is greater than all value - " + c);
        }
    }
}

// Find maximum 3 number 