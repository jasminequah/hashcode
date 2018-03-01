import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vehicle {

  int x;
  int y;
  final int vehicleID;
  List<Ride> ridesDone;
  City city;
  int currentTime;
  int maxTime;

  public Vehicle(int x, int y, int vehicleID, City city, int maxTime) {
    this.maxTime = maxTime;
    this.x = 0;
    this.y = 0;
    this.vehicleID = vehicleID;
    this.currentTime = 0;
    ridesDone = new ArrayList<>();
    this.city = city;
  }


  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getVehicleID() {
    return vehicleID;
  }

  public List<Ride> getRidesDone() {
    return ridesDone;
  }

  public City getCity() {
    return city;
  }

  public int getCurrentTime() {
    return currentTime;
  }

  public int getMaxTime() {
    return maxTime;
  }

  public String toString() {
    List<Integer> ids = ridesDone.stream().map(r -> r.getId()).collect(Collectors.toList());
    StringBuilder ret = new StringBuilder();
    for (Integer id : ids) {
      ret.append(id);
      ret.append(" ");
    }
    return (ridesDone.size() + " " + ret);
  }

  public Ride optinum() {
    Block[][] blocks = city.getCity();
    Ride optinum =

    for (Block[] block : blocks) {
      for (Block block1 : block) {
        for (Ride r : block1.ridesThatStartHere) {
          if (r.timeToStartPointFrom(x, y) < optinum.timeToStartPointFrom(x, y) &&
              ((currentTime + r.timeToStartPointFrom(x, y) + r.getRideTime()) < maxTime)) {
            optinum = r;
          }
        }
      }
    }
    return optinum;
  }








}
