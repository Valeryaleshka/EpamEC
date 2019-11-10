package by.epam.oop.task4.theDragonsCave;

public class Treasure {
    private String treasureName;
    private int treasureCost;

    public Treasure(String treasureName, int treasureCost) {
        this.treasureName = treasureName;
        this.treasureCost = treasureCost;
    }

    public String getTreasureName() {
        return treasureName;
    }

    public void setTreasureName(String treasureName) {
        this.treasureName = treasureName;
    }

    public int getTreasureCost() {
        return treasureCost;
    }

    public void setTreasureCost(int treasureCost) {
        this.treasureCost = treasureCost;
    }
}
