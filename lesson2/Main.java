package lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {
                {"6", "1", "4", "5"},
             // {"6", "1", "4", "5"},
                {"5", "8", "4", "4"},
                {"1", "2", "9", "3"},
                {"3", "4", "A", "6"}
        };
        try {
            try {
                int result = toIntAndSum(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не равен 4х4!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке массива: " + e.i + "x" + e.j);
        }

    }

    public static int toIntAndSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
