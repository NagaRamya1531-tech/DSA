public class pattern13 {
    public static void pattern(int N){
        int num=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N=5;
        pattern(N);
    }
}
