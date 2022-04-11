
package tugas1;

import java.util.Scanner;

public class SaldoNasabah {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
      double tabungan= sc.nextDouble();
      double setoran = sc.nextDouble();
     
    saldoNasabah (tabungan,setoran);
     }

    private static void saldoNasabah(double tabungan, double setoran) {
        double administrasi= tabungan + setoran - 7000;
        double bonus= administrasi * 0.0005;
        double sisaSaldo = administrasi+ bonus;
        
        System.out.println(sisaSaldo);
    }
}
