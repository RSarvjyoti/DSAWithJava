import java.util.Scanner;

public class BinarySearch{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = s.nextInt();
        System.out.println("Enter target value : ");
        int target = s.nextInt();
        System.out.println("Enter element of array : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        int res = search(arr,target,0 , n-1);
        System.out.println("Result : ");
        System.out.println("Index : "+ res);
        s.close();
    }

    static int search(int arr[], int target, int start, int end ){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return search(arr, target, start , mid - 1);
        }

        return search(arr, target, mid + 1, end);
        
    }
}