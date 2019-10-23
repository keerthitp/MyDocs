import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SongDecoder {

    public static String SongDecoder (String song)
    {
        // Your code is here...
        String replaceStr = song.replaceAll("WUB", " ");
        System.out.println("Replace string: "+ replaceStr);

        String arrStr = replaceStr.replaceAll("\\s{2,}"," ");//.split("\\s+");

        System.out.println("Replace string after regex: "+ arrStr);

        String returnStr = "";

//        for(String s: arrStr)
//            returnStr+= s + " ";

        return arrStr.trim();
// return song.replaceAll("(WUB)+", " ").trim();
//
//        song = song.replaceAll("WUB"," ");
//        return song.trim().replaceAll(" +", " ");








    }

    public static void main(String[] args) {

        String str = SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB");
        System.out.println("Printing the returned str: "+ str);
    }
}
