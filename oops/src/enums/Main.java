package enums;

public class Main {
    public static void main(String[] args) {
        Basic.Week week;
        week = Basic.Week.Monday;
        for (Basic.Week day : Basic.Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
        System.out.println(week.ordinal());
    }
}
