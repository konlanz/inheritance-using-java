
public class Book extends Publication {
    private String author;

    public Book(String title, Double price, String author) {
        super(title, price);
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" + super.toString()+" " +
                "author='" + author + '\'' +
                '}';
    }
}
