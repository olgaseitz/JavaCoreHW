package lesson1;

import java.util.Random;

public class Course {
    public int[] obstacles;

    public Course(int obstaclesNumber) {
        obstacles = new int[obstaclesNumber];
        Random random = new Random();
        for (int i = 0; i < obstacles.length; i++){
            obstacles[i] = random.nextInt(7);
        }
    }

    public void doIt(Team team){
        for (Player p: team.players) {
            Boolean passed = false;
            for (int i: obstacles) {
                passed = (p.power >= i)? true : false;
                if (passed == false) break;
            }
            p.Passed = passed;
        }
    }

    public void listObstacles(){
        System.out.print("Препятствия: ");
        for (int i: obstacles) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
