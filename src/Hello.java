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
        public static String convertTime(String t) {
            int h = Integer.parseInt((t.split(":")[0]));
            String m = (t.split(":")[1]).substring(0,2);
            if(t.contains("pm")){
                h=h<12?h+12:h;
                return ""+h+":"+m;
            }
            if(t.contains("am")){
                h=h>=12?h-12:h+12;
                return ""+h+":"+m;
            }
            return h<12?""+h+":"+m+" am":""+(h-12)+":"+m+" pm";
        }
    }}
