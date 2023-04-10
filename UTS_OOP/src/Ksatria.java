public class Ksatria extends Penduduk{
    public Ksatria(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return this.pendapatan*0.18;
    }
    public double bayar(double pendapatan, double pajak){
        return this.pendapatan-pajak;
    }

    @Override
    public String toString() {
        return "Ksatria{" +
                "pendapatan=" + bayar(pendapatan,pajak()) +
                '}';
    }
}
