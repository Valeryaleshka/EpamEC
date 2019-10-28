package by.epam.classes.task7;

public class Calculations {
    public double getSquare(double sideA, double sideB, double sideC){

        double p = (sideA+sideB+sideC)/2;
        double square = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));

        return square;
    }

    public double getPerimeter(double sideA, double sideB, double sideC){
        return sideA+sideB+sideC;
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
