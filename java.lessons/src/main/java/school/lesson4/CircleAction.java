package school.lesson4;

public interface CircleAction {

    default double areaCounter(double radius){
        return 3.14*radius*radius;}
    default double perimeterCounter(double radius) {
        return 2*3.14*radius; }

}
