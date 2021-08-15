package school.lesson6;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

    public int getJ() {
        return j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }
}