package by.epam.oop.task5.product;

import java.util.Objects;

public class Box {

    String boxName = new String();

    public Box(String boxName) {
        this.boxName = boxName;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(boxName, box.boxName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boxName);
    }

    @Override
    public String toString() {
        return "Упаковка {" +
                "boxName='" + boxName + '\'' +
                '}';
    }
}
