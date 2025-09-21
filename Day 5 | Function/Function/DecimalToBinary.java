
import java.util.Scanner;


public class DecimalToBinary {

    public static void DeciToBin(int num) {
        int myNum = num;
       
        int binaryNum = 0;
        int pow = 0;

        while (num > 0) {
            int rem = num % 2;
            binaryNum = binaryNum + (rem * (int) Math.pow(10, pow));
            pow++;

            num = num / 2;
        }

        System.out.println("Binary of " + myNum + " = " + binaryNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to convert Decimal number to binary : ");
        int num = sc.nextInt();
        DeciToBin(num);
    }
}
