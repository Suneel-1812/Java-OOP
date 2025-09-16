
// Base class
class Transport {
    void move() {
        System.out.println("Transport is in motion.");
    }
}

// Derived class overriding the method
class Bike extends Transport {
    @Override
    void move() {
        System.out.println("Bike is moving on the street.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.move(); // Calls the overridden method in Bike class
    }
}
