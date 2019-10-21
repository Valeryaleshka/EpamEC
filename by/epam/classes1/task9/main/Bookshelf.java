package by.epam.classes1.task9.main;

public class Bookshelf {
    private Book [] books = new Book[10];
    private int countOfBooks = 0;

    public Bookshelf(){
    }

    public Bookshelf (Book[] booksNew) {

        if(booksNew.length==10){
            this.books = booksNew;
        }

        if(booksNew.length<10){
            for(int i = 0; i < books.length; i++){
                this.books[i]=booksNew[i];
                countOfBooks++;
            }
        }

        if(booksNew.length>10){
            for(int i = 0; i < 10; i++){
                this.books[i]=booksNew[i];
                countOfBooks++;
            }
        }
    }


    public void setNewBook (Book bookNew){
        if(countOfBooks<10){
            this.books[countOfBooks]=bookNew;
            countOfBooks++;
        }
    }

    public Book getBookByIndex (int i){
        return books[i];
    }

    public int getCountOfBooks(){
        return countOfBooks;
    }



}
