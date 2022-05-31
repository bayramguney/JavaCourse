package replit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

class unitTest{

    public static void main(String[] args) {
        Assert.assertEquals(aa.findLongest("testing is testing bettter"),
                new LinkedHashSet<>(Arrays.asList("testing","bettter")));

        Assert.assertEquals(aa.findLongest(""),
                new LinkedHashSet<>(Arrays.asList("")));

        Assert.assertEquals(aa.findLongest("testing is good"),
                new LinkedHashSet<>(Arrays.asList("testing")));
    }
}
public class aa {
    public static Set<String> findLongest(String string) {
        String str = string.replaceAll("[,.:?!]", "");

        String[] list = str.split(" ");
        Set<String> result = new LinkedHashSet<>();
        String longest = "";
        int size = 0;

        for (String each : list) {
            if (each.length() > longest.length()) {
                longest = each;
                size = longest.length();
            }
        }
        for (String each : list) {
            if (each.length() == size) {
                result.add(each);
            }
        }
        return result;
    }
}