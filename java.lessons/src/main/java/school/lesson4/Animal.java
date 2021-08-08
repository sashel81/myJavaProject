package school.lesson4;

public class Animal {
       String name;
       private static int counter;
        public Animal (String name){
            this.name = name;
            counter ++ ;
        }
    public static int getNumberOfAnimals() {
        return counter;
    }

     void run(int dist) {
        System.out.println("Животное " + name + " пробежало  " + dist + "  м");
    }


     void swim(int dist) {
        System.out.println("Животное " + name + " проплило  " + dist + "  м");
    }

}
