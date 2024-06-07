/*
 * we have to print binary digits alternatively in each row and column as shown in the examples. Let’s say that the first row 
 * starts with the binary digit ‘1’, the second row must start with ‘0’ and then the 3rd row with ‘1’ again, and so on. Similar
 *  is the case for the columns as well. Initially, we declare a start variable and set it to 1 for the first row. For even no. of 
 * rows, the start variable is 1 and for odd it is 0. Now for the inner loop, the numbers are printed i times (i is the row index) 
 * alternatively by simply subtracting the start variable 
 * from 1 after each iteration.
 */
public class pattern11 {
    public static void pattern(int N){
        int start=1;
        for (int i=0;i<N;i++){
            if(i%2==0){
                start=1;
            }
            else {
                start=0;
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N=5;
        pattern(N);
    }
}
