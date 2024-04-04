// public class BubbleSort {
//   public static void main(String[] args) {
//     int arr[] = {2,2,2,1,1,1,1,1,0,0,0,0};
//     int n = arr.length;

//     bubbleSort(arr, n);

//     for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }

//   }

//   static void bubbleSort(int arr[], int n){

//     for(int i=0;i<n-1;i++){
//         for(int j=0;j<n-i-1;j++){
//             if(arr[j] > arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//         }
//     }

//   }

// }

// How many number of swaps required 

public class BubbleSort {
    public static void main(String[] args) {
      int arr[] = {2,2,2,1,1,1,1,1,0,0,0,0};
      int n = arr.length;
  
      bubbleSort(arr, n);
  
      for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
      }
  
    }
  
    static void bubbleSort(int arr[], int n){
  
      for(int i=0;i<n-1;i++){
        int count_swaps = 0;
          for(int j=0;j<n-i-1;j++){
              if(arr[j] > arr[j+1]){
                  count_swaps++;
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
          }

          if(count_swaps == 0){
            break;
          }
      }
  
    }
  
  }
