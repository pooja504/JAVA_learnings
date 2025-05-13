public class Cat extends Animal{
    private boolean hasTail;
    private String gender;

    public Cat(String name, boolean isMamal, boolean hasTail, String gender) {
        super(name, isMamal);
        this.hasTail = hasTail;
        this.gender = gender;
    }

    public Cat() {
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.getName()+ " " + this.isMamal() + " "+ this.hasTail + " "+ this.gender;
    }
}



