package javaapplication56;

public class JavaApplication56 {
    
    public static void main(String[] args) {
       
        System.out.println("Nama    : Luvena Cornelia");
        System.out.println("NIM     : 215150607111020");
        System.out.println("Kelas   : PTI-C \n");
        

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        System.out.println("Nama merchant, Nama produk, Harga makanan :");
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.sc.nextLine(),DataMerchant.sc.nextLine(), DataMerchant.sc.nextDouble()));
        DataMerchant.tampilData();
    }
}

