package by.epam.classes1.task4.main;

public class Main {
    public static void main (String [] args){

        Logic logic = new Logic();
        Train [] trains = new Train[5];
        View view = new View();

        trains[0]=new Train("Минск",52,10,55);
        trains[1]=new Train("Минск",34,2,35);
        trains[2]=new Train("Минск",223,10,23);
        trains[3]=new Train("Минск",1,10,12);
        trains[4]=new Train("Минск",78,23,11);

        //Сортировка по номеру поезда
        /*trains = logic.sortTrainsByNumber(trains);
        //view.printTrains(trains);*/

        //Вывод информации по нужному поезду
       /*System.out.println("Введите номер поезда");
        view.printSingleTrain(logic.printTrainNumberInfo(trains));*/

       //Сортировка по пункту назначения + время
        trains = logic.sortByDestination(trains);
        view.printTrains(trains);

    }




}
