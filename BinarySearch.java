import java.util.*;

public class BinarySearch {
    private static int count = 0;

    public static int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int left, int right, int key) {
        count++;
        int middleElement = left + (right - left) / 2;
        if (left > right) {
            count = -1;
        }
        else if (inputArr[middleElement] == key) {
            return count;
        } else if (inputArr[middleElement] > key) {
            getBinarySearchUnsuccessfulComparisonCount(inputArr, left, middleElement - 1, key);
        } else {
            getBinarySearchUnsuccessfulComparisonCount(inputArr, middleElement + 1, right, key);
        }

        return count;
    }

    public static void main(String args[]) throws Exception {
        BinarySearch bs = new BinarySearch();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, 0, size - 1, key));
    }
}

