public class pattern16{
    public static void pattern(int N){
        for(int i=0;i<N;i++){
            char ch=(char)((int)('A'+i));
            for(int j=0;j<=i;j++){
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N=5;
        pattern(N);
    }
}
