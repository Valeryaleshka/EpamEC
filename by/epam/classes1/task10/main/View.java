package by.epam.classes1.task10.main;

public class View {

    public void printAirlane(Airline airline) {
        System.out.println(airline.toString());
    }

    public void printAirport(Airport airport) {
        for (int i = 0; i < airport.getAirplaneLength(); i++) {
            System.out.println(airport.getAirlineIndex(i));
        }
    }
}