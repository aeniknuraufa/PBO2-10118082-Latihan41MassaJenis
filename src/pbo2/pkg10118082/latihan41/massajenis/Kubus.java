/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118082.latihan41.massajenis;

/**
 *
 * @author
 * Nama     : Aenik Nur Aufa
 * Kelas    : IF 2
 * Nim      : 10118082
 * Deskripsi Program : Membuat Program untuk menghitung massa jenis kubus berbasis
 * object
 */
public class Kubus {
    private int sisi, massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi) {
        return (int)Math.pow(sisi, 3);
    }
    
    public int hitungMassaJenis(int parMassa, int volume) {
        return parMassa / volume;
    }
}
