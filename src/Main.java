public class Main {
    public static void main(String[] args) {

        TV tele1 = new TV();
        tele1.producer = "Samsung";
        tele1.model = "A50020";
        tele1.price = 4999.99;
        tele1.call = 52;
        tele1.isSmart = true;

        TV tele2 = new TV();
        tele2.producer = "Philips";
        tele2.model = "20010a";
        tele2.price = 3500.55;
        tele2.call = 48;
        tele2.isSmart = false;

        tele1.printInfo();
        tele2.printInfo();
    }
}
