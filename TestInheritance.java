
// Base class
class Creature {
    void consume() {
        System.out.println("This creature consumes food.");
    }
}

// Derived class that extends Creature
class Puppy extends Creature {
    void sound() {
        System.out.println("The puppy makes a sound.");
    }
}

public class TestInheritanceModified {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.consume();  // Method inherited from Creature class
        myPuppy.sound();    // Method from Puppy class
    }
}
