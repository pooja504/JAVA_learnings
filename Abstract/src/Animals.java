public abstract class Animals {

    private String name;
    private String sound;

    public Animals() {
    }

    public Animals(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        print();
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public abstract void walk();
    public abstract String makeSound();

    private void print(){
        System.out.println("private method");
    }

}
