/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS181122_A;

/**
 *
 * @author User
 */
public class WarnetRecord {
    private String kode;
    private String namapelanggan;
    private int jenispelanggan;
    private double jenisbarang;
    private String tglmasuk;
    private double jamMasuk;
    private double jamkeluar;
    private double tottarif;
    private double lama;
    private double tarif;
    private double diskon;
    private double totalbyr;
    public static int warnetCount;
    
    public WarnetRecord(){
  
    }
      
    public WarnetRecord(String kode, String nama, double jenis, String tgl, int jMasuk, int jkeluar){
        //penjualanCount++;
        this.kode = kode;
        this.namapelanggan = nama;
        this.jenisbarang = jenis;
        this.tglmasuk = tgl;
        this.jamMasuk = jMasuk;
        this.jamkeluar = jkeluar;
      
    }
    
    public String getkode() {
        return kode;
    }
    
    public void setkode (String kode){
        this.kode = kode;
    }
    
    public String getnamaPelanggan() {
        return namapelanggan;
    }
    
    public void setnamaPelanggan (String nama){
        this.namapelanggan = nama;
    }
    
    public double getjenisbarang() {
        return jenisbarang;
    }
    
    public void setjenisbarang (double jenis){
        this.jenisbarang = jenis;
    }
    
    public String gettglmasuk() {
        return tglmasuk;
    }
   
    public void settglmasuk (String tgl){
        this.tglmasuk = tgl;
    }
    
    public double getjamMasuk() {
        return jamMasuk;
    }
    
    public void setjamMasuk (double jMasuk){
        this.jamMasuk = jMasuk;
    }
    
    public double getjamkeluar() {
        return jamkeluar;
    }
    
    public void setjamkeluar (double jkeluar){
        this.jamkeluar = jkeluar;
    }
    ///=================================================
    
    public double getlama(){
        
        lama = jamkeluar * jamMasuk;
        
        return lama;
    }
    
      public double gettottarif(){
        
        tottarif = lama * tarif;
        
        return tottarif;
    }
    
     public double getdiskon(){
         if(lama>2 & jenispelanggan==1){
          
           diskon = tottarif * 0.02;
         }
         else if(lama>2 & jenispelanggan==2){
             diskon = tottarif * 0.05;
         }
         
        return diskon;
    }
     
     public double gettotalbyr(){
        totalbyr = tottarif - diskon;
        return totalbyr;
    }

    String gettarif() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void settarif(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
}
