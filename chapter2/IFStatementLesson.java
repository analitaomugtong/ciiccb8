package chapter2;

public class IFStatementLesson {
    public static void main(String[] args) {
        int hourOfDay= 24;

        //if else
        if (hourOfDay <= 18) {
             System.out.println("Good Evening");
        }
           else if (hourOfDay<=12){
            System.out.println("Good Afternoon");
        
            }    else {
                        System.out.println("Good Morning");
                        //(boolean expression) ? T:F;
                        System.out.println((hourOfDay<=18)?"Good Evening": "Good Day");
            }
        
        
      }
}
