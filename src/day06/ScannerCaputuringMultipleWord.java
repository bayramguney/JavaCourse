package day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerCaputuringMultipleWord {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.println("What is your name? ");
        String name=myScanner.next(); // it will only capture first word separated by space
        //String anotherWord=myScanner.next();
        System.out.println("What is your age? ");
        int age= myScanner.nextInt();

        System.out.println("You have entered "+name);
        //System.out.println("Another word is"+anotherWord);
        System.out.println("your age is "+age);

        String name1=myScanner.nextLine();
        System.out.println("You have entered "+name1);

        //Task 4
        System.out.println("------------------------------------------------------------");
        System.out.println("What is your name");
        String name3= myScanner.nextLine();
        System.out.println("Which city and state do you live in?");
        String cityState= myScanner.nextLine();
        System.out.println("What is your street address");
        String streetAddress= myScanner.nextLine();
        System.out.println("My Name is: "+name3+"\n"+"My Address is: "+"\n"+streetAddress+"\n"+cityState);

    }
}
