package ro.sit.homeplanner.smartdevices;

/*
 * This class represents the functionality of a smart lamp and contains the general and specific behaviour of one.
 */

public class Lamp extends SmartObjects {

  private boolean status;
  private int brightness;
  private String color;
  private static int instanceCount = 0;
  private final float CONSUMPTION = 2;

  public Lamp() {
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

  public int getBrightness() {
    return brightness;
  }

  public void setBrightness(int brightness) {
    if (brightness > 0 && brightness <= 100) {
      this.brightness = brightness;
    } else if (brightness > 100) {
      System.out.println("Brightness too high!");
    } else {
      System.out.println("Brightness cannot be 0, turn off instead, please!");
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Lamp{" +
            "status=" + status +
            ", brightness=" + brightness +
            ", color='" + color + '\'' +
            ", CONSUMPTION=" + CONSUMPTION +
            '}';
  }

  public float getConsumption() {
    return status ? this.CONSUMPTION : 0;
  }


}
