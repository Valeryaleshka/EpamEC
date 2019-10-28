package by.epam.classes.task3;

public class Logic {
    public boolean isMarks (int [] numbers){
        for (int i = 0; i < numbers.length;i++) {
            if(numbers[i]!=9&&numbers[i]!=10){
                return false;
            }
        }
        return true;
    }
}
