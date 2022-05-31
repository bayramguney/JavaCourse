package day62;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIntro {
    public static void main(String[] args) {


       // Collection<Integer> myNums = new HashSet<>();
        Set<Integer> myNums = new HashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println(myNums);
    }
}
