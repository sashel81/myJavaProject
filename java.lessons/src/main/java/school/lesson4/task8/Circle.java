package school.lesson4.task8;

public class Circle implements CircleAction {
    String borderCol;
    String fillCol;
    double radius;


    public Circle(String borderCol, String fillCol, double radius) {
        this.borderCol = borderCol;
        this.fillCol = fillCol;
        this.radius = radius;

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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void info() {
        System.out.println("Периметр фигури: " + perimeterCounter(radius) + "  Площадь : " + areaCounter(radius) + "  Цвет границ:  " + getFillCol() + "  Цвет заливки:  " + getBorderCol());
    }
}

