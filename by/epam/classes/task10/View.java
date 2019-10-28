package by.epam.classes.task10;

public class View {

    public void printAirlane(Airline airline) {
        System.out.println(airline.toString());
    }

    public void printAirport(Airport airport) {
        for (int i = 0; i < airport.getAirplaneLength(); i++) {
            printAirlane(airport.getAirlineIndex(i));
        }
    }
}