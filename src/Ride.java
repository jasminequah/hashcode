public class Ride {

  private final int startTime;
  private final int finishTime;
  private final int startX;
  private final int startY;
  private final int finishX;
  private final int finishY;
  private final int id;

  public Ride(int startX, int startY, int finishX, int finishY, int startTime, int finishTime, int id) {
    this.startX = startX;
    this.startY = startY;
    this.finishTime = finishTime;
    this.startTime = startTime;
    this.finishX = finishX;
    this.finishY = finishY;
    this.id = id;
  }

  public int getStartTime() {
    return startTime;
  }

  public int getFinishTime() {
    return finishTime;
  }

  public int getStartX() {
    return startX;
  }

  public int getStartY() {
    return startY;
  }

  public int getFinishX() {
    return finishX;
  }

  public int getFinishY() {
    return finishY;
  }

  public int getId() {
    return id;
  }

  public int timeToStartPointFrom(int x, int y) {
    return (Math.abs(x - startX) + Math.abs(y - startY));
  }

  public int getRideTime() {
    return (Math.abs(startX - finishX) + Math.abs(startY - finishY));
  }
}
