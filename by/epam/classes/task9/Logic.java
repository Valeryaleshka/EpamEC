package by.epam.classes.task9;

public class Logic {

    public Bookshelf getAuthor(Bookshelf bookshelfNew, String string){
    Bookshelf bookshelf = new Bookshelf();

        for (int i = 0;i<bookshelfNew.getCountOfBooks();i++) {
            if(bookshelfNew.getBookByIndex(i).getAuthor().compareToIgnoreCase(string)==0){
            bookshelf.setNewBook(bookshelfNew.getBookByIndex(i));

            }
        }return bookshelf;
    }

    public Bookshelf getPublisher(Bookshelf bookshelfNew, String string){
        Bookshelf bookshelf = new Bookshelf();

        for (int i = 0;i<bookshelfNew.getCountOfBooks();i++) {
            if(bookshelfNew.getBookByIndex(i).getPublisher().compareToIgnoreCase(string)==0){
                bookshelf.setNewBook(bookshelfNew.getBookByIndex(i));

            }
        }return bookshelf;
    }

    public Bookshelf getBooksAfterYear(Bookshelf bookshelfNew, int year){

        Bookshelf bookshelf = new Bookshelf();

        for (int i = 0;i<bookshelfNew.getCountOfBooks();i++) {
            if(bookshelfNew.getBookByIndex(i).getYearOfPublished()>=year){
                bookshelf.setNewBook(bookshelfNew.getBookByIndex(i));

            }
        }return bookshelf;
    }
}
