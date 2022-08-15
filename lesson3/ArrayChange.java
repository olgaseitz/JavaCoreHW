package lesson3;

public class ArrayChange {
    public static void main(String[] args) {

        String arr1[] = {"Q", "W", "E", "R", "T"};
        System.out.println(arr1[0] + ", " + arr1[3]);
        change(arr1, 0, 3);
        System.out.println(arr1[0]+ ", " + arr1[3]);

    }

    public static <T> void change(T[] arr, int from, int to){
        T temp = arr[to];
        arr[to] = arr[from];
        arr[from] = temp;
    }
}
