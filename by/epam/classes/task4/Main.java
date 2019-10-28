/*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/

package by.epam.classes.task4;

public class Main {
    public static void main (String [] args){

        Logic logic = new Logic();
        Train [] trains = new Train[5];
        View view = new View();

        trains[0]=new Train("Минск",52,10,55);
        trains[1]=new Train("Баку",34,2,35);
        trains[2]=new Train("Киев",223,10,23);
        trains[3]=new Train("Москва",1,10,12);
        trains[4]=new Train("Ямамото",78,23,11);

        //Сортировка по номеру поезда
        trains = logic.getSortedTrainsByNumber(trains);
        view.printTrains(trains);

        //Вывод информации по нужному поезду
        System.out.println("Введите номер поезда");
        view.printSingleTrain(logic.getTrainNumberInfo(trains));

       //Сортировка по пункту назначения + время
        trains = logic.getSortedTrainsByDestination(trains);
        view.printTrains(trains);
    }
}
