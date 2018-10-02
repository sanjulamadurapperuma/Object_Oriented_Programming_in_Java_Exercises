package Week_2;

public class MathematicalOperations {
    public static int abs(int x){
        return Math.abs(x);
    }

    public static double abs(double x){
        return Math.abs(x);
    }

    public static boolean isPrime(int N){
        //Check if n is a multiple of 2
        if(N%2==0) {
            return false;
        }
        //if not check the odds
        for(int i = 3; i*i <= N; i += 2){
            if (N % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double sqrt(double x){
        return Math.sqrt(x);
    }

    public static double log(double x){
        return Math.log(x);
    }

    public static double powerOfTwo(double x){
        return Math.pow(2, x);
    }
}
