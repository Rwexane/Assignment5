package za.ac.cput.designpatterns.Adapter;

public class Voltage {

    private int volts;
    public Voltage(int volts) {
        this.volts = volts;
    }
    public int getVolts() {
        return volts;
    }
    public void setVolts(int volts) {
        this.volts = volts;
    }
}
