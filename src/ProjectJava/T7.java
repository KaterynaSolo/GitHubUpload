package ProjectJava;

//Write a Java Program to print the first 10 numbers of Fibonacci series.

public class T7 {
    public static void main(String[] args) {

        int count = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of first "+count+" numbers:");
        for (int i = 1; i <= count; i++) {
            System.out.print(previousNumber+" ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
