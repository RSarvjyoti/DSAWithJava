class PatternCode {
    public static void main(String[] args) {
        // pattern1(4, 4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(4);
        // pattern5(4);
        // pattern6(4);
        // pattern7(4);
        // System.out.println();
        // pattern8(4);
        // pattern9(4);
        // pattern10(4);
        // pattern11(4);
        // pattern12(4);
        // pattern13(4);
        // pattern14(4);
        // pattern15(4);
        // pattern16(4);
        // pattern17(4);
        // zoho(3);
        // pattern18(5);
        pattern19(5);

    }

    static void pattern1(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int row){
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

     static void pattern4(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

     static void pattern5(int row){
        for(int i=1; i<=row; i++){
            for(int j=row; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int row){
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int row){
        for(int i=0; i<row;i++){
            
            // space
            for(int j=0;j<row-i-1; j++){
                System.out.print(" ");
            }
            // star
            for(int j=0;j<2*i+1; j++){
                System.out.print("*");
            }

            // space
            for(int j=0;j<row-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    static void pattern8(int row){
        for(int i=row-1; i>=0;i--){
            
            // space
            for(int j=0;j<row-i-1; j++){
                System.out.print(" ");
            }
            // star
            for(int j=0;j<2*i+1; j++){
                System.out.print("*");
            }

            // space
            for(int j=0;j<row-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    static void pattern9(int row){
        pattern7(row);
        pattern8(row);
    }

    static void pattern10(int row){
        for(int i=1; i<row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         for(int i=1; i<=row; i++){
            for(int j=row; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern11(int row){
        for(int i=0; i<row; i++){
            int start = 1;
            if(i%2 == 0) start = 1;
            else start = 0;
            for(int j=0; j<=i; j++){
                System.out.print(start+ " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern12(int row){
        int space = 2 * (row -1);
        for(int i=1; i<=row; i++){
            // number
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            // space

            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            // number
            for(int j =i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            space = space - 2;
        }
    }

    static void pattern13(int row){
        int num = 1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    static void pattern14(int row){
        for(int i=0; i<row; i++){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern15(int row){
        for(int i=row; i>=0; i--){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

     static void pattern16(int row){
        for(int i=0; i<row; i++){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int row){
        for(int i=0; i<row;i++){
            
            // space
            for(int j=0;j<row-i-1; j++){
                System.out.print(" ");
            }
            // star
            char ch = 'A';
            for(int j=0;j<2*i+1; j++){
                System.out.print(ch);
                if(j<=(2*i+1)/2){
                  ch++;
                }else{
                    ch--;
                }
            }

            // space
            for(int j=0;j<row-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();

        }
    }
    
    static void zoho(int n) {

    int start = 1;

    for (int i = 1; i <= (2 * n - 1); i++) {

        int cols;

        // increasing then decreasing
        if (i <= n) {
            cols = i;
        } else {
            cols = 2 * n - i;
        }

        int temp = start + cols - 1;

        // print reverse numbers
        for (int j = 1; j <= cols; j++) {
            System.out.print(temp + " ");
            temp--;
        }

        start += cols;

        System.out.println();
    }
}

static void pattern18(int n){
    for(int i=0; i<n; i++){
        for(char ch = (char)('E'- i); ch<='E'; ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
}

static void pattern19(int n){
    int space = 0;
    for(int i = 0; i<n; i++){
        // star
        for(int j=1; j<=n-i; j++){
            System.out.print("*");
        }
        // space 
        for(int j=0; j<space; j++){
            System.out.print(" ");
        }
        // star
        for(int j=1; j<=n-i; j++){
            System.out.print("*");
        }
        space += 2;
        System.out.println();
    }

    // lower
    space = 2 * n - 2;
    for(int i = 1; i<=n; i++){
         // star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        // space 
        for(int j=0; j<space; j++){
            System.out.print(" ");
        }
        // star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        space -= 2;
        System.out.println();
    }
}

}
