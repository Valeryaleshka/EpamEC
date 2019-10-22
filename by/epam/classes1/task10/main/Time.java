package by.epam.classes1.task10.main;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {

        if(hour<23&&hour>=0){
            this.hour = hour;
        }else {
            this.hour = 0;
        }


        if(min<60&&min>=0){
            this.min = min;
        }else {
            this.min = 0;
        }


        if(sec<60&&sec>=0){
            this.sec = sec;
        }else {
            this.sec = 0;
        }
    }

    public Time() {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public void setTime (int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void setHour(int hour) {
        if(hour<23&&hour>=0){
            this.hour = hour;
        }else {
            this.hour = 0;
        }
    }

    public void setMin(int min) {
        if(min<60&&min>=0){
            this.min = min;
        }else {
            this.min = 0;
        }
    }

    public void setSec(int sec) {
        if(sec<60&&sec>=0){
            this.sec = sec;
        }else {
            this.sec = 0;
        }
    }

    public void increaseSeconds (int sec){

        int tempSec = this.sec+sec;
        int tempSecMinIncrease = tempSec/60;
        this.sec = tempSec%60;

        increaseMinutes(tempSecMinIncrease);
    }

    public void increaseMinutes (int min){
        int tempMin = this.min+min;
        int tempMinHourIncrease = tempMin/60;
        this.min = tempMin%60;

        increaseHours(tempMinHourIncrease);
    }

    public void increaseHours (int hour){
        this.hour = (this.hour+hour)%24;
    }

    public void increaseTime(int hour, int min, int sec){
        increaseSeconds(sec);
        increaseMinutes(min);
        increaseHours(hour);
    }

    public void decreaseSeconds (int sec){

        int tempSec = this.sec-sec;
        int tempSecToMinDecrease;
        if(tempSec<0){
            if(tempSec%60==0){
                tempSecToMinDecrease = (Math.abs(tempSec))/60;
            }else {
                tempSecToMinDecrease = (Math.abs(tempSec))/60+1;
                this.sec = 60-(Math.abs(tempSec)%60);}
        }else{
            tempSecToMinDecrease = 0;
            this.sec = this.sec-sec;
        }

        decreaseMinutes(tempSecToMinDecrease);
    }

    public void decreaseMinutes (int min){
        int tempMin = this.min-min;
        int tempMinToHourDecrease;
        if(tempMin<0){
            if(tempMin%60==0){
                tempMinToHourDecrease = (Math.abs(tempMin))/60;
            }else {
                tempMinToHourDecrease = (60+Math.abs(tempMin))/60;
                this.min = 60-(Math.abs(tempMin)%60);}
        }else {
            tempMinToHourDecrease = 0;
            this.min = this.min-Math.abs(tempMin);
        }

        decreaseHours(tempMinToHourDecrease);
    }

    public void decreaseHours (int hour){
        int tempHour = this.hour-hour;
        if(tempHour<0){
            if(tempHour%24==0){

            }else {
                this.hour = 24-(Math.abs(tempHour)%24);}
        }else {
            this.hour = this.hour-hour;
        }
    }

    public void decreaseTime(int hour, int min, int sec){
        decreaseSeconds(sec);
        decreaseMinutes(min);
        decreaseHours(hour);

    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }
}
