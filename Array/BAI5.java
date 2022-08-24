package Array;

import java.util.Scanner;

public class BAI5 {
    public void Chenmang() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Nhap so phan tu trong mang a:");
            n = sc.nextInt();
        } while (n < 0);
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu A[" + (i + 1) + "]:");
            A[i] = sc.nextInt();
        }

        int m;

        do {
            System.out.println("Nhap so phan tu trong mang a:");
            m = sc.nextInt();
        } while (m < 0);
        int B[] = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap gia tri phan tu B[" + (i + 1) + "]:");
            B[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        BAI5 b5=new BAI5();
       b5.Chenmang();
    }
}
