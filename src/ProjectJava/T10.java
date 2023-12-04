package ProjectJava;
//Write a program to print out duplicate elements from an Array of Strings?
public class T10 {
    public static void main(String[] args) {
        String [] elements={"Apple","Pear","Banana","Grapes","Banana","Banana"};

        for (int i = 0; i < elements.length; i++) {
            if(elements[i].equals("Banana")){
                System.out.println("Duplicate elements from the Array are: "+ elements[i]);
            }
        }
    }
}
