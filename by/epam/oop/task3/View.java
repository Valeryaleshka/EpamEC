package by.epam.oop.task3;

public class View {

    public void printCalendarDayOff(Calendar calendar){
        for (Calendar.Day day:calendar.getDays()) {
            if(day.isDayOff()){
                System.out.println(day.toString());
            }
        }
    }


}
