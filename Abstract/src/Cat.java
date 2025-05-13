public class Cat extends Animals {

    public Cat() {
    }

    public Cat(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void walk() {
        System.out.println("Cat walk");

    }

    @Override
    public String makeSound() {
        return getSound();
    }

}
