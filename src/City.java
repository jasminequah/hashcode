public class City {

  private Block[][] city;
  private final int rows;
  private final int columns;

  public City(int rows, int columns) {
    city = new Block[rows][columns];
    this.rows = rows;
    this.columns = columns;
  }

  public Block getBlockAtCood(int x, int y) {
    return city[rows - y][x];
  }




}
