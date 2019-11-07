package by.epam.oop.task1;

import java.util.Arrays;

public class TextFilesMassive {

    private TextFile[] textFiles = new TextFile[0];

    public TextFile[] getTextFiles() {
        return textFiles;
    }


    public void createTextFile(String textFileName, String textFileFolder) {

        textFiles = Arrays.copyOf(textFiles, textFiles.length + 1);
        textFiles[textFiles.length - 1] = new TextFile();
        textFiles[textFiles.length - 1].setname(textFileName);
        textFiles[textFiles.length - 1].setFolder(textFileFolder);

    }

    public void createTextFile(TextFile textFile) {
        textFiles = Arrays.copyOf(textFiles, textFiles.length + 1);
        textFiles[textFiles.length - 1] = textFile;
    }


    public void renameFile(String newFileName, int i){
        textFiles[i].setname(newFileName);
    }


    public String toString(int i) {
        if(i<textFiles.length) {
            return "Файл - " + textFiles[i].getName() + ", Дериктория - " + textFiles[i].getFolder() + ", Cодержание - " + textFiles[i].getStringText();
        }
        return null;
    }


    public void deleteFile(int i){

        TextFile[] tempArray = new TextFile[textFiles.length-1];

        int count = 0;

        for (int j = 0; j < textFiles.length ; j++) {
            if(j!=i){
                tempArray[count] = textFiles[j];
                count++;
            }
        }

        textFiles = Arrays.copyOf(tempArray,tempArray.length);
    }

    public void appendText(int i, String addText){
        if(i<textFiles.length){
            textFiles[i].appendString(addText);
        }
    }

}