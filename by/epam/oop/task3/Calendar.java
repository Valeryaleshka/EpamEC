/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
информацию о выходных и праздничных днях.
*/
        package by.epam.oop.task3;

import java.util.Arrays;

public class Calendar {

    Day[] days = new Day[0];

    public void addNewDay(Day day){

        days = Arrays.copyOf(days,days.length+1);
        days[days.length-1]=day;
    }


    public Day[] getDays() {
        return days;
    }

    public static class Day{

        int day;
        int month;
        int year;
        boolean dayOff;
        private StringBuilder notes = new StringBuilder();

        public Day(int day, int month, int year, boolean dayOff) {
            this.day = day;
            this.month = month;
            this.year = year;
            this.dayOff = dayOff;
        }


        public void appendNotes (String appendString){
            notes.append(appendString);
        }

        public String getNotes(){
            return notes.toString();
        }

        @Override
        public String toString() {
            return "Day{" +
                    "day=" + day +
                    ", month=" + month +
                    ", year=" + year +
                    ", dayOff=" + dayOff +
                    ", notes=" + notes +
                    '}';
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public boolean isDayOff() {
            return dayOff;
        }
    }

}
