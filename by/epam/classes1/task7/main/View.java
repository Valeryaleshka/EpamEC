package by.epam.classes1.task7.main;

public class View {
    public void printSides(Triangle triangle){
        System.out.println("Сторона AB = "+triangle.getSideAB());
        System.out.println("Сторона BC = "+triangle.getSideBC());
        System.out.println("Сторона CA = "+triangle.getSideCA());
    }

    public void printPerimeter(Triangle triangle){
        System.out.println("Периметр треугольника = "+triangle.getTrianglePerimeter());
    }

    public void printSquare(Triangle triangle){
        System.out.println("Площать треугольника = "+triangle.getTriangleSquare());
    }

    public void printMedianCrossPoints(Triangle triangle){
        System.out.println("Точка пересечения медиае - "+triangle.getMedianCrossX()+";"+triangle.getMedianCrossY());
    }
}
