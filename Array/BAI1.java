package Array;

import java.util.Scanner;

public class BAI1 {
    Scanner sc=new Scanner(System.in);
    public void Kiemtramangdoixung(){
        Scanner sc=new Scanner(System.in);

        int n;
        do{
            System.out.print("Nhap so phan tu cua mang: ");
            n=sc.nextInt();
        }while ( n<=0);

        int k[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap gia tri cho cac phan tu cua mang: ");
            k[i]= sc.nextInt();
        }

        System.out.println("Mang da nhap la");
        for(int i=0;i<n;i++){
            System.out.print(" "+k[i]);
        }

        //kiem tra xem mang co doi xung khong
        int check=0;
        for(int i=0;i<n/2;i++){
            if(k[i]!=k[n-i-1]){
                check=1;
                break;
            }
        }
        if(check==1){
            System.out.println("Mang vua nhap khong doi xung");
        }else {
            System.out.println("Mang vua nhap doi xung");
        }

    }

    public static void main(String[] args) {
        BAI1 b1=new BAI1();
        b1.Kiemtramangdoixung();
    }
}
