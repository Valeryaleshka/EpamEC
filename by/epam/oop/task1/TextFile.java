package by.epam.oop.task1;

public class TextFile extends File {

    private StringBuilder stringBuilder = new StringBuilder();


    public void appendString (String appendString){
        stringBuilder.append(appendString);
    }

    public void deleteText (){
        stringBuilder = new StringBuilder();
    }

    public String getStringText(){
        return stringBuilder.toString();
    }




}
