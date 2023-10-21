import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int arr[]) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            System.out.println("-" + Arrays.toString(arr)); 

            if (!swapped) {
                break;
            }
        }

        return arr;
    }
}
