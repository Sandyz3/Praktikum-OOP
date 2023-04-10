public class Penduduk {
    private String nama;
    public int pendapatan;
    public Penduduk(){}

    public Penduduk(String nama, int pendapatan) {
        this.nama = nama;
        this.pendapatan = pendapatan;
    }

    @Override
    public String toString() {
        return "Penduduk{" +
                "nama='" + nama + '\'' +
                ", pendapatan=" + pendapatan +
                '}';
    }
}
