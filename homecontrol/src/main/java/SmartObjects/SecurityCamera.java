package SmartObjects;

public class SecurityCamera extends SmartObjects implements Status {

  private boolean status;
  private int temperature;
  private static int instanceCount=0;

  public SecurityCamera(){
    instanceCount++;
  }


  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public float getConsumption() {
    return status ? 2 : 0;
  }
}
