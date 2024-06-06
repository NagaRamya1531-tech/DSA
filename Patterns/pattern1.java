/**
 * pattern1
 */
public class pattern1 {

    public static void pattern(int N){
        // this is the outer loop which will loop for the rows
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                //this is inner loop which here,loops for columsns as we have to print a rectangular pattern
                System.out.print("*");
            }
            //as soon as N stars are printed we move to the next row and give 
            //a line break other wise all stars would get printed in 1 line
            System.out.println();
        }
x
    }
    public static void main(String[] args) {
        int N=5;
        pattern(N);
    }
}