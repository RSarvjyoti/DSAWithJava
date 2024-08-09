//  find nth fibonci number

// Recursions Relation f(n) = f(n - 1) + f(n - 2)

public class P2 {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n ){

        // base
        if(n < 2){
            return n;
        }

        return fibo( n - 1) + fibo(n - 2);
    }

}
