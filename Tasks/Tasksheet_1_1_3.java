public class Tasksheet_1_1_3 {
    public static void main(String[] args) {
    int j = 10;
    String message;

    for(int i = 1; i <= j; i++){ 
        message = (i % 2 == 0 ) ? i + " is Even number" : i + " is Odd number";
        System.out.println(message);
    }
    }
    
}
