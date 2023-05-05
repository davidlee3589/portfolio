public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        int[] unsortedArr = sorting.getArray();
        System.out.println("Unsorted array:");
        for (int i = 0; i < unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + " ");
        }

        int[] sortedArr = sorting.sortArray(unsortedArr);
        System.out.println("\nSorted array:");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
