package lab6.homework;

public class RealInternetAccess implements InternetAccessInterface {

    public String loadPage(String url, Worker worker){
        return url + " loaded";
    }
}
