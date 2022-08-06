package lesson1;

import java.util.Random;

public class Team {

    public String nameTeam;
    public Player[] players;


    public Team(String nameTeam, String[] names) {
        this.nameTeam = nameTeam;
        this.players = new Player[names.length];
        Random random = new Random();
        for (int i = 0; i < names.length; i++){
            this.players[i] = new Player(names[i], random.nextInt(9));
        }
    }


    public void result(){
        for (Player p: players) {
            if (p.Passed)
                System.out.println(p.name + " уровня: " + p.power + " прошел полосу препятствий");
        }
    }
    public void info() {
        for(Player p: players) {
            System.out.println(nameTeam + " " + p.name + " уровня: " + p.power);
        }
    }
}
