import java.util.Scanner;

public class FindMaxNum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        System.out.print("Enter your Third number: ");
        int c = sc.nextInt();

        if (a > b) {
            System.out.println("It is greater than all value - " + a);
        } else if (b > c) {
            System.out.println("It is greater than all value - " + b);
        } else {
            System.out.println("It is greater than all value - " + c);
        }
    }
}

// Find maximum 3 number