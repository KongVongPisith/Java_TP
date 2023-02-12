package KONG_VONGPISITH_e20190457.Exercise02;

public class Discount {
    private double cost;
    private double discount;
    private double total_price;

    public Discount(double cost) {
        this.cost = cost;
    }

    public void discount_price(double dis_price) {
        discount = (cost * dis_price / 100);
        total_price = cost - discount;
        System.out.println("\n\n     Total cost: " + cost + " $");
        System.out.println("       Discount: " + dis_price + " %");
        System.out.println(" Total discount: " + discount + " $");
        System.out.println("--------------------------");

        System.out.println("Total payment: " + total_price + " $");
    }

}
