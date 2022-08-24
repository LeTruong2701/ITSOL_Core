import java.util.Scanner;

public class BAI1 {
    public void Tinhtongcaua(){
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        if(n%2!=0){
            for(int i=1;i<=n;i+=2){
                sum+=i;
            }
            System.out.println("N la so le ");
            System.out.println("Tong cac so le tu 1 den n: "+sum);
        } else if (n%2==0) {
            for(int i=2;i<=n;i+=2){
                sum+=i;
            }
            System.out.println("N la so chan ");
            System.out.println("Tong cac so chan tu 1 den n: "+sum);
        }
    }
    public void Tinhtongcaub(){
        float sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum+=1/(float)i;
        }
        System.out.println("Tong la: "+sum);

    }
    public static void main(String[] args) {
        BAI1 b1=new BAI1();
        System.out.println("Bai 1 cau a");
        b1.Tinhtongcaua();
        System.out.println("Bai 1 cau b");
        b1.Tinhtongcaub();

    }
}
