package by.epam.classes1.task3.main;

public class Student {
    private String name;
    private int group;
    private int [] marks = new int[5];

    public Student() {
        this.name = null;
        this.group = 0;
        this.marks = null;
    }

    public Student (String name, int group,int[] marks){
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int[] getMarks() {
        return marks;
    }
}
