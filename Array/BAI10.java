package Array;

import java.util.Scanner;

public class BAI10 {
    public static void main (String[] args)
    {
        int n;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Nhap so hang va so cot:");
        n = sc.nextInt();


        int A[][] = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap gia tri phan tu thu["+i+","+j+"]:");
                A[i][j] = sc.nextInt();
            }

        }



        System.out.println("Ma tran theo thu tu tang dan");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
