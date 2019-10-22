package by.epam.classes1.task12.main;

public class Main {
    public static void main(String [] args){

        Wheel wheel = new Wheel(7);
        Engine engine = new Engine("Kawasaki");
        System.out.println(wheel.getNumbersOfWheels());
        Automobile automobile = new Automobile(wheel,engine,"Mersedes",33);

        automobile.changeWheels();
        automobile.run();
        automobile.fillUp();
        automobile.printBrand();




    }
}
