package za.ac.cput.designpatterns.AbstractFactory;

public class SportFactory extends AbstractFactory {

    @Override
    public Sports getSport(String sport) {
        if(sport.equalsIgnoreCase("Football")){
            return new Football();
        } else if(sport.equalsIgnoreCase("Cricket")){
            return new Cricket();

        }else if(sport.equalsIgnoreCase("Rugby")){
            return new Rugby();
        }
        return null;
    }
}
