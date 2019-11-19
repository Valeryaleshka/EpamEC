package by.epam.oop.task5.view;

import by.epam.oop.task5.product.Candy;
import by.epam.oop.task5.product.Present;

public class View {

    public void viewPresent(Present present){

        System.out.println("Подарок - "+present.getPresentName());
        System.out.println("Упаковка - " + present.getBox());

        for (Candy candy:present.getCandies()) {
            System.out.println(candy.getCandyName());

        }
    }
}
