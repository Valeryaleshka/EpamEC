package by.epam.classes1.task5.main;

import java.util.Random;

public class Counter {
    private int count;
    private int maxCount = 100;
    private int minCount = 0;

    public int getCount() {
        return count;
    }

    public Counter(){
        this.count = 0;
    }

    public Counter(int count) {
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

    public void counterRandom(){
        Random random = new Random();
        this.count = random.nextInt(101);
    }

    public void  increaseCount (){
        if (this.count<maxCount) {
            this.count++;
        }
    }

    public void  increaseCount (int i){
        if (this.count<maxCount-i) {
            this.count=this.count+i;
        }else {
            this.count = 100;
        }
    }
    public void decreaseCount (){
        if (this.count>0){
            this.count--;
        }
    }

    public void decreaseCount (int i){
        if (this.count>1+i){
            this.count = this.count+i;
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
