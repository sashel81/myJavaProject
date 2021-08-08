package school.lesson4;

public class Plate {
        private static int food;
        public Plate(int food) {
            this.food = food;
        }
        public void info() {
            System.out.println("plate: " + food);
        }

    public static int getFood() {
        return food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood(int t) {
        this.food +=t;
        System.out.println("В миску добавили " + t + " корма");
    }

   }
