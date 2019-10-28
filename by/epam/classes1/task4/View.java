package by.epam.classes1.task4;

public class View {
    public void  printTrains (Train [] trains){
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i].getFinalDestination()+trains[i].getTrainNumber());
        }
    }


    public void printSingleTrain (Train train){
        System.out.println(train.getFinalDestination()+" " +train.getTrainNumber()+ " Время отправления "+train.getDepartureTimeHrs()+" Ч. "+train.getDepartureTimeMin()+" Мин.");
    }
}
