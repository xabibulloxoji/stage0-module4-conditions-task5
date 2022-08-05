package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if (year % 100 == 0 && (year / 100) % 10 != 0 && year % 400 != 0 && year % 4 == 0) {
            System.out.println("not leap");
        } else System.out.println("leap");
    }
}
