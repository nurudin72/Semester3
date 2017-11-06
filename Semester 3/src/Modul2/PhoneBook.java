/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Nurudinh72
 */
public class PhoneBook {
      public static void main(String [] args){
        LinkedList<Data> list=new LinkedList<Data>();
        int tambah;
        Scanner input1 = new Scanner(System.in);
        do{
 System.out.println("Aplikasi phonebook");
            System.out.println("1. Tambah Kontak Baru");
            System.out.println("2. Hapus Salah Satu Kontak");
            System.out.println("3. Tampilkan Semua Kontak");
            System.out.print("Pilih salah satu : ");
            int pilih = input1.nextInt();
            if(pilih == 1){
                
        Scanner input = new Scanner(System.in);
                System.out.print("Masukkan Nama   : ");
                String nama = input.nextLine();
                System.out.print("Masukkan Alamat : ");
                String alamat = input.next();
                System.out.print("1. No Telepon   :");
                String telp = input.next();
                System.out.print("2. No HP        :");
                String hp = input.next();
                
                list.add(new Data(nama, alamat, telp, hp));
            }
            else if(pilih == 2){
                System.out.print("Masukkan index data yang akan dihapus : ");
                int hapus = input1.nextInt();
                list.remove(hapus);
            }
            else if(pilih == 3){
                list.forEach((Data a) -> {
            
                    System.out.println("Nama : " +a.getNama() +"\nAlamat : " +a.getAlamat()+"\nNomor Telp : " +a.getTelp()+"\nNomor HP : " +a.getHp());
                    System.out.println("");
                });
            }
            System.out.println("1. Lanjut 0. Keluar");
            tambah = input1.nextInt();
        }
        while(tambah != 0);
        }
}
       
    
