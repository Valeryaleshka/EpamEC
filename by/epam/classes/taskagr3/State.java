package by.epam.classes.taskagr3;

import java.util.Arrays;

public class State {
    private String stateName;
    private Area [] areas = new Area[0];
    private City capital;
    private double stateSquare = getSquare();

    public State(String stateName){
        this.stateName = stateName;
    }

    public double getSquare(){

        double square = 0;

        for (Area area:areas) {
         square+=area.getSquare();
        }
        
        return square;
    }

    public void addArea(Area area) {
        this.areas = Arrays.copyOf(this.areas, this.areas.length + 1);
        this.areas[areas.length - 1] = area;
    }
    public void setCapital(City capital){
        this.capital = capital;
    }

    public void printCapital(){
        System.out.println(capital.getCityName());
    }

    public void printAreasNumber(){
        System.out.println(areas.length);
    }

    public void printSquare(){
        System.out.println(getSquare());
    }

    public void printAreaCenter(){
        for (Area area:areas) {
            System.out.println("Область - "+area.getAreaName()+", центр - "+area.getAreaCenter().getCityName());
        }
    }
}

