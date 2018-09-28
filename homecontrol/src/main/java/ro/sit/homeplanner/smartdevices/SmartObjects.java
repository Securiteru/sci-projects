package ro.sit.homeplanner.smartdevices;

/**
 * @author securiter
 * An abstract class that performs all the base Smart Objects' functionality, including the Consumer interface.
 */

public abstract class SmartObjects implements Consumer {
  private boolean status;
  private float CONSUMPTION;

  public void turnOn() {
    this.status = true;
  }

  public void turnOff() {
    this.status = false;
  }

  public boolean getStatus() {
    return this.status;
  }

  public float getConsumption() {
    System.out.println(this.toString() + " " + this.CONSUMPTION + " In consumption method" + this.status);
    return status ? this.CONSUMPTION : 0;
  }

}
