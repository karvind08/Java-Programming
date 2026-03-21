class SpeedWrapperClass {
    private int speed;

    SpeedWrapperClass(int speed) {
        this.speed = speed;
    }

    public int getVehicleSpeed() {
        return speed;
    }

    public void setVehicleSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return Integer.toString(speed);
    }
}

// Testing the custom wrapper class
public class TestJavaWrapperClass {
    public static void main(String[] args) {
        SpeedWrapperClass speedValue = new SpeedWrapperClass(100);
        System.out.println(speedValue);
    }
}