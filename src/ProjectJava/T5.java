package ProjectJava;
/*
Write a program to swap 2 numbers without a temporary variable?
 */
public class T5 {
    public static void main(String[] args) {
        int a=40;
        int b=50;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Before swapping:a=40 b=50");
        System.out.println("After swapping:a="+a+" b="+b);
    }
}
