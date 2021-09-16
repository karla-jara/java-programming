import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Karla");
        
        int myFirstNumber = 5;
        System.out.println("myFirstNumber = " + myFirstNumber);
    }

//    Create a function that converts 12-hour time to 24-hour time or vice versa. Return the output as a string.



    public class Challenge {
        public static String convertTime(String time) {
            try {
                time = time.replace("a", "A").replace("p", "P").replace("m", "M");
                System.out.println(time);
                DateTimeFormatter twelve = DateTimeFormatter.ofPattern("h:mm a");
                DateTimeFormatter twentyFour = DateTimeFormatter.ofPattern("H:mm");
                if (time.matches(".*[AP]M")) {
                    LocalTime pt = LocalTime.parse(time, twelve);
                    return pt.format(twentyFour);
                }
                LocalTime pt = LocalTime.parse(time, twentyFour);
                return pt.format(twelve).replace("AM", "am").replace("PM", "pm");
            }
            catch (Exception e) {
                return time;
            }
        }
}}
