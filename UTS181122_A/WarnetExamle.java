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
     public static void main( String[] args ){
         
         WarnetRecord warnet1 = new WarnetRecord();
         
          //student1.setName("Denis");

         warnet1.setkode("01D67Ha");
         warnet1.setnamaPelanggan("Tasya");
         warnet1.settglmasuk("18.11.2022");
         warnet1.setjamMasuk(14.00);
         warnet1.setjamkeluar(18.00);
         warnet1.settarif(200);
         
         
         //System.out.println("Nama        :"+student1.getName());
         System.out.println("No Kode = "+warnet1.getkode());
         System.out.println("Nama Pelanggan = "+warnet1.getnamaPelanggan());
         System.out.println("Tanggal Masuk = "+warnet1.gettglmasuk());
         System.out.println("Harga = "+warnet1.gettarif());
         System.out.println("Lama = "+warnet1.getlama());
         System.out.println("Total Harga = "+warnet1.gettottarif());
         System.out.println("Diskon = "+warnet1.getdiskon());
         System.out.println("Total Bayar = "+warnet1.gettotalbyr());
         
         
         
         
         
         
         
     }
    
    
}
