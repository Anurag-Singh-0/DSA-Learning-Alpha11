
import java.util.Scanner;


public class PrintSumOfFirstNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to find it's sum of first n natural number : ");
        int num = sc.nextInt();
        
        int sum =  0;

        for(int i = 1; i<=num; i++){
            sum = sum += i;
        }

        System.out.println("total sum : " + sum);
    }
}
