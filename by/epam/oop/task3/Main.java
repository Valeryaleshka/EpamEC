/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях*/

package by.epam.oop.task3;

public class Main {
    public static void main (String[]args){

        Calendar calendar = new Calendar();

        calendar.addNewDay(new Calendar.Day(5,3,2019,true));
        calendar.addNewDay(new Calendar.Day(7,2,2019,true));
        calendar.addNewDay(new Calendar.Day(20,1,2019,true));
        calendar.addNewDay(new Calendar.Day(13,3,2019,true));

        View view = new View();
        view.printCalendarDayOff(calendar);
    }
}
