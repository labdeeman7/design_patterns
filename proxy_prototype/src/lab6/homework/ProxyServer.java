package lab6.homework;

import java.util.HashMap;

public class ProxyServer implements InternetAccessInterface {
    private RealInternetAccess server;

    ProxyServer(RealInternetAccess server){
        this.server = server;
    }

    public boolean checkAccess(String url, Rules accessRules){
        // change this
        HashMap<String, Boolean> permissions = accessRules.getPermissions();

        //check accessRules and return false or true.
        if (permissions.containsKey(url)){
            boolean accessType = permissions.get(url);
            return accessType;
        }
        else{
            return true;
        }

    }

    public String loadPage(String url, Worker worker) {
        Rules accessRules = worker.getWorkerRules();
        if(checkAccess(url, accessRules)){
            String result = server.loadPage(url, worker);
            return result;
        }
        else{
            return "access to " + url + " blocked";
        }

    }
}
