import java.util.Random;

public class bai3 {
    public static void main(String[] args) {
        {


            Random random = new Random();




            for (int i = 0; i < 5; i++) {

                System.out.println  (isPrimeNumber(random.nextInt()));


            }
        }
    }
    public static boolean isPrimeNumber(int n) {



        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }



}
