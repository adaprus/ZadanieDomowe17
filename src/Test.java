import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seasonName;
        Season season = null;
        Season[] seasons = Season.values();
        System.out.println("Podaj porę roku w języku polskim");
        seasonName = scanner.nextLine();
        List<Season> seasonList = new ArrayList<>();
        Collections.addAll(seasonList, seasons);

        for(Season s : seasonList){
            if(s.getName().equalsIgnoreCase(seasonName)){
                season = s;
            }
        }

        if(seasonList.contains(season)) {
            System.out.println(Arrays.toString(season.getMonths()));
        } else {
            System.out.println("Nie ma takiej pory roku");
        }
    }
}

