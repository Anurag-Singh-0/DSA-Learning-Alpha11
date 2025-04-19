import java.util.*;

public class checkLargestNo {

    public static void main(String[] args) {
        // int a = 5;
        // int marks = 55;
        // int b = 8;
        // int c = 2;

        // if (a >= b && a >= c) {
        //     System.err.println("Larget is A");
        // } else if (b >= c) {
        //     System.out.println("Larget is B");
        // } else {
        //     System.out.println("Larget is C");
        // }
        // String isPass = (marks <= 33) ? "Failed" : "Pass"; 
        // System.out.println(isPass);

        /* Switch Statement */
        Scanner sc = new Scanner(System.in);

        System.err.print("Choose any number between 1 to 12 to check the month name : ");
        int number = sc.nextInt();

        switch(number){
            case 1: System.err.println("January"); break;
            case 2: System.err.println("February"); break;
            case 3: System.err.println("March"); break;
            case 4: System.err.println("April"); break;
            case 5: System.err.println("May"); break;
            case 6: System.err.println("June"); break;
            case 7: System.err.println("July"); break;
            case 8: System.err.println("August"); break;
            case 9: System.err.println("September"); break;
            case 10: System.err.println("October"); break;
            case 11: System.err.println("November"); break;
            case 12: System.err.println("December"); break;
            default: System.err.println("Don't be so smart, type number between 1 - 12 okay!");
        }

    }
}
