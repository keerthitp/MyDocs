public class TenMinuteWalk {
    public static void main(String[] args){

        String ret = "";
        char walk[] = {'n','s','n','s','n','s','n','s','n','s'};

        if(walk.length != 10)
            ret = "false";

        for (int i = 0; i< walk.length; i= i+4){
            if(walk[i] != walk[i+2] && walk[i+1]!= walk[i+3]){
                ret = "false";
                break;

            }

        }




    }
}