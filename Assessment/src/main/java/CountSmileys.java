import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class CountSmileys {


    public static int countSmileys(List<String> arr) {
        // Just Smile :)

        Boolean bool;
        int count = 0;
        for(String str: arr){

            if(str.matches("[:;]{1}[-~]{0,1}[)D]{1}"))
                count++;

        }

        return count;

//        return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();

    }
    public static void main(String[] args) {

        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        System.out.println("Count: "+ countSmileys(a));

    }
}
