public class General {

    private int startingWeight;
    private int dailyWeight;
    protected int caloricIntake;
    private int dailyAlottedCalories;
    private String foodEaten;
    private String date;

    public General(int startingWeight, int dailyWeight, int caloricIntake, int dailyAlottedCalories,String foodEaten){
        this.startingWeight = startingWeight;
        this.dailyWeight = dailyWeight;
        this.caloricIntake = caloricIntake;
        this.dailyAlottedCalories = dailyAlottedCalories;
        this.foodEaten = foodEaten;
    }

    public General (String date, int dailyWeight, int caloricIntake, String foodEaten){
        this.date = date;
        this.dailyWeight = dailyWeight;
        this.caloricIntake = caloricIntake;
        this.foodEaten = foodEaten;
        }

    public General (int dailyWeight){
        this.dailyWeight = dailyWeight;
    }


    public int getStartingWeight() {
        return startingWeight;
    }

    public void setStartingWeight(int startingWeight) {
        this.startingWeight = startingWeight;
    }

    public int getDailyWeight() {
        return dailyWeight;
    }

    public void setDailyWeight(int dailyWeight) {
        this.dailyWeight = dailyWeight;
    }

    public int getDailyAlottedCalories() {
        return dailyAlottedCalories;
    }

    public void setDailyAlottedCalories(int dailyAlottedCalories) {
        this.dailyAlottedCalories = dailyAlottedCalories;
    }

    public int getCaloricIntake(){
        return this.caloricIntake;
    }

    public int setCaloricIntake(int caloricIntake){
        return this.caloricIntake;
    }

    public String getFoodEaten(){
        return this.foodEaten;
    }

    public String getDate(){
        return this.date;
    }
}
