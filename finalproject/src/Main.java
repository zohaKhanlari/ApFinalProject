import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shop shop = new Shop("JAVA ONLINE SHOP", "www.javashop.com", "02133456577");
        System.out.println("~ WELCOME TO " + shop.shopName + " ~");
        System.out.println("Our Website Address is :  " + shop.webAddress);
        System.out.println("Our Support Number is :  " + shop.supportNumber);
        Category book = new Category("-BOOK-");
        Category food = new Category("-FOOD-");
        Category clothes = new Category("-CLOTHES-");
        Category furniture = new Category("-FURNITURE-");
        Category shoes = new Category("-SHOES-");
        shop.addCategory(book);
        shop.addCategory(food);
        shop.addCategory(clothes);
        shop.addCategory(furniture);
        shop.addCategory(shoes);
        Product book1 = new Product("Harry Potter",100,3, book);
        Product food1 = new Product("Chicken",123,4, food);
        Product clothes1 = new Product("T-shirt",209,1, clothes);
        Product furniture1 = new Product("Sofa",130,2, furniture);
        Product shoes1 = new Product("High Heels",182,7, shoes);

        Account account1 = null;
        while (true) {
            while (account1 == null) {
                System.out.println("1-REGISTER");
                System.out.println("2-LOGIN");
                int Input = input.nextInt();
                if (Input == 1) {
                    System.out.println("-- REGISTER --");
                    System.out.println("Choose your character :");
                    System.out.println("1.Seller");
                    System.out.println("2.User");
                    int Input1 = input.nextInt();
                    if (Input1 == 1) {
                        System.out.print("Please Enter Your Company name : ");
                        String companyName = input.next();
                        System.out.print("Please Enter Your Password : ");
                        String passWord = input.next();
                        Seller seller1 = new Seller(companyName, passWord);
                        Shop.sellers.add(seller1);


                    } else {
                        System.out.print("Please Enter Your Username : ");
                        String userName = input.next();
                        System.out.print("Please Enter Your Password : ");
                        String passWord = input.next();
                        System.out.print("Please Enter Your Email address: ");
                        String email = input.next();
                        System.out.print("Please Enter Your Phone number : ");
                        String phoneNumber = input.next();
                        System.out.print("Please Enter Your Address : ");
                        String address = input.next();
                        User user1 = new User(userName, passWord, email, phoneNumber, address);
                        Shop.users.add(user1);

                    }
                }
                if (Input == 2) {
                    System.out.println("-- LOGIN --");
                    System.out.println("Choose your character :");
                    System.out.println("1.Seller");
                    System.out.println("2.User");
                    int Input1 = input.nextInt();

                    if (Input1 == 1) {
                        System.out.println("-- LOGIN --");
                        String passWord2;
                        String companyName2;
                        System.out.print("Login company name : ");
                        companyName2 = input.next();
                        System.out.print("Login Password : ");
                        passWord2 = input.next();

                        account1 = Login.loginMethod2(companyName2, passWord2);
                    } else {
                        System.out.println("-- LOGIN --");
                        String passWord2;
                        String userName2;
                        System.out.print("Login Username : ");
                        userName2 = input.next();
                        System.out.print("Login Password : ");
                        passWord2 = input.next();

                        account1 = Login.loginMethod1(userName2, passWord2);
                    }


                }
            }
            while (account1 instanceof Admin) {
                System.out.println("-- MAIN MENU --");
                System.out.println("1.Promote To Admin");
                System.out.println("2.Add Fund");
                System.out.println("3.Fund Requests");
                System.out.println("4.Orders");
                System.out.println("5.Certificates");
                System.out.println("6.Logout");
                int Input2 = input.nextInt();

                if (Input2 == 1) {

                }
                if (Input2 == 2) {

                }
                if (Input2 == 3) {

                }
                if (Input2 == 4) {

                }
                if (Input2 == 5) {

                }
                if (Input2 == 6) {
                    account1 = null;
                    break;
                }

            }
            while (account1 instanceof Seller) {
                Seller seller1 = new Seller("", "");
                System.out.println("-- MAIN MENU --");
                System.out.println("1.Edit Your Profile");
                System.out.println("2.Your Products");
                System.out.println("3.Logout");
                int Input2 = input.nextInt();

                if (Input2 == 1) {
                    System.out.println(" Do You Want To Change Your Company name? 1.Yes 2.No");
                    int editcompanyname = input.nextInt();
                    if (editcompanyname == 1) {
                        System.out.println("Please Enter Your New Company name :");
                        String newCompanyName = input.next();
                        seller1.editCompanyName(newCompanyName);
                    }
                    System.out.println(" Do You Want To Change Your Password? 1.Yes 2.No");
                    int editpassword = input.nextInt();
                    if (editpassword == 1) {
                        System.out.println("Please Enter Your New Password :");
                        String newPassWord = input.next();
                        seller1.editPassWord(newPassWord);
                    }
                    System.out.println("Your Profile Updated Successfully!");
                }
                if (Input2 == 2) {

                }
                if (Input2 == 3){
                    account1 = null;
                    break;
                }
                while (account1 instanceof User) {
                    System.out.println("-- MAIN MENU --");
                    System.out.println("1.Edit Your Profile");
                    System.out.println("2.See Products");
                    System.out.println("3.Search Product");
                    System.out.println("4.Cart");
                    System.out.println("5.Add Fund");
                    System.out.println("6.Logout");

                    User user1 = new User("", "", "", "", "");
                    Input2 = input.nextInt();
                    if (Input2 == 1) {
                        System.out.println(" Do You Want To Change Your Username? 1.Yes 2.No");
                        int editusername = input.nextInt();
                        if (editusername == 1) {
                            System.out.println("Please Enter Your New Username :");
                            String newUserName = input.next();
                            user1.editUserName(newUserName);
                        }
                        System.out.println(" Do You Want To Change Your Password? 1.Yes 2.No");
                        int editpassword = input.nextInt();
                        if (editpassword == 1) {
                            System.out.println("Please Enter Your New Password :");
                            String newPassWord = input.next();
                            user1.editPassWord(newPassWord);
                        }
                        System.out.println(" Do You Want To Change Your Email? 1.Yes 2.No");
                        int editemail = input.nextInt();
                        if (editemail == 1) {
                            System.out.println("Please Enter Your New Email :");
                            String newEmail = input.next();
                            user1.editEmail(newEmail);
                        }
                        System.out.println(" Do You Want To Change Your Phone number? 1.Yes 2.No");
                        int editPhoneNumber = input.nextInt();
                        if (editPhoneNumber == 1) {
                            System.out.println("Please Enter Your New Phone number :");
                            String newPhoneNumber = input.next();
                            user1.editPhoneNumber(newPhoneNumber);
                        }
                        System.out.println(" Do You Want To Change Your Address? 1.Yes 2.No");
                        int editAddress = input.nextInt();
                        if (editAddress == 1) {
                            System.out.println("Please Enter Your New Address :");
                            String newAddress = input.next();
                            user1.editAddress(newAddress);
                        }
                        System.out.println("Your Profile Updated Successfully!");
                    }
                    if (Input2 == 2) {
                        System.out.println("Choose The Category You Want :");
                        int i = 1;
                        for (Category category : Shop.categories){
                            System.out.println(i + ". " + category.name);
                            i += 1;
                        }
                        int input1 = input.nextInt();
                        i = 1;
                        for (Product product : Shop.categories.get(input1 - 1).products){
                            System.out.println(i + ". " + product.getName() + " $" + product.getPrice());
                            i += 1;
                        }
                        int input2 = input.nextInt();
                        Shop.categories.get(input1 - 1).products.get(input2 - 1).displayProduct();
                        Shop.categories.get(input1 - 1).products.get(input2 - 1).displayComments();
                        System.out.println("1.Buy");
                        System.out.println("2.Cancel");
                        int input3 = input.nextInt();
                        if (input3 == 1){
                            ((User) account1).addToUserCart(Shop.categories.get(input1 - 1).products.get(input2 - 1));
                        }
                        if (input3 == 2){

                        }
                    }
                    if (Input2 == 3){
                        System.out.println("SEARCHING...");
                        String name = input.next();
                        Product searchProduct = Shop.searchProduct(name);
                        searchProduct.displayProduct();
                        searchProduct.displayComments();
                        System.out.println("1.Buy");
                        System.out.println("2.Cancel");
                        int input1 = input.nextInt();
                        if (input1 == 1){
                            ((User) account1).addToUserCart(searchProduct);
                        }
                        if (input1 == 2){
                        }
                    }
                    if (Input2 == 4){
                        System.out.println("Your Shopping Cart :");
                        ((User)account1).showUserCart();
                    }
                    if (Input2 == 5){
                        System.out.println("Enter The Amount :");
                        double amount = input.nextDouble();
                        new Request((User)account1, amount);
                    }
                    if (Input2 == 6){
                        account1 = null;
                        break;
                    }
                }
            }
        }
    }
}

