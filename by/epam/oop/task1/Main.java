/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

package by.epam.oop.task1;

public class Main {
    public static void main (String[] args){

        TextFilesMassive textFilesMassive = new TextFilesMassive();

        textFilesMassive.createTextFile("name1","d//win");
        textFilesMassive.createTextFile("name2","d//win");
        textFilesMassive.createTextFile("name3","d//win");

        textFilesMassive.renameFile("куку",0);
        textFilesMassive.renameFile("кака",1);
        textFilesMassive.renameFile("кеке",2);


        System.out.println(textFilesMassive.toString(0));
        System.out.println(textFilesMassive.toString(1));
        System.out.println(textFilesMassive.toString(2));

        textFilesMassive.appendText(0,"Дополняем текст");
        textFilesMassive.appendText(0," и еще раз");

        System.out.println();

        textFilesMassive.deleteFile(1);

        System.out.println(textFilesMassive.toString(0));
        System.out.println(textFilesMassive.toString(1));
        System.out.println(textFilesMassive.toString(2));
    }
}


