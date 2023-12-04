package ProjectJava;
//Write a java program to find the second-largest number in the array?
public class T9 {
    public static void main(String[] args) {

        int num[] = {35,66,78,6,89,3,2,45};
        int largest = num[0];
        int secondLargest = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];

            } else if (num[i] > secondLargest) {
                secondLargest = num[i];
            }
        }
        System.out.println("Second largest number is: " + secondLargest);
    }
}
