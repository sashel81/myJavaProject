package school.lesson4;
// 7. Создать класс Park с внутренним классом, с помощью объектов которого можно
//    хранить информацию об аттракционах, времени их работы и стоимость
public class HomeWorkUpp7 {
    public static void main(String[] args) {
        Park park = new Park();
        Park.atraction[] atrArr = new Park.atraction[5];
        atrArr[0] = new Park.atraction("Fly", 20.9, "10a.m-6:00p.m" );
        atrArr[1] = new Park.atraction("Galaxy", 10.0, "10a.m-8:00p.m" );
        atrArr[2] = new Park.atraction("Aerotube", 15.5, "10a.m-6:00p.m" );
        atrArr[3] = new Park.atraction("Train", 6.8, "10a.m-8:00p.m" );
        atrArr[4] = new Park.atraction("Cars", 2.0, "10a.m-6:00p.m" );
        for (Park.atraction atraction : atrArr) {
            atraction.atractionDetails();
        }
    }
}