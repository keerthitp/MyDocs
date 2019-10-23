public class Printer {

    public static String printerError(String s) {

        char[] str = new char[s.length()];
        int i = 0, count =0;
        for(char c = 'n'; c<='z'; c++) {
            str[i++] = c;
        }

        for(i =0; i< s.length(); i++){

            for (char c: str){
                if (c == s.charAt(i))
                    count++;
            }
        }
        System.out.println("Count: "+ count);
        String ret ="";
        ret += String.valueOf(count) + "/";
        ret += String.valueOf(s.length());

    return ret;    // your code

//
//        long errs = s.chars().filter( ch -> ch > 'm').count();
//        return errs+"/"+s.length();
    }

    public static void main(String[] args) {
        String s = printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz");
        System.out.println("Returned str: "+ s);
    }

}