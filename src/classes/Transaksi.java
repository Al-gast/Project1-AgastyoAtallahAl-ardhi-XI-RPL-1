/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Transaksi {
    private String noTransaksi;
    private String namaPemesan;
    private String tanggal;
    private String noMeja;
    private ArrayList<Pesanan>pesanan;
    private double uangBayar;
    private double pajak;
    private double totalBayar;
    
    
    public Transaksi(String no_transaksi, String nm_pemesan, String tanggal, String no_meja) {}
    
    public void tambahPemesanan(Pesanan pesanan) {}
     
    public ArrayList<Pesanan> getSemuaPesanan(){ return null;}
    
    public double hitungTotalPesanan() {return 0;}
    
     public void cetakStruk() {}
}
