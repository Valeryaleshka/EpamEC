package by.epam.classes1.task10.main;

public class Logic {

    public Airport compareDeparture(Airport airport, String string) {

        Airport airportNew = new Airport();
        for (int i = 0; i < airport.getAirplaneLength(); i++) {
            if (airport.getAirlineIndex(i).getDestination().compareToIgnoreCase(string) == 0) {
                airportNew.addAirline(airport.getAirlineIndex(i));
            }
        }

        return airportNew;
    }

    public Airport selectDayOfWeek(Airport airport, int i) {
        Airport airportNew = new Airport();
        if (i == 1) {
            for (int j = 0; j < airport.getAirplaneLength(); j++) {
                if (airport.getAirlineIndex(j).isMonday()) {
                    airportNew.addAirline(airport.getAirlineIndex(j));
                }
            }
        }
        if (i == 2) {
            for (int j = 0; j < airport.getAirplaneLength(); j++) {
                if (airport.getAirlineIndex(j).isTuesday()) {
                    airportNew.addAirline(airport.getAirlineIndex(j));
                }
            }
        }
        if (i == 3) {
            for (int j = 0; j < airport.getAirplaneLength(); j++) {
                if (airport.getAirlineIndex(j).isWednesday()) {
                    airportNew.addAirline(airport.getAirlineIndex(j));
                }
            }
        }
        if (i == 4) {
            for (int j = 0; j < airport.getAirplaneLength(); j++) {
                if (airport.getAirlineIndex(j).isThursday()) {
                    airportNew.addAirline(airport.getAirlineIndex(j));
                }
            }
        }
        if (i == 5) {
            for (int j = 0; j < airport.getAirplaneLength(); j++) {
                if (airport.getAirlineIndex(j).isFriday()) {
                    airportNew.addAirline(airport.getAirlineIndex(j));
                }
            }
        }
        if (i == 6) {
            for (int j = 0; j < airport.getAirplaneLength(); j++) {
                if (airport.getAirlineIndex(j).isSaturday()) {
                    airportNew.addAirline(airport.getAirlineIndex(j));
                }
            }
        }
        if (i == 7) {
            for (int j = 0; j < airport.getAirplaneLength(); j++) {
                if (airport.getAirlineIndex(j).isSunday()) {
                    airportNew.addAirline(airport.getAirlineIndex(j));
                }
            }
        }
        return airportNew;
    }

    public Airport selectTime(Airport airport, Time time) {
        Airport airportNew = new Airport();
        for (int i = 0; i < airport.getAirplaneLength(); i++) {
            if (airport.getAirlineIndex(i).getTime().getHour() > time.getHour()) {
                airportNew.addAirline(airport.getAirlineIndex(i));
            }
            if (airport.getAirlineIndex(i).getTime().getHour() == time.getHour()){
                if(airport.getAirlineIndex(i).getTime().getMin()>time.getMin()){
                    airportNew.addAirline(airport.getAirlineIndex(i));
                }
                if(airport.getAirlineIndex(i).getTime().getMin()==time.getMin()){
                    if(airport.getAirlineIndex(i).getTime().getSec()>=time.getSec()){
                        airportNew.addAirline(airport.getAirlineIndex(i));
                    }
                }
            }
        }
        return airportNew;
    }
}

