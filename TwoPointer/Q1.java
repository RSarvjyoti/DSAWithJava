package TwoPointer;

// Given an array of non-negative numbers and a non-negative number k, find the number of subarrays having sum less than k. We may assume that there is no overflow.

// Examples :  

// Input : arr[] = {2, 5, 6}
//         K = 10
// Output : 4
// The subarrays are {2}, {5}, {6} and
// {2, 5},

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-- > 0){
            int n = s.nextInt();
            int k = s.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n; i++){
                arr[i] = s.nextInt();
            }
            System.out.println(subarraySum(arr,n,k));
        }
    }
    // ***** Bruteforce technique ******
    static int subarraySum(int arr[], int n, int k){
        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                if(sum + arr[j] < k){
                    sum = arr[j] + sum ;
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }

    // TC is O(n^2) and SC is O(1)

    // Apply two pointer slidding window

    
}
