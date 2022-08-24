import java.util.Scanner;

public class BAI4 {

    public void Capsonguyento(int a,int b){
        for(int i=a;i<=b;i++){
            for(int j=a+1;j<=b;j++){
                if(USCLN(i,j)==1){
                    System.out.print(" "+i+","+j);
                }
                if(j==b){
                    break;
                }
            }
        }
    }

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


    public static void main(String[] args) {
        BAI4 b4=new BAI4();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a=sc.nextInt();
        System.out.print("Nhap b: ");
        int b=sc.nextInt();

        System.out.print("Cap so nguyen to cung nhau: ");
        b4.Capsonguyento(a,b);


    }
}
