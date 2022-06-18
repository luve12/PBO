package polimorfisme;
public class Main {

    public static void main(String[] args) {
    
    System.out.println("Nama : Luvena Cornelia");
    System.out.println("NIM  : 215150607111020\n");
      

    System.out.println("DATA PEGAWAI TETAP");
        Pegawai tetap1 = new PegawaiTetap("Mikayla", "21511506201515", 10000000.0);
            System.out.println(tetap1.toString());
        Pegawai tetap2 = new PegawaiTetap("Shabira", "21510112200202", 7000000.0);
            System.out.println(tetap2.toString());
        Pegawai tetap3 = new PegawaiTetap("Admiral", "21511410200303", 15000000.0);
            System.out.println(tetap3.toString());

        System.out.println("\nDATA PEGAWAI HARIAN");
            Pegawai harian1 = new PegawaiHarian("Reinhart", "21515061012003", 8000.0, 12);
        System.out.println(harian1.toString());
            Pegawai harian2 = new PegawaiHarian("Immanuel", "21515062022001", 9500.0, 30);
        System.out.println(harian2.toString());
            Pegawai harian3 = new PegawaiHarian("Talahatu", "21515062042000", 7500.0, 45);
        System.out.println(harian3.toString());

        System.out.println("\nDATA SALES");
            Pegawai sales1 = new Sales("Mikenzie", "215171111503200", 56, 75000.0);
        System.out.println(sales1.toString());
            Pegawai sales2 = new Sales("Samuel", "215171111407199", 75, 75000.0);
        System.out.println(sales2.toString());
            Pegawai sales3 = new Sales("Winarko", "215171110811201", 40, 75000.0);
        System.out.println(sales3.toString());
    }
}
