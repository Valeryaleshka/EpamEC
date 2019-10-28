package by.epam.classes.taskagr2;

public class View {

    public void printCanRun(){
        System.out.println("Можем ехать");
    }

    public void printCantRunWithoutEngine(){
        System.out.println("Нельзя ехать без двигателя");
    }

    public void printCantRunWithoutFuel(){
        System.out.println("Нельзя ехать без топлива");
    }

    public void printCantRunWithoutWheels(){
        System.out.println("Нельзя ехать, недостаточно колес");
    }
    public void printFueledFullTank() {
        System.out.println("Машина заправлена до полного бака.");
    }

    public void printFueledFullTank(int maxFuel, int fuel) {
        System.out.println("Машина заправлена до полного бака на " + (maxFuel - fuel) + " литров.");
    }

    public void printFueledTank(int i) {
    System.out.println("Машина заправлена на "+i+" литров.");
    }

    public void printTheWheelIsChanged(){
        System.out.println("Колесо заменено");
    }

    public void printTheWheelIsNotChanged(){
        System.out.println("Колесо не заменено, нету запаски");
    }

    public void printBrand(Automobile automobile){
        System.out.println(automobile.getBrand());
    }
}
