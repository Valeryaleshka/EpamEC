package by.epam.classes1.task7.main;

public class Main {
    public static void main (String[]args){
        Triangle triangle = new Triangle();
        View view = new View();
        Calculations calculations = new Calculations();


        view.printSides(triangle);
        view.printMedianCrossPoints(triangle);


    }
}
