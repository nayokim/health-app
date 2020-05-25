public class General {

    private double startingWeight;
    private double dailyWeight;
    protected double caloricIntake;
    private double dailyAlottedCalories;
    private String foodEaten;

    public General(double startingWeight, double dailyWeight, double caloricIntake, double dailyAlottedCalories,String foodEaten){
        this.startingWeight = startingWeight;
        this.dailyWeight = dailyWeight;
        this.caloricIntake = caloricIntake;
        this.dailyAlottedCalories = dailyAlottedCalories;
        this.foodEaten = foodEaten;
    }

    public General (double dailyWeight){
        this.dailyWeight = dailyWeight;
    }


    public double getStartingWeight() {
        return startingWeight;
    }

    public void setStartingWeight(double startingWeight) {
        this.startingWeight = startingWeight;
    }

    public double getDailyWeight() {
        return dailyWeight;
    }

    public void setDailyWeight(double dailyWeight) {
        this.dailyWeight = dailyWeight;
    }

    public double getDailyAlottedCalories() {
        return dailyAlottedCalories;
    }

    public void setDailyAlottedCalories(double dailyAlottedCalories) {
        this.dailyAlottedCalories = dailyAlottedCalories;
    }

    public void getCaloricIntake(){
        this.caloricIntake = caloricIntake;
    }

    public double setCaloricIntake(double caloricIntake){
        return this.caloricIntake;
    }

    public void getFoodEaten(){
        this.foodEaten =foodEaten;
    }
}
