// Cep Telefonu sınıfı
class CellPhone extends Product {
    private String memory;
    private double screenSize;
    private int batteryPower;
    private int ram;
    private String color;

    public CellPhone(int id, double price, double discountRate, int stock, String name, Brand brand,
                     String memory, double screenSize, int batteryPower, int ram, String color) {
        super(id, price, discountRate, stock, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.format("%-5s%-20s%-15s%-10s%-10s%-10s%-15s%-15s%-10s%n", id, name, brand.getName(), memory, screenSize, batteryPower, ram, color, getDiscountedPrice());
    }
}