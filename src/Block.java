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
}
