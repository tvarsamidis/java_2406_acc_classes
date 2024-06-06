package gr.codehub.oo.model;

public class Book implements OrderItem, OnlineItem {
    private String title;
    private double price;

    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return 0.8;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return "This is a book";
    }
}
