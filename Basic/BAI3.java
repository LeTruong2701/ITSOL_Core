import java.util.Scanner;

public class BAI3 {
    public int USCLN(int a,int b){
       int ucln=0;
        if(a<b){
            for(int i=a;i>=1;i--){
                if(a%i==0 && b%i==0){
                   ucln=i;break;
                }
            }
        }
        else {
            for(int i=b;i>=1;i--){
                if(b%i==0 && a%i==0){
                    ucln=i;break;
                }
            }
        }
        return ucln;
    }

    public int BSCNN(int a, int b){
        int sln=(a>b)?a:b;


        int bcnn=0;
        while (true){
            if(sln%a==0 && sln%b==0){
                bcnn=sln;break;
            }
            sln++;
        }
        return bcnn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BAI3 b3=new BAI3();
        System.out.print("Nhap a : ");
        int a=sc.nextInt();
        System.out.print("Nhap b : ");
        int b=sc.nextInt();
        System.out.println("USCLN : "+b3.USCLN(a,b));
        System.out.println("BCNN : "+b3.BSCNN(a,b));
    }
}
