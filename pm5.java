interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class pm5 {
    public static void main(String[] args) {
        Shape s;   // Interface reference

        s = new Circle();     // Points to Circle object
        s.draw();            // Calls Circle's draw()

        s = new Rectangle(); // Points to Rectangle object
        s.draw();            // Calls Rectangle's draw()
    }
}
