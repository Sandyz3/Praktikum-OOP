public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAdsresss(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[Name="+this.name+",Address="+this.address+"]";
    }
}
