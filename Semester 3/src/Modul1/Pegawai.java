/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;

/**
 *
 * @author Nurudinh72
 */
public class Pegawai {
    public String nama;
    public String jabatan;
    public int gaji;

    public double  lamaKerja;
    Pegawai(String nama, String jabatan, double lamaKerja){
        this.nama = nama;
        this.jabatan = jabatan;
        this.lamaKerja = lamaKerja;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setJabatan(String jabatan){
        this.jabatan=jabatan;
    }
    public String getJabatan(){
        return jabatan;
    }
    public void setLamaKerja(double lamaKerja){
        this.lamaKerja=lamaKerja;
    }
    public double getLamaKerja(){
        return lamaKerja;
    }
    
    public int gaji(){
        return 0;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public int getGaji() {
        return gaji;
    }

}
