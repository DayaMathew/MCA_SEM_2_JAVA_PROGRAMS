class Parent {
    // final method cannot be overridden
    final void display() {
        System.out.println("This is a final method in Parent class");
    }
}

class Child extends Parent {
    /*
    // This will cause a compile-time error
    void display() {
        System.out.println("Trying to override final method");
    }
    */
}

public class pm2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();  // Calls Parent's final method
    }
}
