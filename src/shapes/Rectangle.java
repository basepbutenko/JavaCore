package shapes;

public   class Rectangle extends Shape {
    public Rectangle(int numberofsides, int coordinates, int proportion) {
        super(numberofsides, coordinates, proportion);
    }

    @Override
    void draw() {

    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "numberofsides=" + numberofsides +
                ", coordinates=" + coordinates +
                ", proportion=" + proportion +
                '}';
    }
}
