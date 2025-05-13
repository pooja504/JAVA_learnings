public class Dog extends Animals{

    private String type;

    public Dog() {
    }

    public Dog(String name, String sound, String type) {
        super(name, sound);
        this.type=type;
    }

    @Override
    public void walk() {
        System.out.println("i walk like dog");
    }

    @Override
    public String makeSound() {
        return getSound() +type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return "poojuu";
    }
}
