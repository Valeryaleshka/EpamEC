//Задача 5. Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Корректно спроектируйте и реализуйте предметную область задачи.
//• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
//• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
//• для проверки корректности переданных данных можно применить регулярные выражения.
//• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
//• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//
//        Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
//        Составляющими целого подарка являются сладости и упаковка.

package by.epam.oop.task5.main;

import by.epam.oop.task5.logic.Logic;
import by.epam.oop.task5.product.Box;
import by.epam.oop.task5.product.Present;
import by.epam.oop.task5.view.View;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Present present = new Present();
        Logic logic = new Logic();
        View view = new View();
        Box box = new Box("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите названия конфет и их количество");

        String scanner1 = scanner.nextLine();
        if(logic.isCorrectInputCandy(scanner1)){
            logic.analyzeInput(scanner1,present);
        }

        System.out.println("Введите Название упаковки");

        scanner1 = scanner.nextLine();

        if(logic.isCorrectInputBox(scanner1)){
            present.setBox(new Box(scanner1));

        }

        view.viewPresent(present);

    }
}
