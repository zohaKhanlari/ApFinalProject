import java.util.ArrayList;
public class Login extends AccountSetting {
    public Login(ArrayList<Admin> admins, ArrayList<Seller> sellers, ArrayList<User> users) {
        super(admins, sellers, users);
    }


    public static User loginMethod1(String userName, String passWord) {
        for (User allUsers : Shop.users) {
            if (userName.equals(allUsers.userName) && passWord.equals(allUsers.passWord)) {
                return allUsers;
            } else {
                return  null;
            }
        }
        return null;
    }

    public static Seller loginMethod2(String companyName, String passWord) {
        for (Seller allSellers : Shop.sellers) {
            if (companyName.equals(allSellers.companyName) && passWord.equals(allSellers.passWord)) {
                return allSellers;
            } else {
                return null;
            }
        }
        return null;
    }
    public void loginMethod3(String userName, String passWord, String email) {
        for (Admin allAdmins : Shop.admins) {
            if ((userName.equals(allAdmins.getUserName()) && passWord.equals(allAdmins.getPassWord())) || (email.equals(allAdmins.getEmail()) && passWord.equals(allAdmins.getPassWord())) || (userName.equals(allAdmins.getUserName()) && email.equals(allAdmins.getEmail()))) {
                System.out.println("Welcome " + allAdmins.getUserName() + " !");
            } else {
                System.out.println("Invalid Username Or Password!");
            }
        }
    }
}
