public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    Vehicle(String name) {

        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {

        this.currentDirection +=direction;
        System.out.println("Steering at " +currentDirection+ " degree");
    }

    public void move (int speed, int directoin) {

        this.currentSpeed = speed;
        this.currentDirection = directoin;
        System.out.println("Moving at " +currentSpeed+ " in " +currentDirection+ " degree");
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int getCurrentSpeed() {

        return currentSpeed;
    }

    public int getCurrentDirection() {

        return currentDirection;
    }

    public void stop() {

        this.currentSpeed = 0;
        System.out.println("Vehicle is stopped");
    }
}