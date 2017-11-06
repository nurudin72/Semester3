/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;

import java.util.Scanner;
/**
 *
 * @author Nurudinh72
 */
public class DriverClass extends Pegawai{
//     String nama1;
//     String jabatan1;
//     double lamaKer;

    public DriverClass(String nama, String jabatan, double lamaKerja) {
        super(nama, jabatan, lamaKerja);
    }
     
    @Override
    public int gaji(){
        if("Manager".equals(getJabatan()) || "manager".equals(getJabatan())){
            if(getLamaKerja() < 2){     
        gaji=5;   
            }else if(getLamaKerja() >= 2 && getLamaKerja() < 5){     
        gaji=10;   
            }else if(getLamaKerja() >= 5){     
        gaji=20;   
            }
        }else if("Supervisor".equals(getJabatan()) || "supervisor".equals(getJabatan())){
            if(getLamaKerja() < 2){     
        gaji=4;   
            }else if(getLamaKerja() >= 2 && getLamaKerja() < 5){     
        gaji=8;   
            }else if(getLamaKerja() >= 5){     
        gaji=16;    
          }
        }if("Karyawan".equalsIgnoreCase(getJabatan()) || "supervisor".equals(getJabatan())){
            if(getLamaKerja() < 2){     
        gaji=3;   
            }else if(getLamaKerja() >= 2 && getLamaKerja() < 5){     
        gaji=6;   
            }else if(getLamaKerja() >= 5){     
        gaji=12;    
            }
        }
    
        return 0;
    }
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Nama Pegawai : ");
    String nama=input.next();
    System.out.print("Masukkan Jabatan Pegawai : ");
    String jabatan=input.next();
    System.out.print("Masukkan Lama Kerja : ");
    double lamaKerja=input.nextDouble(); 
    
    DriverClass staff = new DriverClass(nama, jabatan, lamaKerja);
    staff.gaji();
    
    System.out.println("");
    System.out.println("Gaji Karyawan PT. DNZ");   
        
    System.out.println("Nama Pegawai : "+staff.getNama());
    System.out.println("Jabatan      : "+staff.getJabatan());
    System.out.println("Lama Kerja   : "+staff.getLamaKerja()+" Tahun ");
    System.out.println("Gaji Yang Diterima : "+staff.getGaji()+" Juta ");
    }
}
