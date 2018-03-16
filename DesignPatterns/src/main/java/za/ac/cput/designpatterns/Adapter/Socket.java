package za.ac.cput.designpatterns.Adapter;

public class Socket {

    public Voltage getVoltage(){
        return new Voltage(240);
    }
}
