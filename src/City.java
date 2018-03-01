import java.util.ArrayList;
import java.util.List;

public class City {

  private Block[][] city;
  private final int rows;
  private final int columns;
  private List<Ride> ridesToComplete;

  public City(int rows, int columns) {
    city = new Block[rows][columns];
    this.rows = rows;
    this.columns = columns;
    this.ridesToComplete = new ArrayList<>();
  }

  public Block getBlockAtCood(int x, int y) {
    return city[rows - y][x];
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




}
