public class TestTime {
    public static void main(String[] args) {

        // Create two Time objects
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set times using set methods
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        // Display original times
        System.out.println("Before changes:");
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = " + t2.toString());

        // Change times
        t1.nextSecond();
        t2.previousSecond();

        // Display final times
        System.out.println("\nAfter changes:");
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = " + t2.toString());
    }
}