package hw3;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {
    private double bokA;
    private double bokB;
    private double x;
    private static int rectanglesCounter = 0;
    private static List<Rectangle> rectanglesCollection = new ArrayList<>();

    public Rectangle(double bokA, double bokB) {
        rectanglesCounter++;
        if(rectanglesCounter <=5) {
            this.bokA = bokA;
            this.bokB = bokB;
            rectanglesCollection.add(this);
        }
    }
    public static List<Rectangle> getSquaresCollection() {
        return rectanglesCollection;
    }

    public static int getRectanglesCounter() {
        return rectanglesCounter;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double nowyBokA) {
        this.bokA = nowyBokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double nowyBokB) {
        this.bokB = nowyBokB;
    }

    @Override
    public String toString() {
        return ("Prostokąt o boku a = " + bokA + " i boku b = " + bokB);
    }

    public void calculateRectangleArea(){
        double rectangleArea = bokA * bokB;
        System.out.println("Pole prostokąta = " + rectangleArea);
    }

    public void howManySquaresInRectangle(double x) {
        double squareArea = x*x;
        double rectangleArea = bokA * bokB;
        int quantity = (int)rectangleArea/(int)squareArea;
        System.out.println("W tym prostokącie zmieści się kwadrat o boku "+ x +" w ilosci: "+quantity);
    }

    public void howManyRectangles() {
        System.out.println("Stworzono prostokąty w liczbie: " + Rectangle.rectanglesCollection.size());
    }
}
