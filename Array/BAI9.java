package Array;

import java.util.Scanner;

public class BAI9 {

    public static void main (String[] args)
    {
        int n, m;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Nhap so hang:");
        n = sc.nextInt();
        System.out.println("Nhap so cot:");
        m = sc.nextInt();
        int nm = n*m;
        int A[] = new int[nm];

        for (int i = 0; i < nm; i++) {
            System.out.println("Nhap gia tri A["+i+"]:");
            A[i] = sc.nextInt();
        }

        for(int i = 0 ; i < nm ; i++){
            for(int j = i+1 ; j < nm ; j++){
                if(A[i] > A[j]){
                    int x = A[j];
                    A[j] = A[i];
                    A[i] = x;
                }
            }
        }


        //        for(int i = 0 ; i <= n ; i++){
//            for(int j = 0 ; j <=m ; j++){
//                if(A[i][j] > A[i+1][j+1]){
//                    int tmp = A[i+1][j+1];
//                    A[i+1][j+1] = A[i][j];
//                    A[i][j] = tmp;
//                }
//            }
//        }
        System.out.println("Ma tran duoc sap xep");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(A[i*m+j]+" ");
            }
            System.out.println();
        }
    }

}


