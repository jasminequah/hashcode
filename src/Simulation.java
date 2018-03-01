import java.util.ArrayList;
import java.util.List;

public class Simulation {

  static int time;
  List<Ride> ridesRunning;
  List<Ride> ridesWaiting;
  List<Ride> unassignedRides;
  final int finalTime;
  List<Vehicle> vehicles;
  int score;
  int numVehicles = 10;

  public Simulation(int finalTime) {
    time = 0;
    score = 0;
    this.finalTime = finalTime;
    vehicles = new ArrayList<>(numVehicles, new Vehicle());
  }

  public void runSimulation() {
    for (Vehicle v : vehicles) {
      time = 0;
    }
  }

  public int getTime(int a, int b, int x, int y) {
    //Calculates time taken to travel
    return (Math.abs(a - x) + Math.abs(b - y));
  }

}
