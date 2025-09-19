package lab02;

public class Novel {
    private String bookId;
    private String title;
    private double price;
    private double discount;

    public Novel(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.price = 0.0;
        this.discount = 0.0;
    }

    public Novel(String bookId, String title, double price, double discount) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.discount = discount;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSellingPrice() {
        return price - discount;
    }
}