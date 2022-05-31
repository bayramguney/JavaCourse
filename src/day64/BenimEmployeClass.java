package day64;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BenimEmployeClass {
      public static void main(String[] args) {
          Map<String,employeeClass> emps=new TreeMap<>();
          emps.put("TECH102",new employeeClass("hakan","vanli",34,50000));
          emps.put("ACC221",new employeeClass("sanem","gun",45,60000));
          emps.put("DEV234",new employeeClass("baran","ney",30,70000));
          emps.put("SALE345",new employeeClass("can","tan",26,80000));

          Set<String>empkey=emps.keySet();
          for (String emp:empkey) {
              System.out.println("empId is "+emp);
              emps.get(emp).employeeDetail();
          }
          System.out.println("-------------------");
          Collection<employeeClass> emps1=emps.values();
          for (employeeClass emp:emps1) {
              emp.employeeDetail();
          }
          System.out.println("----------------------");
          Set<Map.Entry<String,employeeClass>> emps2=emps.entrySet();

          for (Map.Entry<String,employeeClass> emp:emps2){
              System.out.println("empId is "+emp.getKey());
              emp.getValue().employeeDetail();
          }
      }
}
    class employeeClass  {
        String name, lastname;
        int age, salary;

        public employeeClass(String name, String lastname, int age, int salary) {
            this.name = name;
            this.lastname = lastname;
            this.age = age;
            this.salary = salary;
        }
        public void employeeDetail() {
            System.out.println("BenimEmployeClass{" +
                    "name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}' );
        }

    }