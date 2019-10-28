package by.epam.classes1.task4;

public class Train {
    private String finalDestination;
    private int trainNumber;
    private int departureTimeHrs;
    private int departureTimeMin;

    public Train() {
        this.finalDestination = null;
        this.trainNumber = 0;
        this.departureTimeHrs = 0;
        this.departureTimeMin = 0;
    }

    public Train(String finalDestination, int trainNumber, int departureTimeHrs, int departureTimeMin) {
        this.finalDestination = finalDestination;
        this.trainNumber = trainNumber;
        if(departureTimeHrs>23||departureTimeHrs<0){
            this.departureTimeHrs = 99;
            this.departureTimeMin = 99;

        }else if(departureTimeMin>59||departureTimeMin<0){
            this.departureTimeHrs = 99;
            this.departureTimeMin = 99;
        } else {
            this.departureTimeHrs = departureTimeHrs;
            this.departureTimeMin = departureTimeMin;
        }
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getDepartureTimeHrs() {
        return departureTimeHrs;
    }

    public int getDepartureTimeMin() {
        return departureTimeMin;
    }


}
