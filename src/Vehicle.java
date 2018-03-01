import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vehicle {

  int x;
  int y;
  final int vehicleID;
  List<Ride> ridesDone;

  public Vehicle(int x, int y, int vehicleID) {
    this.x = 0;
    this.y = 0;
    this.vehicleID = vehicleID;
    ridesDone = new ArrayList<>();
  }

  public String toString() {
    List<Integer> ids = ridesDone.stream().map(r -> r.getId()).collect(Collectors.toList());
    StringBuilder ret = new StringBuilder()
    for (Integer id : ids) {
      ret.append(id);
      ret.append(" ");
    }
    return (ridesDone.size() + " " + ret);
  }

}
