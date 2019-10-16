package by.epam.classes1.task7.main;

public class Calculations {
    public double getSquare(double a, double b, double c){

        double p = (a+b+c)/2;
        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return square;
    }

    public double getPerimeter(double a, double b, double c){
        return a+b+c;
    }

    public double getSideByPoints(double ax,double ay, double bx, double by){

        return Math.sqrt(Math.pow((bx-ax),2)+Math.pow((by-ay),2));

    }

    public double getMedianCrossPointX (double sideAx, double sideBx, double sideCx){
        return (sideAx+sideBx+sideCx)/3;
    }

    public double getMedianCrossPointY (double sideAy, double sideBy, double sideCy){
        return (sideAy+sideBy+sideCy)/3;
    }
}
