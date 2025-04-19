import java.util.*;

public class FindLargestNum {

    public static int getLargestNum(int arr[]){
        int largest = Integer.MIN_VALUE;    //-infinity
    
        int smallest = Integer.MAX_VALUE;  // +infinity

        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i]; 
            }if(smallest > arr[i]){
                smallest = arr[i];
            }
        }

        System.out.println("Smallest value is = " + smallest);    
        return largest;         // in java we only return a single value okay 
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int res = getLargestNum(arr);    
        System.out.println("Largest value is = " + res);    
    }
}
