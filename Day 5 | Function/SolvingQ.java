
import java.util.Scanner;

public class SolvingQ {

    // public static void avarageCal(double  a, double b, double c) {
    //     double avg = (a + b +c) / 3;
    //     System.out.println("Your average of 3 number is = " + avg);
    // }
    // public static boolean isEven(int n) {
    //     return n % 2 == 0;
    // }
    // public static void checkPalindrom(int num){
    //     int originalNum = num;
    //     int reverse = 0;
    //     while(num > 0){
    //         int lastDigit = num % 10;
    //         reverse = reverse * 10 + lastDigit; 
    //         num/=10;
    //     }
    //     if(originalNum == reverse){
    //         System.out.println(originalNum + " YES IT'S A PALINDROM");
    //     }else{
    //         System.out.println("NOT A PALINDROM");
    //     }
    // }
    public static int sumDigit(int num) {
        int sum = 1;

        while (num != 0) {
            int lastD = num % 10;
            sum += lastD;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        // avarageCal(60, 75, 3);
        // System.out.println(isEven(5));
        Scanner sc = new Scanner(System.in);
        System.out.print("Write any number to check it is Palindrom or not :");
        int num = sc.nextInt();
        // checkPalindrom(num);
        int result = sumDigit(num);
        System.out.println("Sum of digits fo " + num + " is : " + result);
    }
}
