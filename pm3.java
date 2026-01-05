// Parent class
class Parent {
    Parent(String name) { // Constructor with argument
        System.out.println("Parent constructor: " + name);
    }

    void display() { // Method to be overridden
        System.out.println("This is Parent class method");
    }
}

// Child class
class Child extends Parent {
    Child(String name) {
        super(name); // Call parent constructor with argument
        System.out.println("Child constructor: " + name);
    }

    void display() {
        System.out.println("This is Child class method");
    }

    void show() {
        display();        // Calls Child's method
        super.display();  // Calls Parent's method
    }
}

// Main class
public class pm3{
    public static void main(String[] args) {
        Child c = new Child("Java"); // Calls constructors
        c.show();                    // Demonstrates function overriding
    }
}
