package Assignment1;


public class BooksEx {

    public static void main(String[] args) {
        // Creating book objects with different sets of information
        Book book1 = new Book("The India Story", "Bimal Jalal");
        Book book2 = new Book("A Place Called Home", "Preeti Shenoy", 2022);

        // Displaying book information
        System.out.println("Book 1: " + book1.title + " by " + book1.author);
        System.out.println("Book 2: " + book2.title + " by " + book2.author +
                " (Publication Year: " + book2.publicationYear + ")");
    }
}

class Book
{
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

}
