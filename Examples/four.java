// Program to add two float number

package Examples;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
    System.out.println("Enter the number a");
    Scanner reader = new Scanner(System.in);
    float numa = reader.nextFloat();
    System.out.println("Enter the number a");
    float numb = reader.nextFloat();

    float sum = numa + numb;
    System.out.println("The float sum is " + sum);

    reader.close();


    
    }
    
}
