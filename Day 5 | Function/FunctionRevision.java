import java.util.*;

public class FunctionRevision {

    // public static void swap(int a, int b) {
    // int temp = 0;

    // temp = a;
    // a = b;
    // b = temp;

    // System.out.println("a = " + a);
    // System.out.println("b = " + b);
    // }

    public static int factorial(int num) {
        int fac = 1;

        for (int i = 1; i <= num; i++) {
            fac = fac * i;
        }

        System.out.println("Factorial of " + num + " is = " + fac);
        return fac;
    }

    public static int binoCofficient(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int n_r_fact = factorial(n - r);

        int res = nFact / (rFact * n_r_fact);
        System.out.println(res);
        return res;
    }

    public static boolean isPrime(int n) {
        boolean num = true;
        if (n == 1) {
            return true;
        }

        if (n < 1) {
            return false;
        }

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it's Prime number or Not : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}