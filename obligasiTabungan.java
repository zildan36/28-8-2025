public class ObligasiTabungan {
    private double jumlah;     // jumlah uang yang dibeli
    private int termin;        // dalam bulan
    private double sukuBunga;  // bunga per bulan (%)

    public ObligasiTabungan(double jumlah, int termin) {
        if (termin < 1 || termin > 60) {
            throw new IllegalArgumentException("Termin harus antara 1 sampai 60 bulan.");
        }
        this.jumlah = jumlah;
        this.termin = termin;
        this.sukuBunga = tentukanBunga(termin);
    }

    private double tentukanBunga(int termin) {
        if (termin <= 11) {
            return 0.005; // 0.5% per bulan
        } else if (termin <= 23) {
            return 0.01;  // 1.0% per bulan
        } else if (termin <= 35) {
            return 0.015; // 1.5% per bulan
        } else if (termin <= 47) {
            return 0.02;  // 2.0% per bulan
        } else {
            return 0.025; // 7.0% per bulan
        }
    }

    public void bulanBerjalan() {
        if (termin > 0) {
            jumlah += jumlah * sukuBunga;
            termin--;
        }
    }

    public boolean sudahJatuhTempo() {
        return termin == 0;
    }

    public double getSaldo() {
        return jumlah;
    }

    public int getTermin() {
        return termin;
    }

    public double getSukuBunga() {
        return sukuBunga * 100; // persen
    }
}
