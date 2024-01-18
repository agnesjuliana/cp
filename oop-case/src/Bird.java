public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound");
    }

    @Override
    public String toString() {
        return super.toString() + ", Can fly: " + canFly;
    }
}
