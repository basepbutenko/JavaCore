package shapes;

public class Triangle extends Shape {
    public Triangle(int numberofsides, int coordinates, int proportion) {
        super(numberofsides, coordinates, proportion);
    }

    @Override
    void draw() {

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "numberofsides=" + numberofsides +
                ", coordinates=" + coordinates +
                ", proportion=" + proportion +
                '}';
    }
}
