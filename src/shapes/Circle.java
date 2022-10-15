package shapes;

public class Circle extends Oval {
    public Circle(int numberofsides, int coordinates, int proportion) {
        super(numberofsides, coordinates, proportion);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("by circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "numberofsides=" + numberofsides +
                ", coordinates=" + coordinates +
                ", proportion=" + proportion +
                '}';
    }
}

