package school.lesson4;

public class Rectangle implements RectangleAction {
        String borderCol;
        String fillCol;
        double sideA;
        double sideB;

        public Rectangle(String borderCol, String fillCol, double sideA, double sideB) {
            this.borderCol = borderCol;
            this.fillCol = fillCol;
            this.sideA = sideA;
            this.sideB = sideB;

        }

    public String getBorderCol() {
        return borderCol;
    }

    public String getFillCol() {
        return fillCol;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
    public void info() {
        System.out.println("Периметр фигури: " + perimeterCounter(sideA,sideB) + "  Площадь : " + areaCounter(sideA,sideB) + "  Цвет границ:  " + getFillCol() + " Цвет заливки:  " + getBorderCol());
    }

}

