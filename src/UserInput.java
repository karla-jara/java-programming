public class UserInput {
    public static String giveMeUserInput(String a) {
        return "User input is: " + a;
    }

//    Write a function that takes fuel (liters), fuelUsage (liters/100km), passengers, airConditioner (boolean) and returns maximum distance that car can travel.
//
//    fuel is the number of liters of fuel in the fuel tank.
//    fuelUsage is basic fuel consumption per 100 km (with the driver inside only).
//    Every additional passenger is increasing basic fuel consumption by 5%.
//    If the air conditioner is ON true, its increasing total (not basic) fuel consumption by 10%.

    public class Challenge {
        public static double totalDistance(double fuel, double fuelUsage, int passengers, boolean airConditioner) {
            double ergebnis = 0;
            double passenger = 0;
            double airconditioner = 1;
            if (airConditioner) {

                airconditioner = 1.10;
            }
            passenger = 1 + 0.05 * passengers;

            System.out.println(fuelUsage);
            System.out.println(fuel);
            ergebnis = (fuel /( fuelUsage * passenger * airconditioner)) * 100;
            return ergebnis;
        }
    }

}
