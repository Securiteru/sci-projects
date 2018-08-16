import SmartObjects.Lamp;
import SmartObjects.SecurityCamera;
import SmartObjects.Status;
import SmartObjects.Thermostat;

public class HostDeviceController {

  private Status[] Smarties = new Status[10];

  public HostDeviceController(){
    Smarties[0]=new Thermostat();
    Smarties[1]=new Thermostat();
    Smarties[2]=new Thermostat();
    Smarties[3]=new Thermostat();
    Smarties[4]=new Thermostat();
    Smarties[5]=new Lamp();
    Smarties[6]=new Lamp();
    Smarties[7]=new Lamp();
    Smarties[8]=new SecurityCamera();
    Smarties[9]=new SecurityCamera();
  }



  public void turnAllOn(){

    for(Status s:Smarties){
      if(s !=null){
        s.turnOn();
        System.out.println("S is"+s + "Status is " + s.getStatus());

      }
    }

  }

  public void turnAllOff(){
    for(Status s:Smarties){
      if(s !=null){
        s.turnOff();
        System.out.println(s.getStatus());
      }
    }

  }

  public float getConsumptionAll(){
    float consumption=0;

    for(Status s:Smarties){
      if(s != null){
       consumption += s.getConsumption();
        System.out.println(s.getConsumption() + " si totalu " + consumption);
      }
    }
    return consumption;

  }

  public void getStateAll(){
    for(Status s:Smarties){
      if(s !=null){
        s.getStatus();
        System.out.println(s.getStatus());
      }
    }

  }

  public Status[] getAllDevicesArray(){
   return Smarties;
  }

}
