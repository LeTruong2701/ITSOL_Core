package Array;

import java.util.Scanner;

public class BAI2 {
    public void Sapxepmangtangdan(){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so phan tu cua mang: ");
            n=sc.nextInt();
        }while ( n<=0);
        int A[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cac phan tu trong mang:");
            A[i]=sc.nextInt();
        }

        int tmp=A[0];
        for (int i = 0; i <A.length-1; i++) {
            for (int j = i+1; j <A.length ; j++) {

                if (A[i]>A[j]) {
                    tmp=A[j];
                    A[j]=A[i];
                    A[i]=tmp;
                }
            }
        }

        System.out.println("Mang da duoc sap xep:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" "+A[i]);
        }

    }
    public static void main(String[] args) {

        BAI2 b2=new BAI2();
        b2.Sapxepmangtangdan();
    }
}
