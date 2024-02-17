//Print Integer Entered by USer

package Examples;

import java.util.Scanner;

class two{
    public static void main(String[] args) {
        System.out.println("Enter the integer");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();

        System.out.println(number);
        
        reader.close();


    }
}