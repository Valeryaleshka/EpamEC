package by.epam.classes.task9;

public class Book {

    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublished;
    private int numberOfPages;
    private int price;
    private String binding;

    public Book(int id, String title, String author, String publisher, int yearOfPublished, int numberOfPages, int price, String binding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublished = yearOfPublished;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.binding = binding;
    }

    public Book() {
        this.id = 0;
        this.title = null;
        this.author = null;
        this.publisher = null;
        this.yearOfPublished = 0;
        this.numberOfPages = 0;
        this.price = 0;
        this.binding = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublished=" + yearOfPublished +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }
}
