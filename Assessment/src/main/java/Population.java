public class Population {

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code

        double total = p0;
        int years = 0;

        while(total < p){

            years++;
            total = total + (total*percent/100) +aug;

            System.out.println("At the end of "+ years+ " year: " + total);

        }

        return years;
    }

    public static void main(String[] args) {

        int years = nbYear(1500000, 0.25, 1000, 2000000);
        System.out.println("Years: " + years);
    }


}
