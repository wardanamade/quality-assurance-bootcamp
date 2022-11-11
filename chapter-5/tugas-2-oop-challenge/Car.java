// Create a Class Car that inherits the attributes and methods of the Vehicle.
public class Car extends Vehicle {
    // Create a private field with the name numberOfAirbags
    private int numberOfAirbags;
    // Create a private field with the name numberOfSeats
    private int numberOfSeats;
    // Create a private field with the name numberOfDoors
    private int numberOfDoors;
    // Create a private field with the name numberOfWheels
    private int numberOfWheels;
    // Create a private field with the name isAutomatic
    private boolean isAutomatic;
    // Create a private field with the name isElectric
    private boolean isElectric;
    // Create a private field with the name isRunning
    private boolean isRunning;
    // Create a private field with the name isMoving
    private boolean isMoving;
    // Create a private field with the name isStopped
    private boolean isStopped;
    // Create a private field with the name isParked
    private boolean isParked;
    // Create a private field with the name isCrashed
    private boolean isCrashed;
    // Create a private field with the name isDamaged
    private boolean isDamaged;
    // Create a private field with the name isDestroyed
    private boolean isDestroyed;
    
    // Create a constructor with the name Car
    public Car() {
        // Set the value of the field numberOfAirbags to 0
        this.numberOfAirbags = 0;
        // Set the value of the field numberOfSeats to 0
        this.numberOfSeats = 0;
        // Set the value of the field numberOfDoors to 0
        this.numberOfDoors = 0;
        // Set the value of the field numberOfWheels to 0
        this.numberOfWheels = 0;
        // Set the value of the field isAutomatic to false
        this.isAutomatic = false;
        // Set the value of the field isElectric to false
        this.isElectric = false;
        // Set the value of the field isRunning to false
        this.isRunning = false;
        // Set the value of the field isMoving to false
        this.isMoving = false;
        // Set the value of the field isStopped to false
        this.isStopped = false;
        // Set the value of the field isParked to false
        this.isParked = false;
        // Set the value of the field isCrashed to false
        this.isCrashed = false;
        // Set the value of the field isDamaged to false
        this.isDamaged = false;
        // Set the value of the field isDestroyed to false
        this.isDestroyed = false;
    }

    // Create attributes and methods in Class Car that represent a specific car.
    // Create a method with the name startEngine
    public void startEngine() {
        // Set the value of the field isRunning to true
        this.isRunning = true;
        // Set the value of the field isStopped to false
        this.isStopped = false;
        // Set the value of the field isParked to false
        this.isParked = false;
        // Set the value of the field isCrashed to false
        this.isCrashed = false;
        // Set the value of the field isDamaged to false
        this.isDamaged = false;
        // Set the value of the field isDestroyed to false
        this.isDestroyed = false;
    }
    // Create a method with the name stopEngine
    public void stopEngine() {
        // Set the value of the field isRunning to false
        this.isRunning = false;
        // Set the value of the field isStopped to true
        this.isStopped = true;
        // Set the value of the field isParked to false
        this.isParked = false;
        // Set the value of the field isCrashed to false
        this.isCrashed = false;
        // Set the value of the field isDamaged to false
        this.isDamaged = false;
        // Set the value of the field isDestroyed to false
        this.isDestroyed = false;
    }
    // Create a method with the name park
    public void park() {
        // Set the value of the field isRunning to false
        this.isRunning = false;
        // Set the value of the field isStopped to false
        this.isStopped = false;
        // Set the value of the field isParked to true
        this.isParked = true;
        // Set the value of the field isCrashed to false
        this.isCrashed = false;
        // Set the value of the field isDamaged to false
        this.isDamaged = false;
        // Set the value of the field isDestroyed to false
        this.isDestroyed = false;
    }
    // Create a method with the name crash
    public void crash() {
        // Set the value of the field isRunning to false
        this.isRunning = false;
        // Set the value of the field isStopped to false
        this.isStopped = false;
        // Set the value of the field isParked to false
        this.isParked = false;
        // Set the value of the field isCrashed to true
        this.isCrashed = true;
        // Set the value of the field isDamaged to true
        this.isDamaged = true;
        // Set the value of the field isDestroyed to false
        this.isDestroyed = false;
    }
    // Create a method with the name damage
    public void damage() {
        // Set the value of the field isRunning to false
        this.isRunning = false;
        // Set the value of the field isStopped to false
        this.isStopped = false;
        // Set the value of the field isParked to false
        this.isParked = false;
        // Set the value of the field isCrashed to false
        this.isCrashed = false;
        // Set the value of the field isDamaged to true
        this.isDamaged = true;
        // Set the value of the field isDestroyed to false
        this.isDestroyed = false;
    }
    // Create a method with the name destroy
    public void destroy() {
        // Set the value of the field isRunning to false
        this.isRunning = false;
        // Set the value of the field isStopped to false
        this.isStopped = false;
        // Set the value of the field isParked to false
        this.isParked = false;
        // Set the value of the field isCrashed to false
        this.isCrashed = false;
        // Set the value of the field isDamaged to false
        this.isDamaged = false;
        // Set the value of the field isDestroyed to true
        this.isDestroyed = true;
    }
}
