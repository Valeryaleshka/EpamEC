/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
        консоль текст, заголовок текста.*/

package by.epam.classes.taskagr1;

public class Main {
    public static void main(String [] args){

    Text text = new Text();
    Word word = new Word();
    Sentence sentence = new Sentence();

    word.setWord("Hello ");
    sentence.setSentense("world!");

    text.setTitle("Number 1");
    text.setText(word);
    text.setText(sentence);

    text.printText();
    }
}
