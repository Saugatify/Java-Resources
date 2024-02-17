/*Working inside the folder the package to include is important
  making sure that the import utility is used in the java for the scanner
  one, many other can be used in the upcoming examples.
 */


package Examples;
import java.util.Scanner;

public class three {

    public static void main(String[] args) {
        System.out.println("Enter the a");
        Scanner reader = new Scanner(System.in);
        int numa = reader.nextInt();
        System.out.println("Enter the B");
        int numb= reader.nextInt();

        int sum = numa + numb;

        System.out.println("The sum is " + sum);

        reader.close();
    }
    
}
