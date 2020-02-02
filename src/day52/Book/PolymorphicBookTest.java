package day52.Book;

public class PolymorphicBookTest {
    public static void main(String[] args) {

        // we can refer the paper book object using
        // ---- its own type : PaperBook;
        Book b1 = new PaperBook("Java", "Akbar", 3);
        b1.displayInfo();


        Book b2 = new PaperBook("Selenium", "Vasyl", 2);
        Book b3 = new AudioBook("Agile", "Guljannat", 1.8);
        Book b4 = new PaperBook("The Kite Runner", "Khaled Hosseini", 3);
        Book b5 = new PaperBook("Lord of the Rings", "J. R. R. Tolkien", 2000);
        Book b6 = new AudioBook("Game of Thrones", "George R. R. Martin", 95.5);


    }
}