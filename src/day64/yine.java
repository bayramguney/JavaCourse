package day64;

import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class yine {

    public static void main(String[] args) {
        int a[] = {10, 9, 8, 7, 6, 6, 5, 4, 4, 4, 3, 3, 3, 2, 2, 1};
        int count = 0, temp = -1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1] && a[i] != temp) {
                count++;
                temp = a[i];
            }
        }
        System.out.println(count);
    }






    }





