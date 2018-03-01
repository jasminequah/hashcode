import java.util.ArrayList;
import java.util.List;

public class Vehicle {

  int x;
  int y;
  final int vehicleID;
  List<Ride> ridesDone;

  public Vehicle(int x, int y, int vehicleID) {
    this.x = x;
    this.y = y;
    this.vehicleID = vehicleID;
    ridesDone = new ArrayList<>();
  }

}
