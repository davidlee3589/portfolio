import java.util.Scanner;

public class Sorting {
    public int[] getArray() {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 unsorted integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int[] sortArray(int[] arr) {
        // Using bubble sort algorithm
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}v