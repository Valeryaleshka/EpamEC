package by.epam.classes.taskagr5;

public class Duration {

    private int duration;

    public Duration(int days) {
        this.duration = days;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String toString(){
        return Integer.toString(duration);
    }
}
