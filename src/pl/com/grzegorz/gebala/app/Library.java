package pl.com.grzegorz.gebala.app;

import pl.com.grzegorz.gebala.model.Book;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[1000];

        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilość stron: ");
        int pages = sc.nextInt();
        sc.nextLine();


        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
    }
}