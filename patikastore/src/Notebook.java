// Notebook sınıfı
class Notebook extends Product {
    private int ram;
    private String storage;
    private double screenSize;

    public Notebook(int id, double price, double discountRate, int stock, String name, Brand brand,
                    int ram, String storage, double screenSize) {
        super(id, price, discountRate, stock, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        System.out.format("%-5s%-20s%-15s%-10s%-10s%-10s%-10s%-10s%-10s%n", id, name, brand.getName(), ram, storage, screenSize, "-", "-", getDiscountedPrice());
    }
}