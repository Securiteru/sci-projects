import smartdevices.*;

public class HostDeviceController {

  private SmartObjects[] Smarties = new SmartObjects[10];

  public HostDeviceController() {
    Smarties[0] = new Thermostat();
    Smarties[1] = new Thermostat();
    Smarties[2] = new Thermostat();
    Smarties[3] = new Thermostat();
    Smarties[4] = new Thermostat();
    Smarties[5] = new Lamp();
    Smarties[6] = new Lamp();
    Smarties[7] = new Lamp();
    Smarties[8] = new SecurityCamera();
    Smarties[9] = new SecurityCamera();
  }

  public void turnAllOn() {

    for (SmartObjects s : Smarties) {
      if (s != null) {
        s.turnOn();
      }
    }

  }

  public void turnAllOff() {
    for (SmartObjects s : Smarties) {
      if (s != null) {
        s.turnOff();
        System.out.println(s.getStatus());
      }
    }

  }

  public float getConsumptionAll() {
    float consumption = 0;

    for (SmartObjects s : Smarties) {
      if (s != null) {
        consumption += s.getConsumption();
        System.out.println(s + " " + s.toString() + " " + s.getConsumption());
      }
    }
    return consumption;

  }

  public void getStateAll() {
    for (SmartObjects s : Smarties) {
      if (s != null) {
        s.getStatus();
      }
    }

  }

  public SmartObjects[] getAllDevicesArray() {
    return Smarties;
  }

  public void turnOnFilmingAll() {
    for (SmartObjects s : Smarties) {
      if (s != null && (s instanceof SecurityCamera)) {
        SecurityCamera secy = (SecurityCamera) s;
        secy.turnOnFilming();
        System.out.println(secy.getStatus());
      }
    }
  }


  public void turnOffFilmingAll() {
    for (SmartObjects s : Smarties) {
      if (s != null && (s instanceof SecurityCamera)) {
        SecurityCamera secy = (SecurityCamera) s;
        secy.turnOffFilming();
        System.out.println(secy.getStatus());
      }
    }
  }

  public void setBrightnessAndSetColor(int bright, String col) {
    for (SmartObjects s : Smarties) {
      if (s != null && (s instanceof Lamp)) {
        Lamp lampy = (Lamp) s;
        lampy.setBrightness(bright);
        lampy.setColor(col);
        System.out.println(lampy.getBrightness());
        System.out.println(lampy.getColor());
      }
    }
  }

  public void setTemperatureGlobally(int temp) {
    for (SmartObjects s : Smarties) {
      if (s != null && (s instanceof Thermostat)) {
        Thermostat thermy = (Thermostat) s;
        thermy.setTemperature(temp);
        System.out.println(thermy.getTemperature());
      }
    }
  }


}
