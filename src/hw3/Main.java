package hw3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,6);
        System.out.println(rectangle);
        rectangle.calculateRectangleArea();
        rectangle.howManySquaresInRectangle(2);
        rectangle.setBokA(4);
        System.out.println("Po zmianie: "+rectangle);
        Rectangle rectangle1 = new Rectangle(1,2);
        Rectangle rectangle2 = new Rectangle(2,2);
        Rectangle rectangle3 = new Rectangle(3,5);
        Rectangle rectangle4 = new Rectangle(7,2);
        Rectangle rectangle5 = new Rectangle(1,1);
        System.out.println(rectangle5);
        rectangle.howManyRectangles();

        System.out.println("");

        Circle circle = new Circle(6);
        System.out.println(circle);
        circle.calculateCircleArea();
        circle.squareInCircleOrOnCircle(12,12);
        circle.setR(Math.sqrt(2));
        System.out.println("Po zmianie: "+circle);
        circle.squareInCircleOrOnCircle(2, 2);
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(1);
        Circle circle4 = new Circle(16);
        Circle circle5 = new Circle(26);
        System.out.println(circle5);
        circle.howManyCircles();
    }
}
