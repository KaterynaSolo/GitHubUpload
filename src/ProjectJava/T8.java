package ProjectJava;

import java.util.Scanner;

//Maximum and minimum number in the array?
public class T8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();

        int [] array = new int[size];
        int max = array[0];
        int min = array[0];

        for(int i = 0; i<size; i++){

            System.out.print("Enter a number: ");
            array[i] = sc.nextInt();

            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.print("The maximum number is:" + max);
        System.out.println();
        System.out.print("The minimum number is: " + min);
    }
}
