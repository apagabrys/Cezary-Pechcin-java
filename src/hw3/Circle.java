package hw3;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Circle {
    double r;
    private static int circlesCounter = 0;
    private static List<Circle> circlesCollection = new ArrayList<>();

    public Circle(double r) {
        circlesCounter++;
        if (circlesCounter<=5) {
            this.r=r;
            circlesCollection.add(this);
        }
    }

    public static int getCirclesCounter() {
        return circlesCounter;
    }

    public static List<Circle> getCirclesCollection() {
        return circlesCollection;
    }

    public double getR() {
        return r;
    }

    public void setR(double nowyR) {
        this.r = nowyR;
    }

    @Override
    public String toString() {
        return ("Koło o promieniu r = " + r);
    }

    public void calculateCircleArea(){
        double r2 = Math.pow(r,2);
        double circleArea = Math.PI*r2;
        System.out.println("Pole koła to = " + circleArea);
    }
    public void squareInCircleOrOnCircle(double bokA, double bokB){
        if(bokA==bokB) {
            Rectangle rectangle = new Rectangle(bokA, bokB);
            if (r == 0.5 * bokA) {
                System.out.println("To koło można wpisać w kwadrat o boku "+bokA);
            } else if (r == 0.5 * bokA * Math.sqrt(2)) {
                System.out.println("To koło można opisać na kwadracie o boku "+bokA);
            }
        }
    }
    public void howManyCircles(){
        System.out.println("Stworzono koła w liczbie: "+circlesCollection.size());
    }
}
