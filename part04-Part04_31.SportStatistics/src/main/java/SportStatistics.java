
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        ArrayList<Game> games = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            int numberOfGames = 0;
            int wins = 0;
            int losses = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeGoals = Integer.valueOf(parts[2]);
                int awayGoals = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, awayTeam, homeGoals, awayGoals));
            }

            for (Game game : games) {

                String homeOrAway = game.getHomeOrAway(team);
                
                if (homeOrAway.equals("did not play")) {
                    continue;
                }
                
                numberOfGames += 1;
                
                boolean result = game.getResult(homeOrAway);
                
                if (result) {
                    wins += 1;
                } else {
                    losses += 1;
                }
            }
            
            System.out.println("Games: " + numberOfGames);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
