package shapes;

public class Oval extends Shape {
    public Oval(int numberofsides, int coordinates, int proportion) {
        super(numberofsides, coordinates, proportion);
    }
    @Override
    void draw() {

        System.out.println("by oval");
    }

    @Override
    public String toString() {
        return "Oval{" +
                "numberofsides=" + numberofsides +
                ", coordinates=" + coordinates +
                ", proportion=" + proportion +
                '}';
    }
}
