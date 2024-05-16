import java.util.Arrays;

class MergeSort {
    public static void main(String args[]) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int arr[], int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    static void merge(int arr[], int l, int mid, int h) {
        int n1 = mid - l + 1;
        int n2 = h - mid;

        // create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        // Merge the temp arrays back into arr[l..h]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
