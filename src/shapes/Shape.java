package shapes;

import movable.Movable;

import java.util.Objects; //square;circle;triangle

public abstract class Shape implements Movable {//Movable (двигаемый) - это метод move
    protected int numberofsides;//количество сторон
    protected int coordinates;// координаты
    protected int proportion;//пропорция


    public Shape(int numberofsides, int coordinates, int proportion) {
        this.numberofsides = numberofsides;
        this.coordinates = coordinates;
        this.proportion = proportion;
    }

    @Override
    public void move() {// переопределил или реализовал метод интерфейса

    }

    abstract void draw();

    public int getNumberofsides() {
        return numberofsides;
    }

    public void setNumberofsides(int numberofsides) {
        this.numberofsides = numberofsides;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public int getProportion() {
        return proportion;
    }

    public void setProportion(int proportion) {
        this.proportion = proportion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (numberofsides != shape.numberofsides) return false;
        if (coordinates != shape.coordinates) return false;
        return proportion == shape.proportion;
    }

    @Override
    public int hashCode() {
        int result = numberofsides;
        result = 31 * result + coordinates;
        result = 31 * result + proportion;
        return result;
    }
}
