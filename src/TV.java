public class TV {

    String producer;
    String model;
    int call;
    boolean isSmart;
    double price;

    TV(String prod, String mod, int ca, boolean smart, double pr) {
        producer = prod;
        model = mod;
        call = ca;
        isSmart = smart;
        price = pr;
    }

    void printInfo() {
        System.out.println(producer + " " + model + ", " + call + " call" + ", " + "Smart:" + isSmart + ", " + price + " PLN");
    }
}