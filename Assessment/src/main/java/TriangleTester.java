public class TriangleTester {

    public static boolean isTriangle(int a, int b, int c){

        if((a+b) >c && (a+c)>b && (b+c)>a)
            return true;
        else
            return false;

        /*return a + b > c && a + c > b && c + b > a;*/
    }

    public static void main(String[] args) {

        System.out.println(isTriangle(1,2,2));
        System.out.println(isTriangle(7,2,2));
    }
}
