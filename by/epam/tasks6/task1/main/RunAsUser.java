package by.epam.tasks6.task1.main;

import by.epam.tasks6.task1.library.Library;
import by.epam.tasks6.task1.library.LibraryLogic;
import by.epam.tasks6.task1.mail.EmailAuthenticator;
import by.epam.tasks6.task1.mail.SendEmail;
import by.epam.tasks6.task1.user.User;
import by.epam.tasks6.task1.user.Users;
import by.epam.tasks6.task1.view.View;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class RunAsUser {
    public void runAsUser(User user, Users users, Library library) throws IOException {

        LibraryLogic libraryLogic = new LibraryLogic();
        View view = new View();
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String choice = null;

        boolean bool = false;
        do {
            System.out.println("1 - Посмотреть каталог, 2 - Поиск книг в каталоге ,3 - предложить книгу администратору, 4 выйти");

            if (scanner.hasNextInt()) {

                int choiceInt = scanner.nextInt();

                if (choiceInt > 0 && choiceInt < 5) {
                    choice = Integer.toString(choiceInt);
                    bool = true;
                }
            } else scanner.next();

        } while (!bool);


        switch (choice) {

            case ("1"):

                view.printBooks(library);
                runAsUser(user,users,library);
                break;

            //////////////////////////////////////////////////////////////////////////

            case ("2"):

                System.out.println("Что вы ищите?");
                String stringFind =scanner.next();
                if (libraryLogic.findTheBook(stringFind,library)!=null){
                    System.out.println(libraryLogic.findTheBook(stringFind,library).toString());
                }
                runAsUser(user,users,library);


                break;
///////////////////////////////

            case ("3"):

                System.out.println("Напишите о книге которую хотите предложить");
                String text = reader.readLine();

                String password = "FordEscort6";
                System.out.println("Спасибо");

                EmailAuthenticator emailAuthenticator = new EmailAuthenticator(user.geteMail(),password);
                SendEmail sendEmail = new SendEmail();
                sendEmail.sendEmailAsUser(emailAuthenticator,user,text);
                runAsUser(user,users,library);

                break;

            ///////////////////////////////
            ///////////////////////////////

            case ("4"):
                System.out.println("Выход из программы");
                break;

            ///////////////////////////////

        }
    }
}
