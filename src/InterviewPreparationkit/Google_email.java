package InterviewPreparationkit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Google_email {
    private static List<String> mylist = new ArrayList<>();
    private static Map<String,Integer> myMap = new HashMap<>();

    public static void processEmail(String str){

        String local,domain;
        String[] temp = str.split("@");
        local = temp[0];
        domain = temp[1];

        if(local.contains(".")) {
            local = local.replace(".", "");

        }

        String local2;
        if(local.contains("+")) {
            local2 = local.split("\\+")[0];
            local = local2;
        }


        String processedEmail = String.format("%s@%s",local,domain);
        mylist.add(processedEmail);
    }


    public static void countGroups(){
        for(String i:mylist){
            if(myMap.containsKey(i)){
                int value = myMap.get(i);
                value++;
                myMap.put(i,value);
            }
            else{
                myMap.put(i,1);
            }
        }
    }

    public static void main(String[] args) {
        String [] L = {"ab@e.com", "ab.1@e.com", "ab+c@e.com","ab....1@e.com", "y@x.com"};
        String email;

        for(String i:L){
            processEmail(i);
            //System.out.println(i);
        }
        System.out.println(mylist);
        countGroups();
        System.out.println(myMap.size());

    }
}
