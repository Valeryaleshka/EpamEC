package by.epam.oop.task1;

abstract public class File extends Folder{

    private String fileNameInFolder = "name";

    public String getName() {
        return fileNameInFolder;
    }

    public void setname(String name) {
        this.fileNameInFolder = name;
    }
}
