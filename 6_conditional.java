//Here the condition is true so the inner scope runs

import java.util.Scanner;

class conditional {
    public static void main(String[] args)    
    {
    int number =2;
    if(number>=10)
    {
        System.out.println("Number is Greater than 10");


    }
    }
}

//Here the condition is false so the outer scope runs

class conditional2 {
    public static void main(String[] args)    
    {
    int number =2;
    if(number>=10)
    {
        System.out.println("Number is Greater than 10");
    }
    System.out.println("Outside the block");

    }
}

//Java if String
// This seems to be the great feature with strings

class conditional3{
    public static void main(String[] args) {
        String language ="Java";

        if(language =="Java")
        {
            System.out.println("Condition Works");
        }
        
    }
}


// Condition with I/O

class Conditional4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the A");
         int a = sc.nextInt();

        System.out.println("Enter the B1");
        int b = sc.nextInt();

        if (a==b){
            System.out.println("Eqauls the answer");

        }

        if(a>b){
            System.out.println("A is greator");

        }

        if(b>a){
            System.out.println("B is greator");

        }

     sc.close();

    }
}





