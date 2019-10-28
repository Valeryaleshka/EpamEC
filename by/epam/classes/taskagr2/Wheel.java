package by.epam.classes.taskagr2;

public class Wheel {

    private int wheel;

    public Wheel(){
        wheel = 1;
    }

    public Wheel(int i){
        if(i>0){
            wheel = i;}
    }

    public void removeWheel(){
        if(wheel>0){
            wheel--;
        }
    }

    public void addWheel(int i){
        wheel = +i;
    }
    
    public void addWheel(){
        wheel++;
    }

    public int getNumbersOfWheels(){
        return wheel;
    }

    public void setWheel(int i){
        wheel = i;
    }
}
