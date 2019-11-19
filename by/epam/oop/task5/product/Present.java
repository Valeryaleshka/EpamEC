package by.epam.oop.task5.product;

import java.util.Arrays;

public class Present {

    private String presentName;
    private Candy[] candies = new Candy[0];
    private Box box = new Box("Без Упаковки");

    public Present(String presentName) {
        this.presentName = presentName;
    }

    public Present() {

    }

    public void addCandies (Candy candy){
        candies = Arrays.copyOf(candies,candies.length+1);
        candies[candies.length-1]=candy;
    }

    public Candy[] getCandies() {
        return candies;
    }

    public void setCandies(Candy[] candies) {
        this.candies = candies;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public String getPresentName() {
        return presentName;
    }

    public void setPresentName(String presentName) {
        this.presentName = presentName;
    }
}
