public class App {
    public static void main(String[] args) {
        Mammal dog = new Mammal("Dog", 3, true);
        Bird sparrow = new Bird("Sparrow", 1, true);

        System.out.println(dog);
        dog.makeSound();

        System.out.println();

        System.out.println(sparrow);
        sparrow.makeSound();
    }
}
