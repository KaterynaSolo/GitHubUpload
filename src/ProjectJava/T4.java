package ProjectJava;
/*
Create a 2D array of integers. Develop a program which will
calculate the sum of even and odd numbers for that array.
 */
public class T4 {
    public static void main(String[] args) {
        int[][] numbers={
                {34,55,67,30},
                {43,4,56,27},
                {39,68,77,5},
                {71,43,7,80}
        };
        int sumEven=0;
        int sumOdd=0;
        for(int[]i:numbers){
            for(int j:i){
                if(j%2==0){
                    sumEven=sumEven+j;
                }else{
                    sumOdd=sumOdd+j;
                }
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
