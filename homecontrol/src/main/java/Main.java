import smartdevices.*;

public class Main {
  public static void main(String[] args) {
    HostDeviceController hosty = new HostDeviceController();
    hosty.turnAllOn();
//    System.out.println("All turned ON!");
//    System.out.println("State Report");
//    System.out.println(hosty.getConsumptionAll());
//    System.out.println("Get Consumption");
//    hosty.getStateAll();
//    System.out.println("State Report 2");
//
    Object[] result = hosty.getAllDevicesArray();
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i] + " ");
    }

    hosty.turnOnFilmingAll();
    hosty.turnOffFilmingAll();
    hosty.setBrightnessAndSetColor(50, "RED");
    hosty.setTemperatureGlobally(51050);
//
//
//    Thermostat thermy = new Thermostat();
//    SecurityCamera secy = new SecurityCamera();
//    Lamp lampy = new Lamp();
//
//    thermy.turnOn();
//    lampy.turnOn();
//    secy.turnOn();
//
//    System.out.println("Thermy Consumption: " + thermy.getConsumption());
//    System.out.println(thermy.getStatus());
//
//    System.out.println(lampy.getConsumption());
//
//    thermy.setTemperature(50);
//    System.out.println(thermy.getTemperature());
//
//    secy.turnOn();
//    secy.turnOnFilming();
//    System.out.println(secy.getConsumption());
//
//    lampy.turnOn();
//    lampy.setBrightness(0);
//    lampy.setBrightness(100);
//    lampy.setBrightness(150);
//    System.out.println(lampy.getBrightness());


  }
}
