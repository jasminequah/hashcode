import java.util.ArrayList;
import java.util.List;

public class City {

  private Block[][] city;
  private final int rows;
  private final int columns;
  private List<Ride> ridesToComplete;

  public City(int rows, int columns) {
    city = new Block[rows][columns];
    for (Block[] blocks : city) {
      for (Block block : blocks) {
        block = new Block();
      }
    }
    this.rows = rows;
    this.columns = columns;
    this.ridesToComplete = new ArrayList<>();
  }

  public void addVehicleAt(int x, int y, Vehicle vehicleToAdd) {
    city[rows - x - 1][y].addVehicle(vehicleToAdd);
  }

  public Block getBlockAtCood(int x, int y) {
    return city[rows - y - 1][x];
  }

  public Block[][] getCity() {
    return city;
  }

  public List<Ride> getRidesToComplete() {
    for (Block[] blocks : city) {
      for (Block block : blocks) {
        for(Ride r : block.ridesThatStartHere) {
          ridesToComplete.add(r);
        }
      }
    }
    return ridesToComplete;
  }

  public Ride getRandomRide() {
    for (Block[] blocks : city) {
      for (Block block : blocks) {
        if (!block.ridesThatStartHere.isEmpty()) {
          return block.ridesThatEndHere.get(0);
        }
      }
    }
    return new Ride(0,0,1000000,10000000,0,0,0);
  }

  public boolean hasRides(){
    for (Block[] blocks : city) {
      for (Block block : blocks) {
        if (!block.ridesThatStartHere.isEmpty()) {
          return true;
        }
      }
    }
    return false;
  }

  public void addRide(int a, int b, int x, int y, int start, int finish, int id) {
    Ride addThisRide = new Ride(a, b, x, y, start, finish, id);
    getBlockAtCood(a, b).addStartRide(addThisRide);
    getBlockAtCood(x, y).addFinishRide(addThisRide);
  }




}
