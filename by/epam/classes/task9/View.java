package by.epam.classes.task9;

public class View {

    public void printBook(Book book){
    System.out.println(book.toString());
    }
    
    public void printBookshelf(Bookshelf bookshelfNew){
        for (int i = 0; i<bookshelfNew.getCountOfBooks();i++) {
            System.out.println(bookshelfNew.getBookByIndex(i));
        }
    }
}
