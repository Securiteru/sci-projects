import SmartObjects.SmartObjects;

public class Main {
  public static void main(String[] args) {
    HostDeviceController hosty= new HostDeviceController();
    hosty.turnAllOn();
    hosty.getStateAll();
    hosty.getConsumptionAll();
    hosty.getStateAll();

    Object[] result = hosty.getAllDevicesArray();
    for (int i=0; i<result.length; i++) {
      System.out.print(result[i]+" ");
    }
  }
}
