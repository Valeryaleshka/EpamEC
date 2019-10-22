package by.epam.classes1.task12.main;

public class Engine {
    private boolean engine;
    private String brand;

    public Engine(){
        this.engine = true;
        this.brand = null;
    }

    public Engine(String brand){
        this.engine = true;
        this.brand = brand;
    }

    public void removeEngine(){
        this.engine = false;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }
}
