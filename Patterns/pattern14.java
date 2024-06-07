public class pattern14 {
    public static void pattern(int N){
        for(int i=0;i<N;i++){
            for (char ch='A';ch<='A'+i;ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N=5;
        pattern(N);
    }
}
