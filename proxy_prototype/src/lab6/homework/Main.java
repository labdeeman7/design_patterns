package lab6.homework;

public class Main {
    public static void main(String[] args) {
        Worker boss = new Worker("boss");
        Worker manager1 = new Worker("manager");
        Worker employee1 = new Worker("employee");

        RealInternetAccess internetServer = new RealInternetAccess();
        ProxyServer proxyServer = new ProxyServer(internetServer);

        // Check if rules work correctly
        String result1 = proxyServer.loadPage("www.facebook.com", boss);
        System.out.println("check if boss can access anything " + result1);

        String result2 = proxyServer.loadPage("www.facebook.com", manager1);
        System.out.println("check if manager can access facebook " + result2);

        String result3 = proxyServer.loadPage("www.youtube.com", employee1);
        System.out.println("check if employee can access youtube " + result3);

        String result4 = proxyServer.loadPage("www.google.com", employee1);
        System.out.println("check if employee can access google " + result4);

        //check adding new rules
        employee1.addNewRules("www.yahoo.com", false);
        String result5 =proxyServer.loadPage("www.yahoo.com", employee1);
        System.out.println("check add new rules " + result5);

        //check if cloned employee gets new rule
        Worker employee2 = (Worker) employee1.clone();
        String result6 =proxyServer.loadPage("www.yahoo.com", employee2);
        System.out.println("check if new employee gets new rule " + result6);

    }
}


