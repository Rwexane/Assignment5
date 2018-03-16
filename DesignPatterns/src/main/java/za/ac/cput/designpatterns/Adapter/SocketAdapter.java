package za.ac.cput.designpatterns.Adapter;

public interface SocketAdapter {

    public Voltage get240Volt();
    public Voltage get12Volt();
    public Voltage get3Volt();
}
