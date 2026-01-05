// HASA relationship
class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

// ISA relationship
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

// Vehicle HASA Engine
class Car extends Vehicle {
    Engine engine = new Engine(); // HASA

    void drive() {
        engine.start();
        move();
        System.out.println("Car is driving");
    }
}

public class pm1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
