//Patrycja Marucinska 42746 Lab02
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
class Player {
    String name;
    int healthPoints = 100;
    String title = "";
    boolean online = false;
    String identify() {
        return "[" + healthPoints + "] | " + title + " " + name;
    }
}
public class Main {
    static String getRandomName() {
        String[] names = {"John", "Jim", "Jack", "George", "Kevin"};
        return names[new Random().nextInt(names.length)];
    }
    static String getRandomTitle() {
        String[] titles = {"Darth Vader", "adm. Thrawn", "cpt. Gilad_Pellaeon"};
        return titles[new Random().nextInt(titles.length)];
    }
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        // Generowanie 30 graczy
        for (int i = 0; i < 30; i++) {
            Player player = new Player();
            player.name = getRandomName();
            // Przypisanie losowego tytułu tylko dla niektórych graczy
            if (new Random().nextBoolean()) {
                player.title = getRandomTitle();
            }
            // Ustalenie statusu online
            player.online = new Random().nextBoolean();

            players.add(player);
        }
        // Wypisanie aktywnych graczy
        for (Player player : players) {
            if (player.online) {
                System.out.println(player.identify());
            }
        }
    }
}
