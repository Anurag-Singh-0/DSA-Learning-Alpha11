import java.util.*;

public class ArrayClass {

    // public static void update(int marks[]){
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i] = marks[i] * 2;
    //     }
    // }

    public static int linearSearch(int num[], int key){
        for (int i = 0; i < num.length; i++) {
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int marks[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 1;
        int res = linearSearch(marks, key);

        System.out.println(res);
    }
}
