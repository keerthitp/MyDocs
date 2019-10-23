import java.util.ArrayList;
import java.util.List;

class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        // your code

        List<Long> arrList = new ArrayList<>();

        for (long i = a; i<= b; i++){
            String s = String.valueOf(i);
            long sum = 0;


                int k =0;

                while (k < s.length()){
                    Double x = Double.parseDouble(String.valueOf(s.charAt(k)));
                    Double y = Double.parseDouble(String.valueOf(k+1));
                    sum += Math.pow(x, y);
                    k++;
                }

                if (sum == i)
                    arrList.add(i);

        }
        return  arrList;
    }

    public static void main(String[] args) {
        List<Long> list = sumDigPow(90,100);


        /*
        public void test() {
        System.out.println("Basic Tests");
        testing(1, 10, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        testing(1, 100, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
        testing(10, 100,  new long[] {89});
        testing(90, 100, new long[] {});
        testing(90, 150, new long[] {135});
        testing(50, 150, new long[] {89, 135});
        testing(10, 150, new long[] {89, 135});
    }
}

         */
    }
}