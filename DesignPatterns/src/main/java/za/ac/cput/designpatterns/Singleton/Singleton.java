package za.ac.cput.designpatterns.Singleton;

public class Singleton {

    private static Singleton SingletonInstance = null;

    private Singleton() {
    }
    public static synchronized Singleton getInstance() {
        if (SingletonInstance == null) {
            SingletonInstance = new Singleton();
        }
        synchronized (Singleton.class){
            if (SingletonInstance == null) {
                SingletonInstance = new Singleton();
            }
        }
        return SingletonInstance;


    }
    public String getMessage() {
        return "Singleton Test";
    }
}


