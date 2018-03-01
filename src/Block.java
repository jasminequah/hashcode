import java.util.ArrayList;
import java.util.List;

public class Block {

  List<Vehicle> vehiclesHere;
  List<Ride> ridesThatStartHere;
  List<Ride> ridesThatEndHere;

  public Block() {
    this.vehiclesHere       = new ArrayList<>();
    this.ridesThatStartHere = new ArrayList<>();
    this.ridesThatEndHere   = new ArrayList<>();
  }

  public void removeFinishedRide(Ride ride) {
    ridesThatEndHere.remove(ride);
    ridesThatStartHere.remove(ride);
  }

  public void addStartRide(Ride ride) {
    ridesThatStartHere.add(ride);
  }

  public void addFinishRide(Ride ride) {
    ridesThatEndHere.add(ride);
  }

  public void addVehicle(Vehicle vehicle) {
    vehiclesHere.add(vehicle);
  }

}
