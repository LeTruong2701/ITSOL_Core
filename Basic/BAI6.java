import java.util.Scanner;

public class BAI6 {

        void phantichthuasonguyento(int n) {
            for (int i = 2; i <= n; i++) {
                while (n%i==0) {
                    System.out.print(i+" ");
                    n /= i;
                }
            }
        }

    public static void main(String args[]) {
            BAI6 b6=new BAI6();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n:");
        int n=sc.nextInt();
        System.out.print("thua so nguyen to=");
        b6.phantichthuasonguyento(n);
    }
}
