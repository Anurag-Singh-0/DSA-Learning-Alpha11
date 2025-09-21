
import java.util.Scanner;

public class PrimeNum {

    public static void checkPrime(int n) {
        if(n < 0){
            System.out.println("Negative number has dosen't prime number, try to enter a positive number");
        }

        if (n % 2 == 0) {
            System.out.println("Not a prime number");
        } else {
            System.out.println("Prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check the number is prime num or not : ");
        int n = sc.nextInt();

        // for(int i = 2; i <= n; i++){
        //     if(i % 2 == 0){
        //         System.out.println("Not a prime number");
        //     }else{
        //         System.out.println("Prime Number");
        //     }
        // }

        checkPrime(n);
    }
}
