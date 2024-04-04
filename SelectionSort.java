public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {9,7,6,5,4,2,1};
        int n = arr.length;

        sortArr(arr, n);

        for(int i=0;i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    static void sortArr(int arr[], int n){

        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j =i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }

    }

    // find min value
    static int findMin(int arr[], int n){
        int min = arr[0];

        for(int  i=0;i<n; i++){
            min = Math.min(min, arr[i]);
        }

        return min;
    }

}
