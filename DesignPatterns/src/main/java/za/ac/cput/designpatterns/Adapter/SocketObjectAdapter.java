package za.ac.cput.designpatterns.Adapter;

public class SocketObjectAdapter  implements SocketAdapter {

    private Socket sock = new Socket();

    public Voltage get240Volt()
    {
        return sock.getVoltage();
    }

    public Voltage get12Volt()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 10);
    }

    public Voltage get3Volt()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 40);
    }

    private Voltage convertVolt(Voltage v, int i)
    {
        return new Voltage(v.getVolts() / i);
    }
}
