public class FunctionOverloding {

    public static void multiply(int a, int b) {
        int res = a * b;
        System.out.println("Int Product of " + a + " & " + b + " is : " + res);
    }

    public static void multiply(float a, float b) {
        float res = a * b;
        System.out.println("Float Product of " + a + " & " + b + " is : " + res);
    }

    public static void multiply(double a, double b) {
        double res = a * b;
        System.out.println("Double Product of " + a + " & " + b + " is : " + res);
    }

    public static void main(String[] args) {
        multiply(2, 5);
        multiply(2.5, 5.5);
    }
}
