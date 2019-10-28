package by.epam.classes.task5;

import java.util.Random;

public class DecimalCounter {

    private int count;
    private int maxCount = 100;
    private int minCount = 0;

    public DecimalCounter(){
        this.count = 0;
    }

    public DecimalCounter(int count) {
        if(count>=maxCount){
            this.count = 100;
        }
        if(count<=minCount){
            this.count = 0;
        }
        if (minCount<count&&count<maxCount){
            this.count=count;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }
    public void counterRandom(){
        Random random = new Random();
        this.count = random.nextInt(101);
    }

    public void  increaseCount (){
        if (this.count<maxCount) {
            this.count++;
        }
    }

    public void  increaseCount (int increaseCountBy){
        if (this.count<maxCount-increaseCountBy) {
            this.count=this.count+increaseCountBy;
        }else {
            this.count = 100;
        }
    }
    public void decreaseCount (){
        if (this.count>0){
            this.count--;
        }
    }

    public void decreaseCount (int decreaseCountBy){
        if (this.count>1+decreaseCountBy){
            this.count = this.count+decreaseCountBy;
        }
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getMinCount() {
        return minCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public void setMinCount(int minCount) {
        this.minCount = minCount;
    }
}
