package lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jackson",
                Arrays.asList(new Course("Math"),
                        new Course( "Java"),
                        new Course("Biology"),
                        new Course("English"))));

        studentList.add(new Student("Johnson",
                Arrays.asList(new Course("Math"),
                        new Course("English"),
                        new Course("Biology"))));

        studentList.add(new Student("Davidson",
                Arrays.asList(new Course("Math"),
                        new Course( "Literature"),
                        new Course("Biology"))));

        studentList.add(new Student("Kohn",
                Arrays.asList(new Course("Math"),
                        new Course( "Biology"))));

        studentList.add(new Student("Washington",
                Arrays.asList(new Course("Math"),
                        new Course( "Physics"))));

        System.out.println("\n Задание №1 ");

        System.out.println("Список уникальных курсов :\n" + studentList.stream()
                .map(s -> s.getCourses())
                .flatMap(c -> c.stream())
                .distinct()
                .collect(Collectors.toList()));

        System.out.println("\n Задание №2 ");

        System.out.println("Список трёх самых любознательных студентов: \n" + studentList.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList()));

        System.out.println("\n Задание №3 ");

        Course course = new Course("Biology");
        System.out.println("Список студентов посещяющих курс " + course + ": \n" + studentList.stream()
                .collect(Collectors.groupingBy(s -> s.getCourses().contains(course))));
        
    }
}
