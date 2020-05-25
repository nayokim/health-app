public class AppTest {
    public static void main(String[] args) {
        Input input = new Input();

        while (true) {
            System.out.println("1. View log \n" +
                    "2. Enter daily values \n" +
                    "3. Delete Entry \n" +
                    "4. Exit \n " +
                    "Choose an option (1, 2, 3, or 4) :");
            int option = input.getInt(1, 4);
            switch (option) {
                case 1:
                    FilesUtils.readFile();
                    break;
                case 2:
                    double dailyWeight = Double.valueOf(input.getString("Enter your daily weight"));
                    double caloriesIntake = Double.valueOf(input.getString("Enter your Caloric Intake for the day"));
                    String food = input.getString("What did you eat today? (LIST ALL FOODS!DONT LIE! THIS IS FOR YOU!)");
                    General general = new General(dailyWeight,caloriesIntake, food);
                    FilesUtils.writeFile(general);

                case 3:

            }
        }
    }
}
