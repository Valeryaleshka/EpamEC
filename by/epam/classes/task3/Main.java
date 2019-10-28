
/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

package by.epam.classes.task3;

public class Main {
    public static void main (String [] args){

        View view = new View();

        Student [] students = new Student[10];
        students[0]=new Student("Иванов И.И.",545,new int[]{9, 10, 10, 9,9});
        students[1]=new Student("Петров П.П.",545,new int[]{5, 4, 5, 4,7});
        students[2]=new Student("Сидоров С.С",545,new int[]{5, 4, 9, 4,7});
        students[3]=new Student("Шмоков З.К",545,new int[]{10, 10, 10, 10,10});
        students[4]=new Student("Акранавич К.П",545,new int[]{5, 4, 9, 4,7});
        students[5]=new Student("Засуня К.У.",545,new int[]{5, 4, 5, 4,7});
        students[6]=new Student("Диметро А.В.",545,new int[]{5, 4, 9, 4,7});
        students[7]=new Student("Рудня А.П",545,new int[]{9, 9, 9, 9,9});
        students[8]=new Student("Завадский А.М",545,new int[]{5, 4, 5, 4,7});
        students[9]=new Student("Круня М.Ю.",545,new int[]{5, 4, 5, 4,7});

        view.printStudentsWithNeededMarks(students);

    }
}
