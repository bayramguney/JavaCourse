package day31;

public class DailyRoutirne {
    /*
    wakeUp
    drinkCoffee
    prepareKidsFor School
    takeKidsToSchool
    goToWork
    groceryShopping
    cooking
    study
    sleep
     */
    public static void wakeUp(){
        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Woke up!");
        System.out.println("-------------------------------");
        drinkCoffee();
    }

public static void drinkCoffee(){
    System.out.println("Put coffee in your coffee machine");
    System.out.println("Pres the button to make coffee");
    System.out.println("-------------------------------");
    prepareKidsForSchool();
}
public static void prepareKidsForSchool(){
    System.out.println("Feed them");
    System.out.println("Prepare the bagbacks");
    takeKidsToSchool();
    }
    public static void takeKidsToSchool() {
        System.out.println("Send them to the school");
        System.out.println("Prepare the bagbacks");
    }

    public static void main(String[] args) {
    wakeUp();

    }
}
