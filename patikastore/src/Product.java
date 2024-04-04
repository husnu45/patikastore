// Ürün sınıfı
abstract class Product {
    protected int id;
    protected double price;
    protected double discountRate;
    protected int stock;
    protected String name;
    protected Brand brand;

    public Product(int id, double price, double discountRate, int stock, String name, Brand brand) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice() {
        return price - (price * discountRate / 100);
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public abstract void displayInfo();
}