package by.epam.oop.task4.theDragonsCave;

import by.epam.oop.task4.theDragonsCave.treasure.Treasure;

import java.util.Arrays;

public class TheDragonsCave {

    private Treasure[] treasures = new Treasure[0];

    public void addTreasure(Treasure treasure){
        treasures = Arrays.copyOf(treasures,treasures.length+1);
        treasures[treasures.length-1]=treasure;
    }

    public Treasure[] getTreasures() {
        return treasures;
    }

    public Treasure getTreasure(int i){
        return treasures[i];
    }
}
