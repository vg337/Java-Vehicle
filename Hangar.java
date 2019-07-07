import java.util.ArrayList;

public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car("Clio");

        
        clio.setKilometers(60000);
        clio.setSound(true);
      
        System.out.println(clio.doStuff());

        Boat france = new Boat("France");

        france.setKilometers(0);
        france.setSound(true);
              
        System.out.println(france.doStuff());
        

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(clio);
        vehicleList.add(france);
        
        System.out.println("Véhicules de la liste : ");

        for (Vehicle vehicle : vehicleList) {
            System.out.println("- " + vehicle.getBrand());
        }
    }
}