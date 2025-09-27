import java.util.Arrays;

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
        int n_r_fact = factorial(n-r);

        int res = nFact / (rFact * n_r_fact);
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        // swap(5, 7);s
        binoCofficient(3, 2);

    }
}