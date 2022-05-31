package day64;

import java.util.*;

public class BenimMapKeyValue {

    public static void main(String[] args) {
        Map<String,String> stuMap=new LinkedHashMap<>();
        stuMap.put("name","Jond");
        stuMap.put("lastName","Smith");
        stuMap.put("schoolName","Berkeley");
        stuMap.put("phone","123-234-7890");

        System.out.println("=========================Keyset===============================");

        Set<String> keySet=stuMap.keySet();
        System.out.println(keySet);
        System.out.println();

        //keyset+enhanced loop
        for (String key:keySet) {
            System.out.print(key + "--------" + stuMap.get(key)+"  ");
        }
            System.out.println();
        //keyset+iterator
            Iterator<String> keyIt=keySet.iterator();
            while(keyIt.hasNext()){
               String key1=keyIt.next();
               String value=stuMap.get(key1);
                System.out.print(key1+"======="+value+"   ");
            }
        System.out.println();
        System.out.println("===============================value========================");
        Collection<String> values=stuMap.values();
        System.out.println(values);
       // values+enhanced loop
        for(String value:values){
            System.out.print(value+"***********");
        }
        System.out.println();
        //values+iterator
        Iterator<String> valIt=values.iterator();
        while(valIt.hasNext()){
            String value=valIt.next();
            System.out.print(value+"------------");
        }
        System.out.println();
        System.out.println("=============================EntrySet=========================");

        Set<Map.Entry<String,String>> entrySet=stuMap.entrySet();
        // entryset+enhanced loop
        for(Map.Entry<String,String> entry:entrySet){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.print(key+"------"+value+"  ");
        }
        //entryset+iterator
        System.out.println();
        Iterator<Map.Entry<String,String>> entIt=entrySet.iterator();
        while (entIt.hasNext()){
            Map.Entry<String,String> entry=entIt.next();
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.print(key+"***********"+value+"      ");

        }



    }


    }

