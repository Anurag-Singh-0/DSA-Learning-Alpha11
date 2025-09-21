import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.err.print("Enter your first number : ");
        int a = sc.nextInt();
        System.err.print("Enter your second number : ");
        int b = sc.nextInt();
        System.err.print("Choose your operator (+, -, *, /) : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a + b); break;
            case '-' : System.out.println(a - b); break; 
            case '*' : System.out.println(a * b); break;
            case '/' : System.out.println(a / b); break;
            default: System.out.println("Invalid Operator");
        }
    }
}
