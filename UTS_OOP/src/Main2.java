public class Main2 {
    public static void main(String[] args) {
        Website website = new Website();
        Account a = website.addAccount();
        Account b = website.addAccount();
        System.out.println(a);
        System.out.println(b);
        website.login();
        website.login();
    }
}
