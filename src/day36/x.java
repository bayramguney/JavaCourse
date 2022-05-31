package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class x {
    public static void main(String[] args) {
        String str="Ali okula geldi , Ayse okula geldi ama Fatma okula gelmedi .";
        String [] strarray=str.split(" ");
        List<String> list= new ArrayList<>(Arrays.asList(strarray));
        String unique = "";
        String sonuc="";
    for (int i = 0; i <list.size() ; i++) {
        int count=1;
        if(!unique.contains(list.get(i))) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            sonuc+=list.get(i)+"="+count+" ";
            unique+=list.get(i);
        }
    }
        System.out.println(sonuc);
    }

}
