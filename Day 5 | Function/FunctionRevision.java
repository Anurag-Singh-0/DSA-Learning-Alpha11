import java.util.Arrays;

public class FunctionRevision {

    public static void swap(int a, int b) {
    int temp = 0;

    temp = a;
    a = b;
    b = temp;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        swap(5, 7);

    }
}