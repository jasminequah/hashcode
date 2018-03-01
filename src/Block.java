import java.util.List;

public class Block {

  List<Vehicle> vehiclesHere;
  List<Ride> ridesThatStartHere;
  List<Ride> ridesThatEndHere;

  public Block(List<Vehicle> vehiclesHere, List<Ride> ridesThatStartHere, List<Ride> ridesThatEndHere) {
    this.vehiclesHere = vehiclesHere;
    this.ridesThatStartHere = ridesThatStartHere;
    this.ridesThatEndHere = ridesThatEndHere;
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


}
