package SimpleClassesAndObjects.Task6;

public class TimeClock {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeClock(int hours, int minutes, int seconds) {
        if (hours < 24 && hours > 0) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }

        if (minutes < 60 && minutes > 0) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }

        if (seconds < 60 && seconds > 0) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }

        System.out.printf("New clock was created %d:%d:%d", this.hours, this.minutes, this.seconds);
    }

    public static void main(String[] args) {
        TimeClock timeClock = new TimeClock(23, 12, 34);
        timeClock.setHours(12);
        timeClock.setMinutes(12);
        timeClock.setSeconds(59);
        System.out.println();

        System.out.printf("%d:%d:%d", timeClock.getHours(), timeClock.getMinutes(), timeClock.getSeconds());
        System.out.println();

        timeClock.setNewTime(12, 12, 59);
        System.out.println();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 24 && hours > 0) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 60 && minutes > 0) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 60 && seconds > 0) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public void setNewTime(int hours, int minutes, int seconds) {
        if (hours < 24 && hours > 0) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }

        if (minutes < 60 && minutes > 0) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
        if (seconds < 60 && seconds > 0) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
        System.out.printf("New time was set %d:%d:%d", this.hours, this.minutes, this.seconds);
    }
}
