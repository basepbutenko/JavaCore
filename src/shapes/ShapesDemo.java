package shapes;


import movable.Movable;

import java.util.ArrayList;

class ShapesDemo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();


        Shape circle = new Circle(4, 4, 5);
        shapes.add(circle);
        Shape oval = new Oval(4, 4, 5);
        shapes.add(oval);
        Shape rectangle = new Rectangle(4, 4, 4);
        shapes.add(rectangle);
        Shape square = new Square(4, 4, 4);
        shapes.add(square);// добавляем

        shapes.add(new Triangle(4, 4, 4));

        for (Shape shape : shapes) { // цикл for each, Shape - тип данных, shape - имя переменной; shapes - коллекция,
            System.out.println(shape);
        }

        Movable movable = new Oval(4,4,6);
        movable.move();
    }
}


