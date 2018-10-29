package Demos;

import java.util.Scanner;

public class Maximum_Subsequence_Sum {
   //穷举法
    public static int MaxSubSum1(int [] arr, int n){
        int maxSum = 0;
        int thisSum =0;
        for(int i=0; i< n;i++){
            thisSum=0;
            for (int j=i;j<n; j++){
                thisSum+=arr[j];
                if(thisSum>maxSum){
                    maxSum=thisSum;
                }
            }
        }
        return maxSum;

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String  n1 =sc.nextLine();
        int n =Integer.parseInt(n1);
        String s=sc.nextLine();
        String[] ss = s.split(" ");
        int arr[] = new  int[ss.length];
        for (int i = 0; i<ss.length;i++){
            int aa= Integer.parseInt(ss[i]);
            arr[i]=aa;
        }
       System.out.println(MaxSubSum1(arr, n));
    }
    }
