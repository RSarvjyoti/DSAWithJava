public class FindUniqe{
    public static void main(String args[]){
      
        int arr[] = {1,2,3,4,9,8,7,4,3,5,2,1,5,7,8}; // 9
        System.out.println("Uniqe value : "+fintUnique(arr));
    }

    static int fintUnique(int arr[]){
        int Uniqe = 0;

        for(int n : arr){
            Uniqe ^= n;
        }

        return Uniqe;
    }
}


// TC = O(1);
//SC = O(1);