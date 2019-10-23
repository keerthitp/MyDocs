import java.util.ArrayList;
import java.util.List;

public class UserInput {

    public static class TextInput {

        List<Character> arrList = new ArrayList<>();
        public  void add(char c){
            arrList.add(c);
        }

        public String getValue(){
            String a="";
            for (char c: arrList){
                a = a+ String.valueOf(c);
            }
            return a;
        }
    }

    public static class NumericInput extends TextInput {

        public  void add(char c){

            if(Character.isDigit(c))
                arrList.add(c);
        }

        public String getValue(){
            String a="";
            for (char c: arrList){
                a = a+ String.valueOf(c);
            }
            return a;
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}