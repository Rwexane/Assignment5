package za.ac.cput.designpatterns.AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory( String choice){
        if(choice.equalsIgnoreCase("Sport")){
            return new SportFactory();
        }
        return null;
    }
}
