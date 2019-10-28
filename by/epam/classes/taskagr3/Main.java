/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры. */

package by.epam.classes.taskagr3;

public class Main {
    public static void main(String[]args) {

        View view = new View();

        State belarus = new State("BELARUS");
        City minsk = new City("Minsk");
        City slutsk = new City("Slutsk");
        District minski = new District("Minski", 1902.66);
        minski.addCity(minsk);
        minski.addCity(slutsk);
        Area minskaya = new Area("Minskaya",minsk);
        minskaya.addDistrict(minski);
        belarus.addArea(minskaya);
        belarus.setCapital(minsk);

        City homel = new City("Homel");
        District homelski = new District("Homelski", 2358.55);
        homelski.addCity(homel);
        Area homilskaya = new Area("Homelskaya",homel);
        minskaya.addDistrict(homelski);
        belarus.addArea(homilskaya);

        view.printCapital(belarus);
        view.printAreasNumber(belarus);
        view.printAreaCenter(belarus);
        view.printSquare(belarus);




    }
}
