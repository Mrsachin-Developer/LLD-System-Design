/**
 * abstaraction2
 */

abstract class Car {
    abstract void startEngine();

    abstract void shiftGear(int gear);

    abstract void brake();

}

class SportsCar extends Car {

    String brand;
    String model;
    boolean isEngineOn;
    int currentSpeed;
    int currentGear;

    SportsCar(String b, String m) {
        this.brand = b;
        this.model = m;
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;

    }

    void startEngine() {
        isEngineOn = true;
        System.out.println("Engine Started");
    }

    void shiftGear(int gear) {
        System.out.println("GearShifted to" + gear);

    }

    void brake() {
        System.out.println("Car Stopped");
    }

}

public class abstaraction2 {

    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("BMW", "M340i");

        myCar.startEngine();
        myCar.shiftGear(5);
    }
}

/// we does not required to know how gear is shifting ---> This is Abstraction