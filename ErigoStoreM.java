
package erigostorem;

import java.util.Scanner;

public class ErigoStoreM {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner (System.in);
        System.out.println("=============================");
        System.out.println("|   Jenis baju  |   Harga   |");
        System.out.println("=============================");
        System.out.println("|       a       |   100000  |");
        System.out.println("|       b       |   125000  |");
        System.out.println("|       c       |   175000  |");
        System.out.println("-----------------------------");
        
        String jenis = sc.nextLine();
        int jumlah = sc.nextInt();
        
        Baju baju = new Baju (jenis, jumlah);
        baju.display();
    }
}
class Baju{
    String jenis;
    int harga;
    int jumlah;
    public Baju(String a, int b){
        this.jenis  = a;
        this.jumlah = b;
    }
    
    final int baju_a = 100000;
    final int baju_b = 125000;
    final int baju_c = 175000;

    void harga_a(){
        if(jumlah > 100){
        harga = 95000;
        }else
        harga = baju_a;
    }

    void harga_b(){
        if (jumlah > 100){
        harga = 120000;
        }else
        harga = baju_b;
    }

    void harga_c(){
        if (jumlah > 100){
        harga = 160000;
        }else
        harga = baju_c;
    }

    void display(){
        if(jenis.equalsIgnoreCase("a")) {
            harga_a();
            
        }else if(jenis.equalsIgnoreCase("b")) {
            harga_b();
            
        }else if(jenis.equalsIgnoreCase("c")){
            harga_c();
        }

        System.out.println("Jenis yang anda beli    : " + jenis);
        System.out.println("Harga per buah          : " + harga);
        System.out.println("Total harga             : " + harga*jumlah);

    }
}
