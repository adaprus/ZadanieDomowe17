import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        try {
            Season season = getSeason();
            System.out.println(Arrays.toString(season.getMonths()));
        } catch (NullPointerException e) {
            System.out.println("Wprowadź poprawną porę roku");
        }
    }

    private static Season getSeason() {
        String seasonName = null;
        Season season = null;
        Season[] seasons = Season.values();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj porę roku");
            seasonName = scanner.nextLine();
            season = Season.valueOf(seasonName);
        } catch (IllegalArgumentException e) {
            for (Season s : seasons) {
                if (s.getName().equalsIgnoreCase(seasonName)) {
                    season = s;
                }
            }
        }
        return season;
    }
}

