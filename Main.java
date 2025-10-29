import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating object
        Student student1 = new Student();
        student1.name = "Cardo Dalisay";
        student1.id = 101;
        student1.age = 26;
        student1.address = "Tanay Rizal";   
        student1.grades = null;  
      Student student2 = new Student();
        student2.name = "Diwata Pares";
        student2.id = 102;
        student2.age = 31;
        student2.address = "Pasay City";
        student2.grades = null;  


        System.out.println(student1.name);
        System.out.println(student2.name);
        //System.out.println(args[2]);
        Random r = new Random ();
        System.out.println(r.nextInt());
        


    }
}

/** Student class creates an object where it has */
class Student {
    String name;
    int id;
    int age;
    String address;
    Grades[] grades;

    void setName(String name) {
        this.name = name;
    }
}

class Grades {
    int id;
    String subject;
}
