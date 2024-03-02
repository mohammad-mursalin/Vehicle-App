public class Car extends Vehicle{

    private int wheels;
    private String type;
    private int doors;
    private boolean isMannual;
    private int currentGear;
    
    Car(String name,int wheels,int doors,String type,boolean isMannual) {

        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.type = type;
        this.isMannual = isMannual;
        this.currentGear = 1;
        
    }

    public void changeGear(int newGear) {

        this.currentGear = newGear;
        System.out.println("Gear changed to : " +currentGear);
    }

    public void changeSpeed(int speed, int direction) {

        move(speed, direction);
        System.out.println("Speed changed to " +speed+ " new direction " +direction);
    }

    public int getCurrentGear() {

        return currentGear;
    }
    
}
