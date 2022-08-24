import java.util.Scanner;

public class BAI5 {
    public int Tongcacchuso(int n){

        int tong=0;
        while (n>0){
            tong+=n%10;
            n=n/10;

        }
        return tong;
    }
    public static void main(String[] args) {
        BAI5 b5=new BAI5();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        System.out.print("Tong cac chu so cua n: "+ b5.Tongcacchuso(n));

    }
}
