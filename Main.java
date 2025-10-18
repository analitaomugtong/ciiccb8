public class Main {
 public static void main(String[] args) {
   //writing object
    Student student1 = new Student ();
    student1.Name = "Cardo Dalisay";
    student1.id = 101;
    student1.age = 26;
    student.address = "Tanay Rizal";
    student.grades = null;  

    System.out.println(student1.Name);
   }
}

/** Student class creates an object where it has
 * 
 */
class Student{
   String Name;
   int id;
   int age;
   String address;
   Grades [] grades;
   void setName(String Name){
      this.Name=Name;
   }

}

class Grades {
   int id;
   String subject; 
}
