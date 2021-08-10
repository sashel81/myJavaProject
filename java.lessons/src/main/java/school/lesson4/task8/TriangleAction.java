package school.lesson4.task8;

public interface TriangleAction {
    default double areaCounter(double a, double b, double c) {
        double semPer = (a + b + c) / 2;
        return (Math.sqrt((semPer * (semPer - a) * (semPer - b) * (semPer - c))));
    }

    default double perimeterCounter(double a, double b, double c) {
        return (a + b + c);
    }

}
