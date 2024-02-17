package Examples;

//Check largest among three
import java.util.*;

public class seven{
    public static void main(String[] args) {

        System.out.println("Enter the numbers");
        Scanner reader = new Scanner(System.in);
        int a= reader.nextInt();
        int b= reader.nextInt();
        int c= reader.nextInt();

        if(a>b&&a>c){
            System.out.println("A is the largest");
        }
        else if(b>a&&b>c){
            System.out.println("B is the largest");
        }

        else if (a==b && b==c){
            System.out.println("All are equal");
        }
        else{
            System.out.println("C is the largest");
        }



        reader.close();
        
    }
}