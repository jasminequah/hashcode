import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Simulation {

  static int time;
  List<Ride> ridesRunning;
  List<Ride> ridesWaiting;
  List<Ride> unassignedRides;
  final int finalTime;
  List<Vehicle> vehicles;
  int score;
  int numVehicles = 10;
  IntStream intStream;
  int bonus;

  public Simulation(int finalTime, int bonus) {
    time = 0;
    score = 0;
    this.bonus = bonus;
    this.finalTime = finalTime;
    //Creates vehicles with numbered id
    vehicles = new ArrayList<Vehicle>(numVehicles);
    IntStream.range(0, numVehicles).sequential().forEach(i -> {
      vehicles.add(i, new Vehicle(0, 0, i));
    });
  }

  public void runSimulation() {
    for (Vehicle v : vehicles) {
      time = 0;
      while (time < finalTime && !v.ridesDone.isEmpty()) { //and still rides left
        Ride nextRide = v.getNextRide();
        boolean getBonus = false;

        //Moves to start of next ride
        time += getTime(v.getX(), v.getY(), nextRide.getStartX(), nextRide.getStartY());
        v.setPosition(nextRide.getStartX(), nextRide.getStartY());

        //Waits
        if (time <= nextRide.getStartTime()) {
          time = nextRide.getFinishTime();
          getBonus = true;
        }

        //Drive to finish
        time += getTime(v.getX(), v.getY(), nextRide.getFinishX(), nextRide.getFinishY());
        v.setPosition(nextRide.getFinishX(), nextRide.getFinishY());

        //If arrives before ride's final time, adds to score
        if (time <= nextRide.getFinishTime()) {
          score += nextRide.getRideTime();
          if (getBonus) {
            score += bonus;
          }
        }

      }
    }
  }

  public int getTime(int a, int b, int x, int y) {
    //Calculates time taken to travel
    return (Math.abs(a - x) + Math.abs(b - y));
  }

}
