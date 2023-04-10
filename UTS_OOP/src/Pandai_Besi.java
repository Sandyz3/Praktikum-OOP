public class Pandai_Besi extends Penduduk{
    public Pandai_Besi(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return this.pendapatan*0.06;
    }
    public double bayar(double pendapatan, double pajak){
        return this.pendapatan-pajak;
    }

    @Override
    public String
    toString() {
        return "Pandai_Besi{" +
                "pendapatan=" + bayar(pendapatan,pajak()) +
                '}';
    }
}
