package by.epam.classes.taskagr3;

public class View {
    public void printCapital(State state){
        System.out.println(state.getCapital());
    }

    public void printAreasNumber(State state){
        System.out.println(state.getAreas().length);
    }

    public void printSquare(State state){
        System.out.println(state.getSquare());
    }

    public void printAreaCenter(State state) {
        for (Area area : state.getAreas()) {
            System.out.println("Область - " + area.getAreaName() + ", центр - " + area.getAreaCenter().getCityName());
        }
    }
}
