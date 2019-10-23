import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
//        int i = 0, sum =0;
//        while(i < stops.size()){
//
//            int[] stop = stops.get(i);
//
//            sum+= stop[0]-stop[1];
//
//            i++;
//        }
//
//        return sum;

        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        int ppl = countPassengers(list);
        System.out.println("Passenger count at the end: "+ ppl);
    }
}