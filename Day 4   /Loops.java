
import java.util.Scanner;

public class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter number between 1 to n : ");
        int range = sc.nextInt();

        int sum = 0;
        int i = 1;
        // for(int i = 1; i<= range; i++){
        //     sum += i;
        // }

        while(i <= range){
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}