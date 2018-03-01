import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

  private static Scanner instructions;

  public static void main(String[] args) throws FileNotFoundException{
    instructions = new Scanner(new File(args[0]));
    int rows = instructions.nextInt();
    int cols = instructions.nextInt();
    City newCity          = new City(cols, rows);
    int numberOfVehicles  = instructions.nextInt();
    int numRides          = instructions.nextInt();
    int bonus             = instructions.nextInt();
    int maxTime           = instructions.nextInt();

//    City newCity = new City(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

//    int numberOfVehicles = Integer.parseInt(args[2]);
//    int maxTime = Integer.parseInt(args[5]);

    List<Vehicle> listOfVehicles = new ArrayList<>();
      for (int i = 0; i < numRides; i++) {
        newCity.addRide(instructions.nextInt(), instructions.nextInt(),
          instructions.nextInt(), instructions.nextInt(),
          instructions.nextInt(), instructions.nextInt(), i);
      }

    for (int i = 0; i < numberOfVehicles; i++) {
      Vehicle v = new Vehicle(i,newCity, maxTime);
      listOfVehicles.add(i, v);
      newCity.addVehicleAt(0, 0, v);
    }

    for (Vehicle v : listOfVehicles) {
      while (v.currentTime < maxTime && v.getCity().hasRides()) {
        v.optinum();
        v.takeOptinum();
      }
      System.out.println(v.toString());
    }
  }

}
