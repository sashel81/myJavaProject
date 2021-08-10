package school.lesson4.task8;

public class Triangle implements TriangleAction {
    String borderCol;
    String fillCol;
    double sideA;
    double sideB;
    double sideC;

    public Triangle(String borderCol, String fillCol, double sideA, double sideB, double sideC) {
        this.borderCol=borderCol;
        this.fillCol=fillCol;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getBorderCol() {
        return borderCol;
    }

    public void setBorderCol(String borderCol) {
        this.borderCol = borderCol;
    }

    public String getFillCol() {
        return fillCol;
    }

    public void setFillCol(String fillCol) {
        this.fillCol = fillCol;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    public void info() {
        System.out.println("Периметр фигури: " + perimeterCounter(sideA,sideB,sideC) + "  Площадь : " + areaCounter(sideA,sideB,sideC) + "  Цвет границ:  " + getFillCol() + " Цвет заливки:  " + getBorderCol());
    }
}
