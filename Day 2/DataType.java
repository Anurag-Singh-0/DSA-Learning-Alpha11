import java.util.*;

public class DataType{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float PI = 3.14f;
        System.out.print("Enter a radius : ");
        float r = sc.nextFloat();

        float area = (PI * r * r);

        System.out.println("Your area of circle is : " + area);
    }
}