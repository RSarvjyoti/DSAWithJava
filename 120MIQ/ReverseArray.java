class ReverseArray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int res[] = reverse(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

    // Bruteforce Approach : TC = O(n), SC = O(n)
    static int[] reverse(int arr[]){
        int res[] = new int[arr.length];
        int j = 0;
        for(int i = arr.length- 1; i>=0; i--){
            res[j] = arr[i];
            j++;
        }

        return res;
    }

    // Two pointer swap them : TC = O(n), SC = O(1);

    static 

}