package by.epam.classes.taskagr1;

public class Sentence {
    private String sentense;

    public Sentence(){
        sentense = "";
    }

    public Sentence(String sentense) {
        this.sentense = sentense;
    }

    public String getSentense() {
        return sentense;
    }

    public void setSentense(String sentense) {
        this.sentense = sentense;
    }
}
