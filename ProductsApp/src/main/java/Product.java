public class Product {
    private long id;
    private  String productName;
    private  double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
