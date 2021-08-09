package school.lesson4;


public class Payment {
    public item item;
    private static double val = 0;


    static class item {
        private String name;
        private double price;

        item(String name, double price) {

            this.name = name;
            this.price = price;
            val = val + price;
        }

        public void itemDetails() {
            System.out.println("The price of " + name + ":" + price);
        }

    }

    Payment() {
    }

    public void paymentDetails() {
        System.out.println("Your total payment is: $" + val);
    }
}

