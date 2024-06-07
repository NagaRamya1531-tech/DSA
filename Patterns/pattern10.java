/**
 * we have to print only the right half of the star diamond pattern as discussed in the previous article. 
 * So, as we can observe from the examples for N = 3 we have 5 rows, and for N = 6 we have 11 rows, hence the outer loop will 
 * run for 2*N -1 times. For the inner loop where we print the stars if row no. is less than or equal to N, then we observe that 
 * the stars which are printed in each row are equal to the row index itself. But, when i becomes more than N, then the no. of stars
 *  decreases by 1 with each increasing row. So, therefore the stars printed would be 2*N - i after i becomes greater than N.


 */
public class pattern10 {
    public static void pattern(int N){
        for (int i=1;i<2*N-1;i++){

            // for first half
            int stars=i;
            //for second half'
            if (i>N) stars=(2*N-i);
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N=5;
        pattern(N);
    }
}
