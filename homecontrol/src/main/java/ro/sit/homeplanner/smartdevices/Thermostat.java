package ro.sit.homeplanner.smartdevices;

/**
 * @author securiter
 * This class represents the functionality of a thermostat and contains the general and specific behaviour of one.
 */

public class Thermostat extends SmartObjects {

  private boolean status;
  private int temperature;
  private static int instanceCount = 0;
  private final float CONSUMPTION = 3;

  public Thermostat() {
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

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    if (temperature >= 0 && temperature <= 100) {
      this.temperature = temperature;
    } else if (temperature > 100) {
      System.out.println("Error, temperature too high");
    } else {
      System.out.println("Error, temperature too low");
    }

  }

  @Override
  public String toString() {
    return "Thermostat{" +
            "status=" + status +
            ", temperature=" + temperature +
            ", CONSUMPTION=" + CONSUMPTION +
            '}';
  }

  public float getConsumption() {
    return status ? this.CONSUMPTION : 0;
  }

}
