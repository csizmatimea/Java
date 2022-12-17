package JavaCore;

public class Racecar extends Car{
String crossBracing ="";
String system ="";

    public Racecar(String manufacturer, String model, String colour, int passengerNumber, boolean selfDrive) {
        super(manufacturer, model, colour, passengerNumber, selfDrive);
        this .crossBracing = crossBracing;
        this.system = system;
    }
    public String getCrossBracing() {
        return crossBracing;
    }
    public String getSystem(){
        return system;
    }
    public void races(){
        boolean Racecar;
        System.out.println(getModel());
    }


}
