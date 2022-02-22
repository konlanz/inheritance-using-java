public class Publication {
    private String title;
    private Double price;

    public Publication(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", price=" + price ;
    }
}
