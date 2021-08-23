/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột của mảng: ");
        int m = Integer.parseInt(sc.nextLine());

        int[][] A = new int[n][m];

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        
        
        System.out.println("Mảng chuyển vị vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[j][i] + "\t");
            }
            System.out.println();
        }

    }

}
