/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

import java.util.Scanner;

/**
 *
 * @author Nurudinh72
 */

public class Matrik {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        System.out.println("Inputan Matrik A");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Elemen matrik A baris ke " +(i+1)+ " kolom ke " +(j+1)+ " : ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Tampilan matrik A");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println("");
        }
        B[0][0] = A[0][0]*A[0][0]+A[0][1]*A[1][0];
        B[0][1] = A[0][0]*A[0][1]+A[0][1]*A[1][1];
        B[1][0] = A[1][0]*A[0][0]+A[1][1]*A[1][0];
        B[1][1] = A[1][0]*A[0][1]+A[1][1]*A[1][1];
        System.out.println("Hasil Kuadrat dari matrik A");
        for(int x = 0;x<2;x++){
            for(int y=0;y<2;y++){
                System.out.print(B[x][y]+" ");
            }
            System.out.println("");
        }
    }
}
