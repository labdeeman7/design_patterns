package lab6.homework;

import java.util.HashMap;

public class Rules {
    private HashMap permissions;

    Rules(String employeeType){
        this.permissions = setPermissions(employeeType);
    }

    private HashMap setPermissions(String employeeType){
        HashMap<String, Boolean> hmap = new HashMap<String, Boolean>();
        if (employeeType == "boss"){
            hmap.put("www.google.com", true);
            hmap.put("www.facebook.com", true);
            hmap.put("www.youtube.com", true);
        }
        else if(employeeType == "manager"){
            hmap.put("www.google.com", true);
            hmap.put("www.facebook.com", false);
            hmap.put("www.youtube.com", true);
        }
        else if(employeeType == "employee"){
            hmap.put("www.google.com", true);
            hmap.put("www.facebook.com", false);
            hmap.put("www.youtube.com", false);
        }
        else{
            throw new IllegalArgumentException("error in Employee type supplied");
        }
        return hmap;
    }

    public void addRules(String url, boolean permission){
        if (url == "www.google.com" ||  url == "www.facebook.com"
                || url == "www.youtube.com" ){
            throw new IllegalArgumentException("Do not change add base rules");
        }
        else{
            this.permissions.put(url, permission);
        }
    }

    public HashMap getPermissions() {
        return this.permissions;
    }
}
