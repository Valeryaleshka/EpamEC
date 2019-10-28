/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
        и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
        методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
        Найти и вывести:
        a) список рейсов для заданного пункта назначения;
        b) список рейсов для заданного дня недели;
        c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/


package by.epam.classes.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Airport airport = new Airport();

        airport.addAirline(new Airline("Минск",1,"Boing",new Time(8,10,0),true,true,true,false,true,false,false));
        airport.addAirline(new Airline("Москва",2,"Aerobus",new Time(10,12,0),false,false,false,true,false,false,true));
        airport.addAirline(new Airline("Минск",3,"Aerobus",new Time(20,55,0),true,false,false,false,false,false,false));
        airport.addAirline(new Airline("Москва",4,"Boing",new Time(5,56,0),false,false,false,false,false,false,true));
        airport.addAirline(new Airline("Стамбул",5,"Aerobus",new Time(16,16,0),false,false,false,true,false,false,false));
        airport.addAirline(new Airline("Бандад",6,"Aerobus",new Time(16,25,0),false,true,false,false,false,true,false));
        airport.addAirline(new Airline("Франкфурт",7,"Boing",new Time(14,25,0),false,false,false,true,false,false,true));
        airport.addAirline(new Airline("Воронеж",8,"Boing",new Time(15,27,0),true,false,false,false,false,false,false));
        airport.addAirline(new Airline("Брест",9,"Boing",new Time(9,53,0),false,false,true,false,true,false,true));
        airport.addAirline(new Airline("Берлин",10,"Aerobus",new Time(2,6,0),false,true,false,true,false,false,false));
        airport.addAirline(new Airline("Берлин",11,"Aerobus",new Time(6,0,0),true,false,false,true,false,false,true));
        airport.addAirline(new Airline("Берлин",12,"Aerobus",new Time(23,0,0),true,false,true,false,true,false,false));

        View view = new View();
        Logic logic = new Logic();

        view.printAirport(airport);

        Scanner scanner = new Scanner(System.in);
        String choice = null;

        boolean bool = false;
        do{
            System.out.println("Что желаете сделать? Нажмите 1,2 или 3. q для выхода");
            System.out.println("1 - Список рейсов для заданного пункта назначения");
            System.out.println("2 - Список рейсов для заданного дня недели");
            System.out.println("3 - Список рейсов для заданного дня недели, время вылета которых больше заданного");
            System.out.println("q - Выход");

            if(scanner.hasNext("q")){
                choice = scanner.next();
                bool = true;
            }else  if(scanner.hasNextInt()){

                int choiceint = scanner.nextInt();

                if(choiceint>0 && choiceint<4) {
                    choice = Integer.toString(choiceint);
                    bool = true;
                }
            }else scanner.next();

        }while (!bool);


        switch (choice){
            case("1"):
                System.out.println("Введите пункт назначения");
                view.printAirport(logic.compareDeparture(airport,scanner.next()));
                break;
            case("2"):
                boolean bool2 = false;
                int day = 1;
                do {

                    System.out.println("Выберите день недели 1-7(пон-вс)");
                    if(scanner.hasNextInt()){
                        day = scanner.nextInt();
                        if(day>0 && day<8) {
                             bool2 = true;
                        }
                    }else scanner.next();
                }while (!bool2);

                view.printAirport(logic.selectDayOfWeek(airport, day));
                break;
            case("3"):
                boolean bool3 = false;
                int day2 = 1;
                do {

                    System.out.println("Выберите день недели 1-7(пон-вс) (время по умолчанию 10,10,9");
                    if(scanner.hasNextInt()){
                        day2 = scanner.nextInt();
                        if(day2>0 && day2<8) {
                            bool3 = true;
                        }
                    }else scanner.next();
                }while (!bool3);

                Time time = new Time(10,10,9);

                view.printAirport(logic.selectTime(logic.selectDayOfWeek(airport,day2),time));

                break;
            case("q"):
                System.out.println("Выход из программы");
                break;
        }
    }
}
