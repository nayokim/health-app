public class InspirationalQuotes {
    public static String [] quotes ={
            "You gotta do this for you",
            "Struggle is inevitable",
            "You won't always be motivated, that's why you have to learn to be disciplined",
            "Don't count the days. Make the day's count."
    };

    public static String randomQuotes(String[] arr) {
        int random = (int) (Math.random() * (arr.length-1) + 1);
        return arr[random];
    }

    public static void getQuotes (){
        System.out.println(randomQuotes(quotes));
    }



}
