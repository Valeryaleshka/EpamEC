package by.epam.classes.task1;

public class Logic {

    public int getSum(Test1 test1){
        return test1.getX()+test1.getY();
    }

    public int getBiggerNumber(Test1 test1){
        if(test1.getX()>=test1.getY()){
            return test1.getX();
        }else {
            return test1.getY();
        }
    }
}
