package fst;

public class Encapsulationactivity {
    public static void main (String[] arg) {
        Plane ptest = new Plane(10);
        String[] passenger = {"ram","shyam","sita","geeta"};

        ptest.onboard(passenger);


        System.out.println("\nPeople on the plane: " + ptest.getPassengers());


        System.out.println("\nPlane took off at: " + ptest.takeOff());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        ptest.land();

        System.out.println("\nPlane landed at: " + ptest.getLastTimeLanded());
        System.out.println("\nPeople on the plane after landing: " + ptest.getPassengers());
    }

}