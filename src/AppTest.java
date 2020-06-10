public class AppTest {
    public static void main(String[] args) {
        Input input = new Input();

        while (true) {
            System.out.println("1. View log \n" +
                    "2. Enter daily values \n" +
                    "3. Delete Entry \n" +
                    "4. Exit \n ");
            int option = input.getInt(1, 4);
            switch (option) {
                case 1:
                    FilesUtils.readFile();
                    break;
                case 2:
                    String date = input.getString("What is the date?");
                    int dailyWeight = Integer.parseInt(input.getString("Enter your daily weight"));
                    int caloriesIntake = Integer.parseInt(input.getString("Enter your Caloric Intake for the day"));
                    String food = input.getString("What did you eat today? (LIST ALL FOODS!DONT LIE! THIS IS FOR YOU!)");
                    General general = new General(date, dailyWeight,caloriesIntake, food);
                    FilesUtils.writeFile(general);
                    break;

                case 3:
                    FilesUtils.readFile();
                    String deleteLine = input.getString("Which date would you like to delete?");
                    FilesUtils.deleteEntry();
                    break;

                case 4:
                    System.out.println("This is for you!\nHere is your Quote of the day:\n");
                    InspirationalQuotes.getQuotes();
                    System.exit(0);
            }
        }
    }
}
