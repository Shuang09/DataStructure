package basic;

public class PrintN {
    public static void printN(int N){
        int i;
        for (i=1;i<N;i++){
            System.out.println(i);
        }
        return;
    }
    public static void printN2(int N){
        if (N!=0){
            printN2(N-1);
            System.out.println(N);
        }
    }

    public static void  main(String[] args) {
        //printN(1000000);
        printN2(1);
        System.out.println(1);

    }
}
