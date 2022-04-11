package tugas2;

import java.util.Scanner;

public class MengitungLuasOOP {
    
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                Persegi persegis = new Persegi(sc.nextByte());
                System.out.println(persegis.luas());
                break;
            case 2:
                Segitiga segitigas = new Segitiga(sc.nextByte(), sc.nextByte());
                System.out.println(segitigas.luas());
                break;
            case 3:
                Lingkaran lingkarans = new Lingkaran(sc.nextDouble());
                System.out.println(lingkarans.luas());
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}
 class Persegi{
    private int sisi;
    Persegi(byte sisi){
        this.sisi = sisi;
    }
    int luas(){
        return sisi*sisi;
    }
}
class Segitiga{
    private int alas;
    private int tinggi;
    Segitiga(byte alas, byte tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    int luas(){
        return (alas*tinggi)/2;
    }
}
class Lingkaran{
    private double r;
    Lingkaran(double r){
        this.r = r;
    }
    double luas(){
        if (r%7==0) {
            return 22/7*r*r;
        } else {
            return Math.floor (3.14*r*r);
        }
    }
}
