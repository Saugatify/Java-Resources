//Swap the two number
package Examples;

import java.util.Scanner;

public class five {
    public static void main(String[] args){
        System.out.println("Enter the number a");
        Scanner reader = new Scanner (System.in);
        int numa = reader.nextInt();

        System.out.println("Enter the number b");
        int numb = reader.nextInt();

        System.out.println("Before swap " + numa +" "+numb);
        

        int temp = numa;
        numa=numb;
        numb= temp;


        System.out.println("After swap " + numa +" "+numb);



        

        reader.close();


    }
    
}
