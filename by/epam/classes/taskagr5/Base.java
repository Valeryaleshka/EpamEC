package by.epam.classes.taskagr5;

import java.util.Arrays;

public class Base {

    private Duration [] durations = new Duration[0];
    private Food [] foods = new Food[0];
    private Transport [] transports = new Transport[0];
    private TravelPackage [] travelPackages = new TravelPackage[0];

    public void addDuration (Duration duration) {
        durations = Arrays.copyOf(durations, durations.length + 1);
        durations[durations.length - 1] = duration;
    }

    public void addTransport (Transport transport) {
        transports = Arrays.copyOf(transports, transports.length + 1);
        transports[transports.length - 1] = transport;
    }

    public void addFood (Food food) {
        foods = Arrays.copyOf(foods, foods.length + 1);
        foods[foods.length - 1] = food;
    }

    public void addTravelPackage (TravelPackage travelPackage) {

            travelPackages = Arrays.copyOf(travelPackages, travelPackages.length + 1);
            travelPackages[travelPackages.length - 1] = travelPackage;

    }

    public Duration[] getDurations() {
        return durations;
    }

    public void setDurations(Duration[] durations) {
        this.durations = durations;
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }

    public Transport[] getTransports() {
        return transports;
    }

    public void setTransports(Transport[] transports) {
        this.transports = transports;
    }

    public TravelPackage[] getTravelPackages() {
        return travelPackages;
    }

    public void setTravelPackages(TravelPackage[] travelPackages) {
        this.travelPackages = travelPackages;
    }

    public Duration getDurations(int i) {
        if (i<=durations.length&&i>0){
            return durations[i - 1];
        }
        return null;
    }

    public void setDurations(Duration duration,int i) {
        this.durations[i] = duration;
    }

    public Food getFoods(int i) {
        if (i<=foods.length&&i>0) {
            return foods[i - 1];
        }
        return null;
    }

    public void setFoods(Food food, int i) {
        if (i<=foods.length&&i>0) {
            foods[i] = food;
        }
    }

    public Transport getTransports(int i) {
        if (i <= transports.length && i > 0) {
            return transports[i-1];
        }
        return null;
    }

    public void setTransport(Transport transport, int i) {
        if (i<=transports.length&&i>0) {
            transports[i] = transport;
        }
    }

    public TravelPackage getTravelPackages(int i) {
        if (i<=travelPackages.length&&i>=0) {
            return travelPackages[i-1];
        }
        return null;
    }

    public void setTravelPackages(TravelPackage travelPackage, int i) {
        if (i<=foods.length&&i>0) {
            travelPackages[i] = travelPackage;
        }
    }



}
