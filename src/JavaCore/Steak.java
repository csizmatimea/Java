package JavaCore;

public class Steak {

    private String type;
    private int time;
    private String mode;
    private String spice;
    private String marinade;

    public Steak(String type, int time, String mode, String spice, String marinade) {
        this.type = type;
        this.time = time;
        this.mode = mode;
        this.spice = spice;
        this.marinade = marinade;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getSpice() {
        return spice;
    }

    public void setSpice(String spice) {
        this.spice = spice;
    }

    public String getMarinade() {
        return marinade;
    }

    public void setMarinade(String marinade) {
        this.marinade = marinade;
    }

    @Override
    public String toString() {
        return "Steak{" +
                "type='" + type + '\'' +
                ", time=" + time +
                ", mode='" + mode + '\'' +
                ", spice='" + spice + '\'' +
                ", marinade='" + marinade + '\'' +
                '}';
    }
}
