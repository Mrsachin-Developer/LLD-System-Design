package encapsulation;

//Encapsulation states that ::

//1.An object should contains all the behaviors and the characters in a capsule or class
//2.We should Provide DATA SECURITY using ACCESS MODIFIERs]
/*--------------------------------------------------*/

class SportsCar {
    // character
    String brand;
    String model;
    boolean isEngineOn;
    int currentGear;
    // Access Modifier
    private int currentSpeed;

    SportsCar(String b, String m) {
        this.brand = b;
        this.model = m;
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;

    }

    /// getter and setter/// Providing getter and setter does not mean it is same
    /// that we should directly access because by using getter and setter we can
    /// validate the what the user is trying to get or set ----->> provides security

    // Behaviors
    int getCurrentSpeed() {
        return this.currentSpeed;

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

    void currentSpeed() {
        System.out.println(currentSpeed);
    }

}

public class encap2 {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("BMW", "M340i");

        myCar.startEngine();
        myCar.shiftGear(5);
        // myCar.currentSpeed = 200;/// this is not allowed in encapsulation speed is
        // something we cannot directly
        // /// write like 400 or 600 so it is not following encapsulation ---> mainly
        // /// the security
        // // so to make it secure so that this character cannot be accessed by directly
        // // outside the class we use Access MOdified

        myCar.getCurrentSpeed();
    }
}
