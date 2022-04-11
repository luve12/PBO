
package tugas1;

import java.util.*;

public class MenghitungLuas {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        int segetiga, tinggi, alas;
        int persegi, sisi;
        int lingkaran, jari;
        
        
        int pilihan = sc.nextInt();      
        
        switch (pilihan) {
            case 1:
                sisi = sc.nextInt();
                persegi(sisi);
                break;
            case 2:
                tinggi = sc.nextInt();
                alas = sc.nextInt();
                segitiga( tinggi, alas );
                break;
            case 3:
                jari = sc.nextInt();
                lingkaran(jari);
                break;
            default:
                System.out.print("Input yang anda masukan tidak sesuai");
                break;
        }
    }
    
    
          static void persegi ( int sisi ){
         
         
         int rumus = sisi*sisi;
         
         System.out.print(rumus);
     }
    
     static void segitiga ( int tinggi, int alas ){
         
         int rumus = alas*tinggi*1/2;
         
         System.out.print(rumus);
     }
    
    static void lingkaran (int jari){
        
        if (jari == 7){
        double rumus = 22/7*jari*jari;
        int hasil = (int) rumus;
            
            System.out.print((double)hasil);
        }
        else {
            double rumus = 3.14*jari*jari;
            int hasil = (int) rumus;
            
            System.out.print((double) hasil);
        }
    }
}
