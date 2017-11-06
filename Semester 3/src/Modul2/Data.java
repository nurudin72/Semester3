/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

/**
 *
 * @author Nurudinh72
 */
public class Data {
    private String nama;
    private String alamat;
    private String nomor;
    private String telp;
    private String hp;
    
    public Data(String nama,String alamat,String nomor){
        this.nama = nama;
        this.alamat = alamat;
        this.nomor  = nomor;
    }
    public Data(String nama,String alamat,String telp, String hp){
        this.nama = nama;
        this.alamat = alamat;
        this.telp  = telp;
        this.hp = hp;
    }
        

    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getNomor() {
        return nomor;
    }
    public String getTelp() {
        return telp;
    }
    public String getHp() {
        return hp;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }    
    public void setTelp(String telp) {
        this.telp = telp;
    }
    public void setHp(String hp) {
        this.hp = hp;
    }

}
