public class pattern12 {
    public static void pattern(int N){
        //initial no. of spaces in row 1.
        int spaces=2*(N-1);
        // Outer loop for the number of rows.
        for(int i=1;i<=N;i++){
            // for printing numbers in each row
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // for printing spaces in each row
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // for printing numbers in each row
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            // After each iteration nos. increase by 2, thus
          // spaces will decrement by 2.
            spaces=spaces-2;
        }
    }
    public static void main(String[] args) {
        int N=5;
        pattern(N);
    }
}
