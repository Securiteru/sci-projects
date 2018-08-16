package SmartObjects;

public class Thermostat extends SmartObjects implements Status {

  private boolean status;
  private boolean filmingStatus;
  private static int instanceCount=0;

  public Thermostat(){
    instanceCount++;
  }

  public void turnOnFilming(){
    this.status=true;
  }

  public void turnOffFilming(){
    this.status=false;
  }

  public float getConsumption() {
    return status ? 2 : 0;
  }

}
