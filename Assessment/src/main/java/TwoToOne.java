import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoToOne {

    public static String longest (String s1, String s2) {

        String combined = s1 + s2;

        Map<Character,Integer> alpha = new HashMap<>();


        for(Character a ='a'; a<='z'; a++)
            alpha.put(a,0);


        for(int i=0; i< combined.length(); i++){

            Character letter = combined.charAt(i);
            alpha.put(letter,1);

        }

        String ret="";

        for (Map.Entry<Character,Integer> entry : alpha.entrySet()){
            if (entry.getValue()>0)
                ret += entry.getKey();


        }


            return ret;
        // your code
    }
}