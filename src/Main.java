// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("A jelenlegi hónap: " + Month.JUNE);

        for (Month month : Month.values()) {
            System.out.println(month.getMonthNumber() + ". honap: " + month.getHungarianName());
        }
        for (Season season : Season.values()) {
            System.out.println(season);
            }

        System.out.println(Month.randomMonth().toString().toLowerCase());
    }
}