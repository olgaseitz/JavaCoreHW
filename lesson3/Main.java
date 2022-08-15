package lesson3;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        Box<Apple> box1 = new Box<>(apple1, apple2, apple3, apple5);
        Box<Orange> box2 = new Box<>(orange1, orange2, orange3, orange4);

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>(orange5);
        box2.transfer(box3);
        System.out.println(box3.getWeight());
        box1.add(apple4);
        System.out.println(box1.getWeight());
        box2.remove(orange5);
        System.out.println(box2.getWeight());
    }
}
