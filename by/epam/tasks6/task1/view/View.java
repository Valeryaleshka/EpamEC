package by.epam.tasks6.task1.view;

import by.epam.tasks6.task1.library.Book;
import by.epam.tasks6.task1.library.Library;

public class View {
    public void printBooks(Library library){
        int i = 0;
        for (Book book:library.getBooks()) {
            System.out.println(i+" "+book.toString());
            i++;
        }
    }
}
