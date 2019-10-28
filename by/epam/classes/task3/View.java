package by.epam.classes.task3;

public class View {

    public void printStudentNameAndGroup(Student student){

        System.out.print(student.getName()+"  "+student.getGroup()+"  ");

    }

    public void printStudentsWithNeededMarks(Student [] students){

        Logic logic = new Logic();

        for (int i = 0; i<students.length;i++) {
            if(logic.isMarks(students[i].getMarks())){
                printStudentNameAndGroup(students[i]);
                System.out.println();
            }
        }
    }
}
