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
public class WarnetExamle {
    public static void main(String[] args) {
        WarnetRecord warnet1 = new WarnetRecord();
        
        warnet1.setKode(1);
        warnet1.setNamaPelanggan("Tasya");
        warnet1.setJenisPelanggan(1);
        warnet1.setTglMasuk(2);
        warnet1.setJamMasuk(5);
        warnet1.setJamKeluar(8);
        warnet1.setLama(2);
        
       warnet1.Print();
        warnet1.Pembayaran();
        
        
        
        
    }
    
    
}
