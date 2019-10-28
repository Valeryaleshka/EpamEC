package by.epam.classes.task7;

public class Triangle {

    Calculations calculate = new Calculations();

    private double sideAx;
    private double sideAy;
    private double sideBx;
    private double sideBy;
    private double sideCx;
    private double sideCy;


    public Triangle(){

        this.sideAx = 0;
        this.sideAy = 0;
        this.sideBx = 5;
        this.sideBy = 0;
        this.sideCx = 0;
        this.sideCy = 5;

    }

    public Triangle(double sideAx, double sideAy, double sideBx, double sideBy, double sideCx, double sideCy) {
        this.sideAx = sideAx;
        this.sideAy = sideAy;
        this.sideBx = sideBx;
        this.sideBy = sideBy;
        this.sideCx = sideCx;
        this.sideCy = sideCy;

    }

    public double getSideAx() {
        return sideAx;
    }

    public double getSideAy() {
        return sideAy;
    }

    public double getSideBx() {
        return sideBx;
    }

    public double getSideBy() {
        return sideBy;
    }

    public double getSideCx() {
        return sideCx;
    }

    public double getSideCy() {
        return sideCy;
    }

    public double getSideAB() {
        return calculate.getSideByPoints(sideAx,sideAy,sideBx,sideBy);
    }

    public double getSideBC() {
        return calculate.getSideByPoints(sideBx,sideBy,sideCx,sideCy);
    }

    public double getSideCA() {
        return calculate.getSideByPoints(sideCx,sideCy,sideAx,sideAy);
    }

    public double getMedianCrossX() {
        return calculate.getMedianCrossPointX(sideAx,sideBx,sideCx);
    }

    public double getMedianCrossY() {
        return calculate.getMedianCrossPointY(sideAy,sideBy,sideCy);
    }

    public double getTriangleSquare() {
        return calculate.getSquare(getSideAB(),getSideBC(),getSideCA());
    }

    public double getTrianglePerimeter() {
        return calculate.getPerimeter(getSideAB(),getSideBC(),getSideCA());
    }

    public void setSideAx(double sideAx) {
        this.sideAx = sideAx;
    }

    public void setSideAy(double sideAy) {
        this.sideAy = sideAy;
    }

    public void setSideBx(double sideBx) {
        this.sideBx = sideBx;
    }

    public void setSideBy(double sideBy) {
        this.sideBy = sideBy;
    }

    public void setSideCx(double sideCx) {
        this.sideCx = sideCx;
    }

    public void setSideCy(double sideCy) {
        this.sideCy = sideCy;
    }
}
