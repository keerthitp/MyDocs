class Persist {
    public static int persistence(long n) {
        // your code
        String nStr = String.valueOf(n);
        char[] nStrArr = nStr.toCharArray();
        if(nStr.length() ==1 )
            return Integer.parseInt(nStr);
        int i =0, ret=1;
        while(i < nStr.length()){

           String num = Character.toString(nStr.charAt(i));
            ret *= Integer.parseInt(num);
            i++;
        }
        System.out.println("From Function(): "+ret);
        return persistence(ret);
    }

    public static void main(String[] args) {

        int number = persistence(181417);
        System.out.println(number);

    }
}