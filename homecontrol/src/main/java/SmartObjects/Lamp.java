package SmartObjects;

public class Lamp extends SmartObjects implements Status{

  private boolean status;
  private int brightness;
  private String color;
  private static int instanceCount=0;

  public Lamp(){
    instanceCount++;
  }


  public int getBrightness() {
    return brightness;
  }

  public void setBrightness(int brightness) {
    this.brightness = brightness;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public float getConsumption() {
    return status ? 2 : 0;
  }
}
