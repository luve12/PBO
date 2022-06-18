package Inheritance;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
Manusia mns1 = new Manusia("Samuel", "1905622022",
true, true);
Manusia mns2 = new Manusia("Sari", "0306742022",
false, true);
Manusia mns3 = new Manusia("Sasa", "0706812022",
false, false);
ArrayList<Manusia> output = new
ArrayList<Manusia>();
output.add(mns1);
output.add(mns2);
output.add(mns3);
System.out.println("========== DAFTAR MANUSIA
==========");
for(int i=0;i<output.size();i++){
System.out.println(output.get(i).toString());
}
System.out.println("===================================
==");
MahasiswaFilkom mhs1 = new
MahasiswaFilkom("Luviyana", "0912931993", false, true,
"215150607111020", 3.8);
MahasiswaFilkom mhs2 = new
MahasiswaFilkom("Luvena", "0112122002", false, false,
"215150607111021", 4.0);
MahasiswaFilkom mhs3 = new
MahasiswaFilkom("Reinhart", "0505052005", true, false,
"215150607111022", 3.9);
ArrayList<MahasiswaFilkom> output1 = new
ArrayList<MahasiswaFilkom>();
output1.add(mhs1);
output1.add(mhs2);
output1.add(mhs3);
System.out.println();
System.out.println("====== DAFTAR MAHASISWA FILKOM
======");
for(int i=0;i<output1.size();i++){
System.out.println(output1.get(i).toString());
}
System.out.println("===================================
==");
Pekerja pkj1 = new Pekerja("Mikayla", "1506152015",
false, true, 7, 25, "1243236");

Pekerja pkj2 = new Pekerja("Admiral", "3311941994",
true, false, 9, 21, "4243561");
Pekerja pkj3 = new Pekerja("Mikenzie",
"27112212021", false, false, 8, 26, "5243125");
ArrayList<Pekerja> output2 = new
ArrayList<Pekerja>();
output2.add(pkj1);
output2.add(pkj2);
output2.add(pkj3);
System.out.println();
System.out.println("========== DAFTAR PEKERJA
==========");
for(int i=0;i<output2.size();i++){
System.out.println(output2.get(i).toString());
}
System.out.println("===================================
==");
Manajer mnj1 = new Manajer("Cornelia",
"3326134801030063", false, true,9, 25,"3243567", 3000);
Manajer mnj2 = new Manajer("Shabira",
"3326134801030063", false, false,8, 28,"2243123",
2500);
Manajer mnj3 = new Manajer("Lavina",
"3326134801030063", false,true,6, 25,"1243231", 5000);
ArrayList<Manajer> output3 = new
ArrayList<Manajer>();
output3.add(mnj1);
output3.add(mnj2);
output3.add(mnj3);
System.out.println();
System.out.println("=========== DAFTAR MANAJER
==========");
for(int i=0;i<output3.size();i++){
System.out.println(output3.get(i).toString());
}
System.out.println("===================================
==");
}
}
