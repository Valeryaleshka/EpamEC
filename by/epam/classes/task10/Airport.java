package by.epam.classes.task10;

import java.util.Arrays;

public class Airport {

    private Airline[] airlines;
   
    public Airport() {
        this.airlines = new Airline[0];
    }

    public void addAirline(Airline airlineNew) {

        this.airlines = Arrays.copyOf(this.airlines, this.airlines.length + 1);
        this.airlines[this.airlines.length - 1] = airlineNew;

    }

    public int getAirplaneLength(){
        return airlines.length;
    }

    public Airline getAirlineIndex(int i){
        return airlines[i];
    }
}
