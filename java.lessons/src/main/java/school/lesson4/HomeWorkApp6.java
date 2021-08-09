package school.lesson4;



// 6. Создать класс Payment с внутренним классом, с помощью объектов которого
//        можно сформировать покупку из нескольких товаров.
public class HomeWorkApp6 {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.item [] itemArr = new Payment.item[2];
        itemArr[0] = new Payment.item("Skirt", 200.9);
        itemArr[1] = new Payment.item("Shorts", 390.9);

for(Payment.item item : itemArr) {
    item.itemDetails();
}
        payment.paymentDetails();
    }
}
