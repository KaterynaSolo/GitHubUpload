package ProjectJava;
/*
Create an array of integer values. After the array is created,
calculate the sum of all stored elements in that array.
 */
public class T2 {
    public static void main(String[] args) {
        int[][] numbers={
                {36,77,8,45},
                {54,73,21,54},
                {78,99,44,22},
                {54,85,88,6}
        };
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                sum=sum+numbers[i][j];
            }
        }
        System.out.println("Sum of all stored elements is "+sum);
    }
}
