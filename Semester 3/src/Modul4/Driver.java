/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

import java.util.Scanner;

/**
 *
 * @author nurudin72
 */
public class Driver {

    public static void main(String[] args) {
        BinTree tre = new BinTree();
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Data Ke Dalam Binary Tree :");
        tre.insert(scan.nextInt());
        tre.insert(scan.nextInt());
        tre.insert(scan.nextInt());
        tre.insert(scan.nextInt());
        tre.insert(scan.nextInt());
        tre.insert(scan.nextInt());
        tre.insert(scan.nextInt());
//        tre.insert(5);
//        tre.insert(2);
//        tre.insert(9);
//        tre.insert(1);
//        tre.insert(4);
//        tre.insert(11);
//        tre.insert(12);
        System.out.println("Banyak Leaf : " + tre.getLeafCount());
        System.out.println("====== Route dari Root ke setiap Leaf ======");
        tre.printPaths(tre.root);
        System.out.println("====== Menampilkan data ======");
        tre.traverse(1);
        tre.traverse(2);
        tre.traverse(3);
        System.out.println("");
        System.out.println("====== Mencari data ======");
        System.out.print("Inputkan data : ");
        int car = scan.nextInt();
        System.out.println("Hasil pencarian : ");
        tre.searchPaths(car);
        System.out.println("");
        System.out.println("====== Menghapus data ======");
        System.out.print("Inputkan data : ");
        int hap = scan.nextInt();
        tre.delete(hap);
        tre.traverse(1);
        tre.traverse(2);
        tre.traverse(3);
        System.out.println("");

    }
}
