public class Pedagang extends Penduduk{
    public Pedagang(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return this.pendapatan*0.03;
    }
    public double bayar(double pendapatan, double pajak){
        return this.pendapatan-pajak;
    }

    @Override
    public String toString() {
        return "Pedagang{" +
                "pendapatan=" + bayar(pendapatan,pajak()) +
                '}';
    }
}
