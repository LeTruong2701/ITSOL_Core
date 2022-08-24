package Array;

import java.security.PublicKey;
import java.util.Scanner;

public class BAI6 {

    public static void Sapxep(int[]A){
        int temp=A[0];
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                }
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"");
        }

    }

    public static int[] Chen1(int[]A,int x){
        int []B=new int[A.length+1];

        for (int i = 0; i < B.length; i++) {
            if(i==B.length-1){
                B[i]=x;
            }
            else {
                B[i]=A[i];
            }

        }
        return B;
    }

    public static int[] Chen(int[]A,int k){
        int B=A.length-1;
        int C=A.length;
        int[]D=new int[C+1];
        boolean inserted=false;
        for(int i=C; i>=0;i--){
            if(B>-1 && A[B]>k){
                D[i]=A[B--];
            }else{
                if(!inserted){
                    D[i]=k;
                    inserted=true;
                }else{
                    D[i]=A[B--];
                }
            }
        }
        return D;
    }
    public static void hien(int[]A){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"");
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Nhap phan tu cua mang:");
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu A["+i+"]= ");
            A[i]=sc.nextInt();
        }
        System.out.print("Nhap phan tu k=");
        int k= sc.nextInt();
        //Sap xep tang dan

        System.out.print("Mang cu sap xep theo thu tu tang dan:");
        Sapxep(A);


        A=Chen(A,k);
        System.out.println("\nMang mơi sau khi chen van giu nguyen sap xep tang dan:");
        hien(A);

//
//        A=Chen1(A,k);
//        System.out.println("\nMang mơi sau khi chen van giu nguyen sap xep tang dan:");
//        Sapxep(A);
    }

}
