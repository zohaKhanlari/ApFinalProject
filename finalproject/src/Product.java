import java.util.ArrayList;

public class Product {
    Seller seller;
    private String name;
    private int price;
    private int inventory;
    public Category category;
    ArrayList<String> comments;
    public Product(String name, int price, int inventory, Category category, Seller seller){
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.category = category;
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Inventory: " + inventory);
        System.out.println("reviews: " + comments);
        System.out.println("Category: " + category.name);
    }
    public void displayComments() {
        for (String string : this.comments){
            System.out.println(string);
        }
    }
}
