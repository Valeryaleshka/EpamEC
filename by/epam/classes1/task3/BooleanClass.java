package by.epam.classes1.task3;

public class BooleanClass {
    public boolean aBoolean (int [] numbers){
        for (int i = 0; i < numbers.length;i++) {
            if(numbers[i]!=9&&numbers[i]!=10){
                return false;
            }
        }
        return true;
    }
}
