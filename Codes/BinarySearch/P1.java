// Find the ceiling of target number in sorted array
// Examaple arr = [2, 3, 5, 9, 14, 16, 18], Target = 4 
// Output = 5 { 5 is ceiling of element }
// ceiling = smallest element in array greater then or equal to target


public class P1 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println(findCeilingElement(arr, target));
    }

    static int findCeilingElement(int arr[], int target) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if(arr[mid] > target) {
                r = mid - 1;
            }else if(arr[mid] < target) {
                l = mid + 1;
            }else{
                return arr[mid];
            }
        }

        return arr[l];

    }
}
