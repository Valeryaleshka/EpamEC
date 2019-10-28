/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
        менять колесо, вывести на консоль марку автомобиля.*/

        package by.epam.classes.taskagr2;

public class Main {
    public static void main(String [] args){

        View view = new View();
        Wheel wheel = new Wheel(7);
        Engine engine = new Engine("Kawasaki");
        System.out.println(wheel.getNumbersOfWheels());
        Automobile automobile = new Automobile(wheel,engine,"Mersedes",33);

        automobile.changeWheels();
        automobile.run();
        automobile.fillUp();
        view.printBrand(automobile);

    }
}
