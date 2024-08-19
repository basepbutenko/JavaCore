package Transport;

public class Main implements Behavior {

    public static void main(String[] args) {
        Plane plain =new Plane( );
        System.out.println("-------PLANE----------");
        System.out.println("I CAN MOVE: " +plain.move);
        System.out.println("My speed is :" +plain.speed);
        System.out.println("Numbers of wheels: " +plain.numberOfWheels);
        System.out.println("Name: " +plain.name);

        AudiA6 audi=new AudiA6();
        System.out.println("-------CAR----------");
        System.out.println("I CAN MOVE: " +audi.move);
        System.out.println("My speed is :" +audi.speed);
        System.out.println("Numbers of wheels: " +audi.numberOfWheels);
        System.out.println("Name: " +audi.name);
        System.out.println("MaxSpeed: " + audi.maxSpeed);

        BMWX5 BMW =new BMWX5("I'm fast",250, 4, "BMW X5", 300);
        System.out.println("-------BMW X 5----------");
        System.out.println("I CAN MOVE: " +BMW.move);
        System.out.println("My speed is :" +BMW.speed);
        System.out.println("Numbers of wheels: " +BMW.numberOfWheels);
        System.out.println("Name: " +BMW.name);
        System.out.println("MaxSpeed: " + BMW.getMaxSpeed());
        System.out.println("Summ "+ BMW.sumOfDistance());

        Train train=new Train();
        System.out.println("-------TRAIN----------");
        System.out.println("I CAN MOVE: " +train.move);
        System.out.println("My speed is :" +train.speed);
        System.out.println("Numbers of wheels: " +train.numberOfWheels);
        System.out.println("Name: " +train.name);
        System.out.println("Distance: "+ Train.sumOfDistance());
        System.out.println("Max speed :" + Train.maxSpeed());





    }

    @Override
    public String move() {
        return move();
    }
    @Override
    public int speed() {
        return speed();
    }
    @Override
    public int numberOfWheels() {
        return speed();
    }
    public String name(){
        return name();
    }

    @Override
    public int maxSpeed() {
        return maxSpeed();
    }

}


