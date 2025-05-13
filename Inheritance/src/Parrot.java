public class Parrot extends  Animal{
    private boolean isBird;
    private String color;


    public Parrot(String name, boolean isMamal, boolean isBird, String color) {
        super(name, isMamal);
        this.isBird = isBird;
        this.color = color;
    }


    public Parrot() {
    }

    public Parrot(boolean isBird, String color) {
        this.isBird = isBird;
        this.color = color;
    }

    public boolean isBird() {
        return isBird;
    }

    public void setBird(boolean bird) {
        isBird = bird;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getName()+ " " + this.isMamal() + " "+ this.color + " "+ this.isBird();
    }
}
