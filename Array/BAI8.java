package Array;

import java.util.Scanner;

public class BAI8 {

    public static int[][] Nhapmatran(int m, int n, Scanner sc){
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j =0; j < n; j++){
                x[i][j] = sc.nextInt();
            }
        }return x;
    }


    public static void Hienthi(int[][] x){
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x[0].length; j++){
                System.out.printf("%5d", x[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] Nhan2matran(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++){
                for (int l = 0; l < k; l++){
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }return c;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, k;
        int[][] a, b, c;
        System.out.println("Nhap cap ma tran a :");

        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Nhap so cot ma tran b");
        k = sc.nextInt();
        System.out.println("Nhap ma tran a: ");
        a = Nhapmatran(n, k, sc);
        System.out.println("Nhap ma tran b: ");
        b = Nhapmatran(n, k, sc);
        System.out.println("Ma tran a:");
        Hienthi(a);
        System.out.println("Ma tran b:");
        Hienthi(b);
        System.out.println("Kết quả: ");
        c = Nhan2matran(a, b);
        Hienthi(c);

    }

}
