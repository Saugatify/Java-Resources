/*Switch case if the User Ebters 

1 -> Hello Morning
2 -> Good Afternoon
3 -> Good Evening 

Tips Pro: Might be little hard to under the part of taking input
*/



import java.util.Scanner;

class Switch {
    public static void main (String[] args){
    System.out.println("Enter the number");
    
     Scanner input = new Scanner(System.in);
     int button = input.nextInt();

     switch (button){

        case 1:
        System.out.println("Hello Morning");
        break;


        case 2:
        System.out.println("Good Afternoon");
        break;

        case 3:
        System.out.println("Good Evening");
        break;


     }
       

    input.close();
    
    }
    
}
