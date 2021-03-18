package intersection_sim;

public class TestProgram {
    public static void main(String[] args) {

        new Intersection().start();

        for (int it = 0; it<10; it++)
        {
            String id = "Car" + it;
            new Car(id).start();
        }

    }
}
