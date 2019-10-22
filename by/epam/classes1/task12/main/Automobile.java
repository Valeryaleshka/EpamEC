package by.epam.classes1.task12.main;

public class Automobile {
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
            System.out.println("Поехали");
        }else
            if(!engine.isEngine()){
                System.out.println("Не можем ехать. Нету двигателя");
            }
            if(fuel<=0){
                System.out.println("Не можем ехать. Нету топлива");
            }
            if (wheel.getNumbersOfWheels()<4){
                System.out.println("Не можем ехать. Недостаточно колес");
            }

    }

    public void fillUp(){
        fuel = maxFuel;
        System.out.println("Машина заправлена до полного бака.");
    }

    public void fillUp(int i){
        if(fuel+i<maxFuel){
            fuel=+i;
            System.out.println("Машина заправлена на "+i+" литров.");
        }else {
            System.out.println("Машина заправлена до полного бака на "+(maxFuel-fuel)+" литров.");
            fuel = maxFuel;
        }
    }

    public void changeWheels(){
        if(extraWheel.getNumbersOfWheels()>0){
            extraWheel.removeWheel();
            System.out.println("Колесо заменено.");
        }else {
            System.out.println("Невозможно заменить колесо, нету запасных.");
        }
    }

    public void printBrand(){
        System.out.println(brand);
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

