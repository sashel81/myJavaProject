package school.lesson4;

public interface RectangleAction {

    default double areaCounter(double a, double b) {
        return a * b;
    }

    default double perimeterCounter(double a, double b) {
        return (a + b) * 2;
    }

}

