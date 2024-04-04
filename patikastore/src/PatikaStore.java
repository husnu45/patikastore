import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PatikaStore {
    private List<Brand> brands;
    private List<Product> products;

    public PatikaStore() {
        this.brands = new ArrayList<>();
        this.products = new ArrayList<>();
        initializeBrands();
    }

    private void initializeBrands() {
        String[] brandNames = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        for (int i = 0; i < brandNames.length; i++) {
            Brand brand = new Brand(i + 1, brandNames[i]);
            brands.add(brand);
        }
        // Markaları alfabetik sıraya göre sırala
        brands.sort(Comparator.comparing(Brand::getName));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public void displayProducts() {
        System.out.println("ID   Ürün Adı            Marka          RAM       Depolama  Ekran Boyutu  Pil Gücü  Renk      Fiyat");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (Product product : products) {
            product.displayInfo();
        }
    }

    public static void main(String[] args) {
        PatikaStore store = new PatikaStore();

        // Örnek ürünler oluştur
        Brand lenovo = store.brands.get(1); // Lenovo markasını al
        Brand apple = store.brands.get(2);

        Product phone1 = new CellPhone(1, 5000, 10, 50, "Galaxy S21", lenovo, "128 GB", 6.2, 4500, 8, "Siyah");
        Product phone2 = new CellPhone(2, 6000, 15, 30, "iPhone 12", apple, "256 GB", 6.1, 3800, 6, "Mavi");
        Product laptop1 = new Notebook(3, 8000, 10, 20, "ThinkPad X1", lenovo, 16, "512 SSD", 14);
        Product laptop2 = new Notebook(4, 9000, 12, 15, "MacBook Pro", apple, 16, "1 TB SSD", 16);

        // Ürünleri ekle
        store.addProduct(phone1);
        store.addProduct(phone2);
        store.addProduct(laptop1);
        store.addProduct(laptop2);

        // Ürünleri listele
        store.displayProducts();
    }
}