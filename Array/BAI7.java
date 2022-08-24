package Array;

import java.util.Scanner;

public class BAI7 {

    public void Nhapmang(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n=sc.nextInt();
        int[]A=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu A[ "+i+" ]=");
            A[i]=sc.nextInt();
        }
        Duongchay(A);
    }
    public static void Hienthi(int[]A, int[]B){
        int max=0;
        for(int x:B){
            if(x>max){
                max=x;
            }
        }
        System.out.print("Mang A[]: ");
        for(int x:A)
            System.out.println(x+"");
        int vt=0;
        for(int x:B){
            if(x==max)
                System.out.println("Vi tri: "+vt+" do dai "+max);
            vt+=x;
        }
    }
    public static void Duongchay(int[]A){
        int index=0;
        int[]B=new int[A.length];
        for(int i=0;i<A.length-1;i++){
            if(A[i+1]<A[i]){
                B[index]++;
                index++;
            }else{
                B[index]++;
            }
        }
        Hienthi(A,B);
    }

    public static void main(String[] args) {
        BAI7 b7=new BAI7();
        b7.Nhapmang();
    }
}
