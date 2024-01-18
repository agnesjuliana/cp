public class Mammal extends Animal {
    private boolean isWarmBlooded;

    public Mammal(String name, int age, boolean isWarmBlooded) {
        super(name, age);
        this.isWarmBlooded = isWarmBlooded;
    }

    public boolean isWarmBlooded() {
        return isWarmBlooded;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }

    @Override
    public String toString() {
        return super.toString() + ", Warm-blooded: " + isWarmBlooded;
    }
}
