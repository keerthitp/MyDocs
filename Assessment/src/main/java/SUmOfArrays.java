import java.util.ArrayList;
import java.util.Arrays;

public class SUmOfArrays {

    public static void main(String[] args) {

        int arr[] = {23,23,23,20};
        int sum =0;

//        for(int i =0; i< arr.length; i++)
//            sum+= arr[i];


//        for( int i: arr)
//            sum+= i;

    sum = Arrays.stream(arr).sum();


        System.out.println("Array sum: " + sum);

    }
}
