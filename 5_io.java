import java.util.Scanner;

class IO {
    public static void main(String[] args) {
    	
        System.out.println("1.Saugat");
        System.out.println("2.Saugat");

        System.out.print("3.Saugat");
        System.out.println("4.Saugat");

        System.out.printf("4.Saugat");
        System.out.printf("4.Saugat");

        System.out.println("\nBreak");

        System.out.println("Saugat" + "Ghimire");


        Scanner input = new Scanner (System.in);
        System.out.println("Enter the integer");
        int number = input.nextInt();
        System.out.println(number);

       Scanner input2 = new Scanner(System.in);
       System.out.println("Enter the name");

       String value = input2.next();
       System.out.println(value);
       input2.close();
       input.close();



    }
}


class Str{

    public static void main(String[] args)
    {
    System.out.println("Enter your name");
    Scanner input2= new Scanner(System.in);
    String userInput = input2.nextLine();

    System.out.println("Hello"+ userInput);
    input2.close();

    }
}
