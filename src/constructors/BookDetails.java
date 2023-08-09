package constructors;

import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        BookDetails defaultbookDetails = new BookDetails();
        System.out.println("Default Book Details: ");
        defaultbookDetails.display();

        BookDetails bookDetails = new BookDetails("Down and Out in Paris and London","George Orwell",1933,230);
        System.out.println("\nBook Details");
        bookDetails.display();

        System.out.println("\nUpdate Book Details");
        bookDetails.update();
        bookDetails.display();
    }
    private String title;
    private String author;
    private int yearPublished;
    private int pageCount;
    public BookDetails(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.yearPublished = 0;
        this.pageCount = 0;

    }

    public BookDetails(String title, String author, int yearPublished, int pageCount) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
    }
    public void update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Title: ");
        this.title = sc.nextLine();
        System.out.println("Enter Author: ");
        this.author = sc.nextLine();
        System.out.println("Enter Year Published: ");
        this.yearPublished = sc.nextInt();
        System.out.println("Enter Page Count: ");
        this.pageCount = sc.nextInt();

    }
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Page Count: " + pageCount);
    }
}

