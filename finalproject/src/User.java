import java.util.*;
public class User extends Account{
    String userName;
    String passWord;
    private String email;
    private String phoneNumber;
    private String address;
    HashMap<Product , Integer> userCart = new HashMap<>();
    public User(String userName, String passWord, String email, String phoneNumber, String address) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        Account.accounts.add(this);
    }
    public String editUserName(String userName){
        this.userName = userName;
        return userName;
    }
    public String editPassWord(String passWord){
        this.passWord = passWord;
        return passWord;
    }
    public String editEmail(String email){
        this.email = email;
        return email;
    }
    public String editPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
    public String editAddress(String address){
        this.address = address;
        return address;
    }
    @Override
    public String getUserName() {
        return userName;
    }
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public String getPassWord() {
        return passWord;
    }
    @Override
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    public void showUserCart(){
        int j = 1;
        int totalPrice = 0;
        for (Product product : this.userCart.keySet()) {
            System.out.println(j + " - " + product.getName() + ": " + this.userCart.get(product));
            totalPrice += this.userCart.get(product) * product.getPrice();
            j += 1;
        }
        System.out.println("Total Price Is: " + totalPrice);
    }
    public void addToUserCart(Product product){
        if (this.userCart.containsKey(product)){
            this.userCart.put(product, this.userCart.get(product) + 1);
        }
        else {
            this.userCart.put(product, 1);
        }
    }
}
