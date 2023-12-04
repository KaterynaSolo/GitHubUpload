package ProjectJava;
/*
Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print the even numbers only.
 */
public class T3 {
    public static void main(String[] args) {
        int[][] numbers={
                {34,55,67,30},
                {43,4,56,27},
                {39,68,77,5},
                {71,43,7,80}
        };
        for(int[] i:numbers){
            for(int j:i){
                if(j%2==0){
                    System.out.println("Even number is "+j+" ");
                }
            }
        }
    }
}
