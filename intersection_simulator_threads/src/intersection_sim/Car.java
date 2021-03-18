package intersection_sim;

public class Car extends Thread{
    String id;
    private volatile boolean exit = false;

    public Car(String id)
    {
        this.id = id;
    }

    public void run() {

        System.out.println( id + " is approaching the intersection");

        try {
            Thread.sleep((long)(3000));
        } catch (InterruptedException var1) {
            var1.printStackTrace();
        }

        while(!exit) {

            System.out.println( id + " arrived at the intersection");

            synchronized(Intersection.list) {

                System.out.println( id + " Intersection.list.size()" + Intersection.list.size() );
                System.out.println( id + " colour " + Intersection.trafficLight );

                while(Intersection.trafficLight == "red" || Intersection.list.size() > 0 ) {
                    try {
                        Intersection.list.wait();
                    } catch (InterruptedException var2) {
                        var2.printStackTrace();
                    }
                }

                Intersection.list.add(id);
                System.out.println( id + " entered the intersection");

                try {
                    Thread.sleep((long)(1000));
                } catch (InterruptedException var3) {
                    var3.printStackTrace();
                }

                System.out.println( id + " exited the intersection");

                Intersection.list.removeLast();

                Intersection.list.notifyAll();

                try {
                    Thread.sleep((long)(3000));
                } catch (InterruptedException var3) {
                    var3.printStackTrace();
                }

                System.out.println( "Thread for " + id + " exited");
                exit = true;
            }

        }
    }





}
