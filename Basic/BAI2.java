import java.util.Scanner;

public class BAI2 {
    public void ListUocso(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        int cout=0;
        System.out.print("Danh sach cac uoc cua n : ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(" "+i);
                cout++;
            }

        }
        System.out.println();
        System.out.print("So luong cac uoc cua n : "+cout);
    }
    public static void main(String[] args) {
        BAI2 b2=new BAI2();

        b2.ListUocso();
    }
}
