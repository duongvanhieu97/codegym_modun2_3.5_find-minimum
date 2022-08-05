import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 12, 2, 3, 31,3, 6, 29};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
