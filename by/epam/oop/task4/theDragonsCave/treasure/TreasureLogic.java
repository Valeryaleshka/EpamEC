package by.epam.oop.task4.theDragonsCave.treasure;

import by.epam.oop.task4.theDragonsCave.TheDragonsCave;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureLogic {

    public void addTreasureFromTXT(String address, TheDragonsCave theDragonsCave) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(address), "UTF-8");
        String treasuresInString = scanner.useDelimiter("\\A").next();

        Pattern pattern = Pattern.compile("([а-яА-я]+)\\s+\\((\\d+)\\)");
        Matcher matcher = pattern.matcher(treasuresInString);

        while (matcher.find ()){
            theDragonsCave.addTreasure(new Treasure(matcher.group(1), Integer.parseInt(matcher.group(2))));
        }
    }

    public Treasure getTheMostExpensiveTreasure(TheDragonsCave theDragonsCave){
        Treasure theMostExpensiveTreasure = theDragonsCave.getTreasure(0);
        for (Treasure treasure:theDragonsCave.getTreasures()) {
            if(treasure.getTreasureCost()>theMostExpensiveTreasure.getTreasureCost()){
                theMostExpensiveTreasure = treasure;
            }
        }
        return theMostExpensiveTreasure;
    }

    public Treasure [] getTreasureTotalCost (TheDragonsCave theDragonsCave, int totalCost){

        Treasure [] treasuresForTotalCost = new Treasure[0];

        int totalCostOfTreasures = 0;
        for (Treasure treasure:theDragonsCave.getTreasures()) {
            if(totalCostOfTreasures+treasure.getTreasureCost()<=totalCost){
                treasuresForTotalCost = Arrays.copyOf(treasuresForTotalCost,treasuresForTotalCost.length+1);
                treasuresForTotalCost[treasuresForTotalCost.length-1]=treasure;
                totalCostOfTreasures+=treasure.getTreasureCost();
            }

        }
        return treasuresForTotalCost;
    }

}
