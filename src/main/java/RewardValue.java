public class RewardValue {
    private double cash;
    private int miles;
    private static double RATE = .0035;

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = (int) convert_from_cash_to_miles(cash);
    }

    public RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * RATE;
    }

    public int getMilesValue(){
        return convert_from_cash_to_miles(cash);
    }

    public double getCashValue(){
        return convert_from_miles_to_cash(miles);
    }

    public int convert_from_cash_to_miles(double cash){
        return (int) (cash / RATE);
    }

    public double convert_from_miles_to_cash(int miles){
        return (double) (Math.round(miles * RATE  * 100)) / 100;
    }
}
