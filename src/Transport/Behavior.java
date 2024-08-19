package Transport;

public interface Behavior {
    public String move ();
    public int speed();
    public int numberOfWheels();
    public String name();
    public int maxSpeed();
    public static int sumOfDistance(){
        return 60+60;
    }
}
