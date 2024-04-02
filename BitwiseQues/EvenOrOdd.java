
public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 64;
        if(isOdd(n)){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }

    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
