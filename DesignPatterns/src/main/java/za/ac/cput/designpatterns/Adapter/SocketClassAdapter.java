package za.ac.cput.designpatterns.Adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter {

    public Voltage get240Volt()
    {
        return getVoltage();
    }

    public Voltage get12Volt()
    {
        Voltage v= getVoltage();
        return convertVolt(v,20);
    }

    public Voltage get3Volt()
    {
        Voltage v= getVoltage();
        return convertVolt(v,80);
    }

    private Voltage convertVolt(Voltage v, int i)
    {
        return new Voltage(v.getVolts()/i);
    }
}
