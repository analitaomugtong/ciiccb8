package chapter2;

public class LoopsLesson {
    public static void main(String[] args) {
        byte a = 1;
        while(a<=10)
        System.out.println("a = "+ a++);
       

        do
           System.out.println("do while :a = "+ a++);
           while (a>0); 
             System.out.println("End of program");
        
             int b = 0;
             for(;b<10; b++)
             System.out.println("b = "+b++);
             
             for (int x =1;x<10;x++){
                    for(int y=1;y<x;y++){
                        System.out.println(x);
                    }
             }
                
           
    }
    

}
