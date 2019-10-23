import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TwoToOne_Treeset {

    public static void main(String[] args) {

        String s1 ="aretheyhere";
        String s2 = "yestheyarehere";

        String s3 = s1 + s2, ret = "";

        Set<String> set = new TreeSet<>();
        char[] charArr = s3.toCharArray();

        for(char c: charArr)
            set.add(String.valueOf(c));

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){


            ret += iterator.next();
        }

        System.out.println("String: " + ret);

        /*
         String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

         StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();

                return (s1 + s2).chars().distinct().mapToObj(c -> String.valueOf((char)c)).sorted().collect(Collectors.joining());

 String all = "abcdefghijklmnopqrstuvwxyz";
        return all.replaceAll("[^" + s1+s2 + "]", "");


          char[] chars =  s1.toCharArray();
        TreeSet<Character> set = new TreeSet<>();

        for(char i : chars)
            set.add(i);
            s1 = "";
        for(char i : set)
            s1 += i;
            return s1;

            return Stream.of(s1.concat(s2).split(""))
                  .sorted()
                  .distinct()
                  .collect(Collectors.joining());


        * */



    }
}
