package za.ac.cput.designpatterns.Strategy;

public class StrategyContext {

    private Strategy strategy;

    public StrategyContext( Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy( double finalMark){
        return(strategy.calculateGrade(finalMark));
    }
}
