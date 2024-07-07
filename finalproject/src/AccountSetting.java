import java.util.ArrayList;

public abstract class AccountSetting {
    ArrayList<Admin> admins;
    ArrayList<Seller> sellers;
    ArrayList<User> users;
    public AccountSetting (ArrayList<Admin> admins ,ArrayList<Seller> sellers ,ArrayList<User> users) {
        this.admins = admins;
        this.sellers = sellers;
        this.users = users;
    }
}