package ro.sit.homeplanner.smartdevices;

/**
 * @author securiter
 * This class represents the functionality of a security camera and contains the general and specific behaviour of one.
 */

public class SecurityCamera extends SmartObjects {

  private boolean status;
  private boolean filmingStatus;
  private static int instanceCount = 0;
  private final float CONSUMPTION = 5;
  private final float FILM_CONSUMPTION = 8;

  public SecurityCamera() {
    instanceCount++;
  }

  public void turnOn() {
    this.status = true;
  }

  public void turnOff() {
    this.status = false;
  }

  public boolean getStatus() {
    return this.status;
  }

  public void turnOnFilming() {
    this.filmingStatus = true;
  }

  public void turnOffFilming() {
    this.filmingStatus = false;
  }

  @Override
  public String toString() {
    return "SecurityCamera{" +
            "status=" + status +
            ", filmingStatus=" + filmingStatus +
            ", CONSUMPTION=" + CONSUMPTION +
            ", FILM_CONSUMPTION=" + FILM_CONSUMPTION +
            '}';
  }

  public float getConsumption() {
    return (status && filmingStatus) ? this.CONSUMPTION + this.FILM_CONSUMPTION : status ? this.CONSUMPTION : 0;
  }

}
