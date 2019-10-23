public class Isogram {
    public static boolean  isIsogram(String str) {
        // ...

        if(str.equals(""))
            return true;

        char[] charArr = str.toLowerCase().toCharArray();

        for(int i = 0; i< str.length(); i++){
            for(int j=i+1; j< str.length(); j++)
                if (charArr[i] == charArr[j])
                    return false;
        }

        return true;

/*
        return str.toLowerCase()
                .chars()
                .distinct()
                .count() == str.length();*/
    }

    public static void main(String[] args) {

        System.out.println(isIsogram("Dermatoglyphics"));
    }
}