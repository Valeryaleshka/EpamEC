package by.epam.classes.taskagr2;

public class Automobile {

    View view = new View();

    private Wheel wheel;
    private Wheel extraWheel;
    private Engine engine;
    private String brand;
    private int fuel;
    private int maxFuel = 100;

    public Automobile(Wheel wheelNew, Engine engine, String brand, int fuel) {


        this.engine = engine;
        this.brand = brand;
        this.fuel = fuel;
        this.wheel = wheelNew;

        if(wheelNew.getNumbersOfWheels()>4){
            this.wheel = new Wheel(4);
            this.extraWheel = new Wheel(wheelNew.getNumbersOfWheels()-4);
        }
        if(wheelNew.getNumbersOfWheels()<=4){
            this.wheel = new Wheel(wheelNew.getNumbersOfWheels());
            this.extraWheel = new Wheel(0);
        }
    }

    public void run(){
        if(engine.isEngine()&&fuel>0&&wheel.getNumbersOfWheels()==4){
            view.printCanRun();
        }else
            if(!engine.isEngine()){
                view.printCantRunWithoutEngine();
            }
            if(fuel<=0){
                view.printCantRunWithoutFuel();
            }
            if (wheel.getNumbersOfWheels()<4){
                view.printCantRunWithoutWheels();
            }

    }

    public void fillUp(){
        fuel = maxFuel;
        view.printFueledFullTank();
    }

    public void fillUp(int i){
        if(fuel+i<maxFuel){
            fuel+=i;
            view.printFueledTank(i);
        }else {
            view.printFueledFullTank(maxFuel,fuel);
            fuel = maxFuel;
        }
    }

    public void changeWheels(){
        if(extraWheel.getNumbersOfWheels()>0){
            extraWheel.removeWheel();
            view.printTheWheelIsChanged();
        }else {
            view.printTheWheelIsNotChanged();
        }
    }



    public int getWheelNumber(){
        return wheel.getNumbersOfWheels();

    }
    public int getExtraWheelNumber(){
        return extraWheel.getNumbersOfWheels();

    }
    public String getBrand() {
        return brand;
    }

    public int getFuel() {
        return fuel;
    }
}

