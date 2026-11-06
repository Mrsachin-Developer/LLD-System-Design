
class Car {
    private String brand;
    private String model;
    private boolean isEngineOn;
    private int currentSpeed;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
    }

    // Common methods for all cars
    void startEngine() {
        isEngineOn = true;
        System.out.println(brand + " " + model + " : Engine started");
    }

    void stopEngine() {
        isEngineOn = false;
        currentSpeed = 0;
        System.out.println(brand + " " + model + " : Engine turned off");
    }

    void accelerate() {
        if (!isEngineOn) {
            System.out.println(brand + " " + model +
                    " : Cannot accelerate as Engine is Off");
            return;
        }

        currentSpeed += 20;

        System.out.println(brand + " " + model +
                " : Accelerating to " + currentSpeed + " km/h");
    }

    void brake() {
        currentSpeed -= 20;

        if (currentSpeed < 0) {
            currentSpeed = 0;
        }

        System.out.println(brand + " " + model +
                " : Braking. Speed is now: " + currentSpeed + " km/h");
    }

    // Getter methods for child classes
    protected String getBrand() {
        return brand;
    }

    protected String getModel() {
        return model;
    }
}

// Child class: Manual Car
class ManualCar extends Car {
    private int currentGear;

    ManualCar(String brand, String model) {
        super(brand, model);
        this.currentGear = 0;
    }

    void shiftGear(int gear) {
        currentGear = gear;

        System.out.println(getBrand() + " " + getModel() +
                " : Shifted the gear to " + currentGear);
    }
}

// Child class: Electric Car
class ElectricCar extends Car {
    private int batteryLevel;

    ElectricCar(String brand, String model) {
        super(brand, model);
        this.batteryLevel = 100;
    }

    void chargeBattery() {
        batteryLevel = 100;

        System.out.println(getBrand() + " " + getModel() +
                " : Battery is fully charged now");
    }
}

public class InnerMain {

    public static void main(String[] args) {
        ManualCar bmw = new ManualCar("BMW", "M4");

        bmw.startEngine();
        bmw.shiftGear(1);
        bmw.accelerate();
        bmw.accelerate();
        bmw.brake();
        bmw.stopEngine();
    }
}

// Access Modifiers

/*
 * PUBLIC -->> Can be accessed outside the class
 * PRIVATE -->> Can be accessed within the class
 * PROTECTED -->> Cannot be accessed outside the class like private but can Be
 * Accessed by the CHILD Classes , mostly used in Inheritance
 */