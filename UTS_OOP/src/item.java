public class item {
    private double harga;
    private String nama;
    private String rank;
    private double quantity;

    public item(double harga, String nama, String rank, double quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public static void seeAllItem(){
        Double totalValue =
        System.out.println("Your item backpack worth: " + totalValue + " with items as listed below:");
    }
    public static void seeAllItem() {
        System.out.println("Your item worth " + totalValue + " with list item:");
            if (itemCount > 0) {
                System.out.println("\t" + itemCount + " " + itemType + " " + getItemName(itemType) + " worth " + itemTotalPrice);
            }
        }

}
