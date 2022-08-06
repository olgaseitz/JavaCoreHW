package lesson1;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Игрок 1", "Игрок 2", "Игрок 3", "Игрок 4"};
        Team team = new Team("Zenit", names);

        Course course = new Course(4);

        team.info();
        course.listObstacles();
        course.doIt(team);
        team.result();

    }
}
