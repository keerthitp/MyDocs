import java.util.Arrays;

public class FindIndexLeftRightEqualSum {

    public static int findEvenIndex(int[] arr) {
        // your code

        int length = arr.length;
        for (int i=0; i<arr.length; i++){
            int[] a1 = new int[i];
            int[] b1 = new int[length-1-i];

            System.arraycopy(arr,0,a1,0,i);
            System.arraycopy(arr,i+1,b1,0,length-i-1);

            int sumA1 = Arrays.stream(a1).sum();
            int sumB1 = Arrays.stream(b1).sum();

            if(sumA1 == sumB1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int index = findEvenIndex(new int[] {1,100,50,-51,1,1});
        System.out.println("Index: "+ index);
    }

}
