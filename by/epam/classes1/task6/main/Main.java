package by.epam.classes1.task6.main;

public class Main {
    public static void main (String [] args){
        Time time = new Time();
        View view = new View();

        time.decreaseTime(5,60,62);
        time.increaseTime(5,60,62);

        view.printTime(time);
    }
}
