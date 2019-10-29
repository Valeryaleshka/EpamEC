package by.epam.classes.taskagr5;

public class TravelPackage {

    private String name;
    private String destination;
    private Duration duration;
    private Food food;
    private Transport transport;

    public TravelPackage(){
        this.name = "";
        this.destination = "";
        this.duration = null;
        this.food = null;
        this.transport = null;
    }

    public TravelPackage(String name, String destination, Duration duration, Food food, Transport transport) {
        this.name = name;
        this.destination = destination;
        this.duration = duration;
        this.food = food;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Пакет " + name +
                ", Пункт - " + destination +
                ", Продолжительность - " + duration.toString()  +
                ", Еда - " + food.getTypeOfFood() +
                ", Транспорт - " + transport.getTransport();
    }
}
