public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Get methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Set methods
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Set full time
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Advance by 1 second
    public Time nextSecond() {
        second++;

        if (second == 60) {
            second = 0;
            minute++;

            if (minute == 60) {
                minute = 0;
                hour++;

                if (hour == 24) {
                    hour = 0;
                }
            }
        }

        return this;
    }

    // Go back by 1 second
    public Time previousSecond() {
        second--;

        if (second < 0) {
            second = 59;
            minute--;

            if (minute < 0) {
                minute = 59;
                hour--;

                if (hour < 0) {
                    hour = 23;
                }
            }
        }

        return this;
    }

    // Display time in hh:mm:ss format
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}