public class Petani extends Penduduk{

    public Petani(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return this.pendapatan*0.12;
    }
    public double bayar(double pendapatan, double pajak){
        return this.pendapatan-pajak;
    }

    @Override
    public String toString() {
        return "Petani{" +
                "pendapatan=" + bayar(pendapatan,pajak()) +
                '}';
    }
}
