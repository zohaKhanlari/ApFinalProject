import java.util.*;
public class Seller extends Account {
    String companyName;
    String passWord;
    ArrayList<Product> availableProducts = new ArrayList<>();

    public Seller(String companyName, String passWord) {
        this.companyName = companyName;
        this.passWord = passWord;
        Account.accounts.add(this);
    }

    public String editCompanyName(String companyName) {
        this.companyName = companyName;
        return companyName;
    }

    public String editPassWord(String passWord) {
        this.passWord = passWord;
        return passWord;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getPassWord() {
        return passWord;
    }

    @Override
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public void addProduct(Product product){
        availableProducts.add(product);
    }
    public void removeProduct(Product product){
        availableProducts.remove(product);
    }
}

