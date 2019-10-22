package by.epam.classes1.task11.main;

public class Text {
    private String string = new String("");
    private StringBuilder text;
    private String title;

    public Text(){
        this.text = new StringBuilder(string);
        title = "";
    }

    public Text(StringBuilder text) {
        this.text = text;
    }

    public void setTitle(String string){
        this.title = string;
    }

    public void setText(Text textNew){
        this.text.append(textNew);
    }

    public void setText(Word textNew){
        this.text.append(textNew.getWord());
    }

    public void setText(Sentence textNew){
        this.text.append(textNew.getSentense());
    }

    public StringBuilder getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return text.toString();
    }
}

