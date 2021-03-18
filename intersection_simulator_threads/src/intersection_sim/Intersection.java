package intersection_sim;

import java.util.LinkedList;
import java.util.Deque;

public class Intersection extends Thread {
    public static Deque<String> list = new LinkedList<String>();
    public static int intersectionSize = 1;
    public static String trafficLight = "red";

    public Intersection() {
    }

    public void run(){

        while(true){
            // We need to switch from red to green every 2 seconds
            trafficLight = "red";

            try {
                Thread.sleep((long)(2000));
            } catch (InterruptedException var5) {
                var5.printStackTrace();
            }

            trafficLight = "green";

            try {
                Thread.sleep((long)(2000));
            } catch (InterruptedException var6) {
                var6.printStackTrace();
            }

            }
        }

}
