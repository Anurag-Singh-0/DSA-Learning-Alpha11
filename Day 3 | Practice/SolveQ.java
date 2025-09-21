
import java.util.Scanner;

public class SolveQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any number to check it Positive or Negative : ");
        // int num = sc.nextInt();

        // if (num < 0) {
        //     System.out.println("Negitive");
        // } else {
        //     System.out.println("Positive");
        // }
        // double temp = 80;
        // if (temp >= 100){
        //     System.out.println("You have fever");
        // }else{
        //     System.out.println("You don't have fever");
        // }

        /* Check year is leap year or not */
        System.out.print("Enter a year to check, year is leap year or not : ");
        int year = sc.nextInt();

        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
