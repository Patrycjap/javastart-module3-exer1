public class Main {
    public static void main(String[] args) {

        TV tele1 = new TV("Samsung", "A50020", 52, true, 4999.99);
        TV tele2 = new TV("Philips", "20010a", 48, false, 3500.55);

        tele1.printInfo();
        tele2.printInfo();
    }
}
