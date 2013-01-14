package base.number;

public class BaseNumberCalculator {

    public boolean calculate(int number) {
        for(int i=2;i<number;i++){
           if (number%i==0) return false;
        }
        return true;
    }
}
