package by.epam.oop.task5.logic;

import by.epam.oop.task4.theDragonsCave.treasure.Treasure;
import by.epam.oop.task5.product.Candy;
import by.epam.oop.task5.product.Present;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

    public boolean isCorrectInputCandy (String candy){
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]+\\s+\\d+");
        Matcher matcher = pattern.matcher(candy);
        while (matcher.find ()){
            return true;
        }
        return false;
    }

    public boolean isCorrectInputBox (String box){
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]+");
        Matcher matcher = pattern.matcher(box);
        while (matcher.find ()){
            return true;
        }
        return false;
    }

    public void addCandy (String string, int i, Present present){

        for (int j = 0; j < i; j++) {

            present.addCandies(new Candy(string));

        }
    }

    public void analyzeInput(String input, Present present){
        Pattern pattern = Pattern.compile("([a-zA-Zа-яА-Я]+)\\s+(\\d+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){

            int inputNumber = Integer.parseInt(matcher.group(2));
            addCandy(matcher.group(1),inputNumber,present);
        }
    }
}
