package by.epam.oop.task5.product;

import java.util.Objects;

public class Candy {

    private String candyName;

    public Candy(String candyName) {
        this.candyName = candyName;
    }

    public String getCandyName() {
        return candyName;
    }

    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return Objects.equals(candyName, candy.candyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candyName);
    }


}
