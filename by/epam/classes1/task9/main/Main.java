package by.epam.classes1.task9.main;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        View view = new View();
        Logic logic = new Logic();
        Book [] books = new Book[7];
        Bookshelf bookshelf = new Bookshelf();

        bookshelf.setNewBook(books[0]=new Book(1,"Исчезновение Стефани Мейлер","Жоэль Диккер","АСТ",2019,672,29,"Твердый"));
        bookshelf.setNewBook(books[1]=new Book(2,"Исчезновение Стефани Мейлер","Жоэль","bbt",2018,672,29,"Твердый"));
        bookshelf.setNewBook(books[2]=new Book(3,"Исчезновение Стефани Мейлер","Жоэль Диккер","АСТ",2017,672,29,"Твердый"));
        bookshelf.setNewBook(books[3]=new Book(4,"Исчезновение Стефани Мейлер","Жоэль","bbt",2016,672,29,"Твердый"));
        bookshelf.setNewBook(books[4]=new Book(5,"Исчезновение Стефани Мейлер","Жоэль Диккер","АСТ",2015,672,29,"Твердый"));
        bookshelf.setNewBook(books[5]=new Book(6,"Исчезновение Стефани Мейлер","Жоэль Диккер","ccr",2014,672,29,"Твердый"));


        Scanner scanner = new Scanner(System.in);
        String choice = null;

        boolean bool = false;
        do{
            System.out.println("Что желаете сделать с этим текстом? Нажмите 1,2 или 3. q для выхода");
            System.out.println("1 - Список книг заданного автора");
            System.out.println("2 - список книг, выпущенным заданым издательством");
            System.out.println("3 - свисок книг, выпущенных после заданного года");
            System.out.println("q - Выход");

            if(scanner.hasNext("q")){
                choice = scanner.next();
                bool = true;
            }else  if(scanner.hasNextInt()){

                int choiceint = scanner.nextInt();

                if(choiceint>0 && choiceint<4) {
                    choice = Integer.toString(choiceint);
                    bool = true;
                }
            }else scanner.next();

        }while (!bool);


        switch (choice){
            case("1"):
                System.out.println("Введите автора");
                view.printBookshelf(logic.getAuthor(bookshelf,scanner.next()));
                break;
            case("2"):
                System.out.println("Введите издателя");
                view.printBookshelf(logic.getPublisher(bookshelf,scanner.next()));
                break;
            case("3"):
                System.out.println("Введите год");
                view.printBookshelf(logic.getBooksAfterYear(bookshelf,scanner.nextInt()));
                break;
            case("q"):
                System.out.println("Выход из программы");
                break;
        }
    }
}
