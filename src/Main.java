import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    City newCity = new City(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

    int numberOfVehicles = Integer.parseInt(args[2]);
    int maxTime = Integer.parseInt(args[5])

    List<Vehicle> listOfVehicles = new ArrayList<>();

    for (int i = 0; i < numberOfVehicles; i++) {
      listOfVehicles.add(i, new Vehicle(i,newCity, maxTime));
    }

    for (Vehicle v : listOfVehicles) {
      while (v.currentTime < maxTime && v.getCity().hasRides()) {
        v.optinum();
        v.takeOptinum();
      }

      v.toString();

    }

  }

}
