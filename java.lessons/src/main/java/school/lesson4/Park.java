package school.lesson4;

public class Park {
   static class atraction {
        String name;
        Double price;
        String time;

        public atraction(String name, Double price, String time) {
            this.name = name;
            this.price = price;
            this.time = time;
        }
        public void atractionDetails() {
            System.out.println("The price of " + name + ":" + price+ ". The time of work:"+ time);
        }
    }
}
