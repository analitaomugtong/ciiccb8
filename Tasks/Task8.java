public class Task8 {

 
    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int n : numbers) {
            int cumulative = 0;

            for (int i = 1; i <= n; i++) {
                cumulative += i;
            }

            System.out.println("Cumulative sum up to " + n + " = " + cumulative);
            totalSum += cumulative;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int result = cumulativeSum(4, 5, 10);
        System.out.println("Total sum of all cumulative results = " + result);
    }
}
