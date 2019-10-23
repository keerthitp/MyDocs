import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupDsAndBs {

    public static void main(String[] args) {

        List<String> stringsList = new ArrayList<>();
        stringsList.add("Dog");
        stringsList.add("hello");
        stringsList.add("dodge");
        stringsList.add("Batman");
        stringsList.add("Bumper");
        stringsList.add("brown");
        stringsList.add("Danny");

        List<String> upperDs;
        List<String> upperBs;

        upperDs = stringsList.stream().filter(string -> string.charAt(0) == 'D').collect(Collectors.toList());

        upperDs = stringsList.stream().filter((
                s -> s.startsWith("D") || s.startsWith("B")
                )).collect(Collectors.toList());

        upperBs = stringsList.stream().filter(string -> string.charAt(0) == 'B').collect(Collectors.toList());

        System.out.println("Strings that start with D's");
        for (String s : upperDs)
            System.out.println(s);


        System.out. println("Strings that start with B's");
        for (String s : upperBs) {
            System.out.println(s);
        }


    }
}
