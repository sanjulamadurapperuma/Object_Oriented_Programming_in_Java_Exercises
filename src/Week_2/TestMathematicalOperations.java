package Week_2;

public class TestMathematicalOperations {
    public static void main(String[] args) {
        double num = -15.5;

        System.out.println("The absolute value is " + MathematicalOperations.abs(num));

        //... add code to test the other methods
        System.out.println("The absolute value in integer form is " + MathematicalOperations.abs((int) num));
        System.out.println("Is the number a prime? " + MathematicalOperations.isPrime((int) num));
        System.out.println("The square root of the number is " + MathematicalOperations.sqrt(num));
        System.out.println("The log of the number is " + MathematicalOperations.log(num));
        System.out.println("The power of two of the number is " + MathematicalOperations.powerOfTwo(num));
    }
}
