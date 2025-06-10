public class M01Assignment1 {

    /**convert feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** convert meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // header
        System.out.printf("%-8s%-10s%-10s%-10s%n",
        "Feet", "Meters", "Meters", "Feet");
        System.out.println("-------------------------------------");
        
        // rows 1-10
        for (int i = 1; i <= 10; i++) {
            double feet = i;
            double metersFromFeet = footToMeter(feet);

            double meters = 20 + (i - 1) * 5;
            double feetFromMeters = meterToFoot(meters);

            System.out.printf("%-8.1f%-10.3f%-10.1f%-10.3f%n",
            feet, metersFromFeet,
            meters, feetFromMeters);
        }
    }
}