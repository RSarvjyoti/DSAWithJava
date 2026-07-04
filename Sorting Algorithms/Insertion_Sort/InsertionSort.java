class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {14,9,15,12,6,8,13};
        int n = arr.length;
        insertionSort(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    static void insertionSort(int arr[], int n){
        for(int i=0; i<n; i++){
            /*storing current element whose left side is checked for its 
             correct position .*/
            int temp = arr[i];
            int j = i;
             /* check whether the adjacent element in left side is greater or
            less than the current element. */
            while (j>0 && temp<arr[j - 1]) {
                // moving the left side element to one position forward.
                arr[j] = arr[j - 1];
                j--;
            }
            // moving current element to its  correct position.
            arr[j] = temp;
        }
    }
}