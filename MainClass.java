public class MainClass {
    public static void main(String[] args) {
        // Print "hello world" to the console
        System.out.println("hello world");

        // Create an instance of Dog
        Dog d1 = new Dog();
        d1.name ="Tommy";
        
        // Call the bark method on the Dog instance
        d1.walk();
    }
}

// Definition of the Dog class
class Dog {
    // Instance variables
    String name;
    int age;
    String color;

    // Method to simulate the dog walking
    void walk() {
        System.out.println(name + " is walking");
    }

    // Method to simulate the dog barking
    void bark() {
        System.out.println("Dog is barking");
    }
}
