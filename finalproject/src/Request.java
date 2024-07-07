import java.util.ArrayList;

public class Request {
    Seller seller;
    User requester;
    double amount;
    static ArrayList<Request> fundRequestsList = new ArrayList<>();
    static ArrayList<Request> sellingCertRequestsList = new ArrayList<>();
    public Request(User user, double amount){
        this.amount = amount;
        this.requester = user;
        fundRequestsList.add(this);
    }
    public Request(Seller seller){
        this.seller = seller;
        sellingCertRequestsList.add(this);
    }
    public static void displaySellingCerts(){
        int index = 1;
        for(Request request : Request.sellingCertRequestsList){
            System.out.println(index + "-" + request.seller.companyName);
            index += 1;
        }
    }
    public static void displayFundRequest() {
        int index = 1;
        for (Request request : Request.sellingCertRequestsList) {
            System.out.println(index + "-" + request.requester.userName + "---" + request.amount);
            index += 1;
        }
    }
}
