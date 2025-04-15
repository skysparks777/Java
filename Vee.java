interface Vehicle {
    void move();
}

class Car implements Vehicle {
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike implements Vehicle {
    public void move() {
        System.out.println("Bike is moving");
    }
}

public class Vee {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.move();
        v2.move();
    }
}
