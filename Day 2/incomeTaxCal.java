
import java.util.*;

public class incomeTaxCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter your income : ");
        int income = sc.nextInt();
        int tax; // Java is autometically assign 0 Zero to this variable

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }

        System.err.println("Your tax is : " + tax);
    }

}
