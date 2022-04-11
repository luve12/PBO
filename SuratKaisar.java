package tugas1;

import java.util.Scanner;


public class SuratKaisar {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String teks = sc.nextLine();
        int pergeseran = sc.nextInt();
        int nAlfabet = teks.length();
        
        System.out.print(perulangan( teks , pergeseran , nAlfabet));
      }
    static String perulangan( String teks , int pergeseran ,int nAlfabet){
      String hasil = "";  
      int i = 0;
        while (i < nAlfabet) {

            int x = teks.charAt(i);

            if (x == 32) {
                hasil = hasil + " ";
            } else if (x >= 65 && x <= 90) {
                x = x + pergeseran;
                if (x > 90) {
                    x -= 26;
                    hasil  = hasil  + (char) x;
            } else {
                    hasil  = hasil  + (char) x;
                }
            } else if (x >= 97 && x <= 122) {
                x = x + pergeseran;
                if (x > 122) {
                    x -= 26;
                    hasil  = hasil + (char) x;
            } else {
                    hasil  = hasil + (char) x;
                }
            }
            i++;
        }
        return hasil;
    }
}