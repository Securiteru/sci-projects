package SmartObjects;

public class SmartObjects {
  private boolean status;

  public void turnOn(){
    this.status=true;
  }

  public void turnOff(){
    this.status=false;
  }

  public boolean getStatus() {

    return status;
  }




}
