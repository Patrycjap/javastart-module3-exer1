public class TV {

    String producer;
    String model;
    int call;
    boolean isSmart;
    double price;


    void printInfo() {
        System.out.println(producer + " " + model + ", " + call + " call" + ", " + "Smart:" + isSmart + ", " + price + " PLN");
    }
}