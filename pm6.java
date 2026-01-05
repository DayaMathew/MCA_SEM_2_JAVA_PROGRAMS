import java.util.Scanner;

// Step 1: Create interface
interface ishape {
    void draw();
    void move();
}

// Step 2: Circle class implements ishape
class Circle implements ishape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public void move() {
        System.out.println("Moving a Circle");
    }
}

// Step 3: Rectangle class implements ishape
class Rectangle implements ishape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    public void move() {
        System.out.println("Moving a Rectangle");
    }
}

// Step 4: Main class
public class pm6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ishape s;   // Interface reference

        System.out.println("Enter 1 for Circle");
        System.out.println("Enter 2 for Rectangle");

        int choice = sc.nextInt();

        if (choice == 1) {
            s = new Circle();   // Circle object
        } else {
            s = new Rectangle();   // Rectangle object
        }

        // Runtime polymorphism
        s.draw();
        s.move();
    }
}
