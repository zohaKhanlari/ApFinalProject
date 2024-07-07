import java.util.*;
public class Shop {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Seller> sellers = new ArrayList<>();
    static ArrayList<Admin> admins = new ArrayList<>();
    public static ArrayList<Category> categories = new ArrayList<>();
    String shopName;
    String webAddress;
    String supportNumber;
    static int totalProfit;
    ArrayList<Account> customers = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();
    //ArrayList<Order> orders = new ArrayList<>();
    public Shop(String shopName , String webAddress , String supportNumber){
        this.shopName = shopName;
        this.webAddress = webAddress;
        this.supportNumber = supportNumber;
    }
    public void addCategory(Category category){
        this.categories.add(category);
    }
    public static Product searchProduct(String name){
        for (Product product : products){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
