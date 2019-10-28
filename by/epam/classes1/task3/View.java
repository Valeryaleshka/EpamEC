package by.epam.classes1.task3;

public class View {
    public void printStudentNameAndGroup(Student student){
        System.out.print(student.getName()+"  "+student.getGroup()+"  ");

    }
    public void printStudentsWith9And10Marks(Student [] students){
        BooleanClass booleanClass = new BooleanClass();
        for (int i = 0; i<students.length;i++) {
            if(booleanClass.aBoolean(students[i].getMarks())){
                printStudentNameAndGroup(students[i]);
                System.out.println();
            }
        }
    }
}
