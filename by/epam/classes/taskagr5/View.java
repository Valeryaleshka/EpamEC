package by.epam.classes.taskagr5;

public class View {

    public void printTravelPackages(Base base){
        int count = 1;
        for (TravelPackage travelPackage:base.getTravelPackages()) {
            System.out.println(count+". "+travelPackage.toString());
            count++;
        }
    }

    public void printFood(Base base) {
        int count = 1;

        for (Food food : base.getFoods()) {
            System.out.println(count + ". " + food.getTypeOfFood());
            count++;
        }
    }

    public void printTransports(Base base) {
        int count = 1;

        for (Transport transport : base.getTransports()) {
            System.out.println(count + ". " + transport.getTransport());
            count++;
        }
    }

    public void printDurations(Base base) {
        int count = 1;

        for (Duration duration : base.getDurations()) {
            System.out.println(count + ". " + duration.getDuration());
            count++;
        }
    }

}
