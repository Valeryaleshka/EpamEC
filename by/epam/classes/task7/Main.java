/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
        площади, периметра и точки пересечения медиан.*/

        package by.epam.classes.task7;

public class Main {
    public static void main (String[]args){

        Triangle triangle = new Triangle();
        View view = new View();

        Calculations calculations = new Calculations();

        view.printSides(triangle);
        view.printMedianCrossPoints(triangle);

    }
}
