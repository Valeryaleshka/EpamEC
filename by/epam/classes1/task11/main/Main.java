package by.epam.classes1.task11.main;

public class Main {
    public static void main(String [] args){
    Text text = new Text();
    View view = new View();
    Word word = new Word();
    Sentence sentence = new Sentence();

    word.setWord("Hello ");
    sentence.setSentense("world!");

    text.setTitle("Number 1");
    text.setText(word);
    text.setText(sentence);

    view.printText(text);
    }
}
