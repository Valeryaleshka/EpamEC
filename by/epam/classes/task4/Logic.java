package by.epam.classes.task4;

import java.util.Scanner;

public class Logic {

    public Train[] getSortedTrainsByNumber(Train [] trains){
        Train temp = new Train();
        boolean bool;
        do{
            bool = true;
            for (int i = 0; i < trains.length-1; i++) {
                if(trains[i].getTrainNumber()>trains[i+1].getTrainNumber()){
                    temp = trains[i];
                    trains[i]=trains[i+1];
                    trains[i+1]=temp;
                    bool = false;
                }
            }
        }while (!bool);

        return  trains;
    }


    public Train getTrainNumberInfo (Train [] trains) {

        Scanner scanner = new Scanner(System.in);
        View view = new View();

        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int number = scanner.nextInt();

        for (int i = 0; i < trains.length; i++) {
            if (number == trains[i].getTrainNumber()) {
                return trains[i];
            }
        }
        return new Train();
    }


    public Train[] getSortedTrainsByDestination (Train[]trains){

        Train temp = new Train();

        boolean bool;

        do{
            bool = true;
            for (int i = 0; i < trains.length-1; i++) {

                if (trains[i].getFinalDestination().compareToIgnoreCase(trains[i+1].getFinalDestination()) > 0) {
                            temp = trains[i];
                            trains[i]=trains[i+1];
                            trains[i+1]=temp;
                            bool = false;
                }

                if (trains[i].getFinalDestination().compareToIgnoreCase(trains[i+1].getFinalDestination()) == 0) {

                    if(trains[i].getDepartureTimeHrs()>trains[i+1].getDepartureTimeHrs()){
                        temp = trains[i];
                        trains[i]=trains[i+1];
                        trains[i+1]=temp;
                        bool = false;
                    }

                    if(trains[i].getDepartureTimeHrs()==trains[i+1].getDepartureTimeHrs()){
                        if(trains[i].getDepartureTimeMin()>trains[i+1].getDepartureTimeMin()){
                            temp = trains[i];
                            trains[i]=trains[i+1];
                            trains[i+1]=temp;
                            bool = false;
                        }
                    }
                }
            }
        }while (!bool);

        return trains;
    }
}
