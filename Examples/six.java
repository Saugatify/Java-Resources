//without using temp variable swap
package Examples;

import java.util.Scanner;

public class six {
    public static void main(String[] args)
    {
        System.out.println("Enter the numb 1 ");

        Scanner reader= new Scanner(System.in);
        int numa = reader.nextInt();
        
        System.out.println("Enter the numb 2 ");
        int numb = reader.nextInt();


        numa= numa-numb;
        numb= numa+numb;
        numa=numb-numa;

        System.out.printf("After swap "+numa + " "+numb);
        



        reader.close();
    }

    
}
