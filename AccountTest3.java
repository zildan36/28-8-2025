public class AccountTest3 {
    public static void main(String[] args) {
        ObligasiTabungan obligasi = new ObligasiTabungan (270.750, 35); 
        System.out.println("Saldo awal: " + obligasi.getSaldo());
        System.out.println("Suku bunga: " + obligasi.getSukuBunga() + "% per bulan");

        while (!obligasi.sudahJatuhTempo()) {
            obligasi.bulanBerjalan();
        }

        System.out.println("Saldo akhir setelah jatuh tempo: " + obligasi.getSaldo());
}
}
    

