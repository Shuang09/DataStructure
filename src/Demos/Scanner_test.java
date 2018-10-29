package Demos;

import java.util.Scanner;

public class Scanner_test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String ss[] = s.split(" ");
            int arr[] = new  int[ss.length];
            for (int i = 0; i<ss.length;i++){
                int aa= Integer.parseInt(ss[i]);
                arr[i]=aa;
            }
            for(int p = 0; p <arr.length; p++){
                System.out.println(arr[p]+ " ");
            }
        }
    }
