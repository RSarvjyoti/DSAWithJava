class FindMaxValue{
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,2};
        System.out.println(maxValue(arr));
    }

    static int maxValue(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}